package org.hu.brg.generator.oracle;

import org.hu.brg.generator.DatabaseType;
import org.hu.brg.generator.Generator;
import org.hu.brg.model.BusinessRule;
import org.hu.brg.model.business_rule.AttributeRange;

public class AttributeRangeGenerator extends Generator {
    public AttributeRangeGenerator() {
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
