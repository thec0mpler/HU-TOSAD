package org.hu.brg.generator.oracle;

import org.hu.brg.generator.DatabaseType;
import org.hu.brg.generator.Manager;

public class OracleManager extends Manager {
    public OracleManager() {
        super(DatabaseType.Oracle);
    }

    @Override
    protected void addGenerators() {
        this.addGenerator(new AttributeRangeGenerator());
    }
}
