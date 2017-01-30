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
        AttributeRange rule = (AttributeRange) businessRule;

        String test = "";
        if (!rule.isNegation()) {
            test = "NOT ";
        } else {
            test = "";
        }

        String sql = "ALTER TABLE " + rule.getTable() + "\n" +
                "ADD CONSTRAINT " + rule.getConstraintName() + "\n" +
                "CHECK (" + rule.getAttribute() + " " + test + "BETWEEN " + rule.getStart() + " AND " + rule.getEnd() + ");";
        return sql;
    }
}
