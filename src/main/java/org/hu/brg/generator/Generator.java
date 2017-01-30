package org.hu.brg.generator;

import org.hu.brg.model.BusinessRule;

public abstract class Generator {
    private DatabaseType databaseType;

    protected Generator(DatabaseType databaseType) {
        this.databaseType = databaseType;
    }

    DatabaseType getDatabaseType() {
        return databaseType;
    }




    public abstract boolean canHandle(BusinessRule businessRule);

    public abstract String getOutput(BusinessRule businessRule);
}
