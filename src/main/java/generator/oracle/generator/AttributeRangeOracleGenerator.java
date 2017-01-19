package generator.oracle.generator;

import generator.DatabaseType;
import generator.Generator;
import model.BusinessRule;
import model.business_rule.AttributeRange;

public class AttributeRangeOracleGenerator extends Generator {
    public AttributeRangeOracleGenerator() {
       super(DatabaseType.Oracle);
    }

    @Override
    public boolean canHandle(BusinessRule businessRule) {
        return businessRule instanceof AttributeRange;
    }

    @Override
    public String getOutput(BusinessRule businessRule) {
        return "...OUTPUT ATTRIBUTE RANGE BUSINESS RULE...";
    }
}
