package org.hu.brg.generator.oracle;

import org.hu.brg.generator.DatabaseType;
import org.hu.brg.generator.Generator;
import org.hu.brg.model.BusinessRule;
import org.hu.brg.model.business_rule.AttributeOther;

public class AttributeOtherGenerator extends Generator {
    public AttributeOtherGenerator() {
        super(DatabaseType.Oracle);
    }

    @Override
    public boolean canHandle(BusinessRule businessRule) {
        return businessRule instanceof AttributeOther;
    }

    @Override
    public String getOutput(BusinessRule businessRule) {
        if (canHandle(businessRule)) {

            AttributeOther rule = (AttributeOther) businessRule;

            String result = "";
            if (!rule.isNegation()) {
                result = "NOT ";
            } else {
                result = "";
            }

            String sql = "ALTER TABLE " + rule.getTable() + "\n" +
                    "ADD CONSTRAINT " + rule.getConstraint() + "\n" +
                    "CHECK (SUBSTR(" + rule.getAttribute() + ", " +
                    rule.getBeginPosition() + ", " + rule.getEndPosition() + ") " + result + "BETWEEN ('"
                    + rule.getFirstValue() + "' AND '" + rule.getSecondValue() + "');";
            return sql;
        }
        return "Is no instance of BusinessRule";
    }
}
