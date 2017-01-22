package org.hu.brg.generator;

import org.hu.brg.model.BusinessRule;

import java.util.ArrayList;
import java.util.List;

public abstract class Manager {
    private DatabaseType databaseType;
    private List<Generator> generators = new ArrayList<>();

    protected Manager(DatabaseType databaseType) {
        this.setDatabaseType(databaseType);
        this.addGenerators();
    }

    protected abstract void addGenerators();

    private DatabaseType getDatabaseType() {
        return databaseType;
    }

    private void setDatabaseType(DatabaseType databaseType) {
        this.databaseType = databaseType;
    }

    protected void addGenerator(Generator generator) {
        if (this.getDatabaseType() == generator.getDatabaseType()) {
            this.generators.add(generator);
        }
    }

    public String generate(List<BusinessRule> businessRules) throws Exception {
        String output = "";

        for (BusinessRule businessRule : businessRules) {
            Generator generator = this.selectGenerator(businessRule);

            if (generator != null) {
                output += generator.getOutput(businessRule);
            }
        }

        return output;
    }

    private Generator selectGenerator(BusinessRule businessRule) {
        for (Generator generator : generators) {
            if (generator.canHandle(businessRule))
                return generator;
        }

        return null;
    }
}
