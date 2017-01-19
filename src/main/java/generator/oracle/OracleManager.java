package generator.oracle;

import generator.DatabaseType;
import generator.Manager;
import generator.oracle.generator.AttributeRangeOracleGenerator;

public class OracleManager extends Manager {
    public OracleManager() {
        super(DatabaseType.Oracle);
    }

    @Override
    protected void addGenerators() {
        this.addGenerator(new AttributeRangeOracleGenerator());
    }
}
