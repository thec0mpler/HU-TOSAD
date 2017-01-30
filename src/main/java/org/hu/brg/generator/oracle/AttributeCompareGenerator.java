package org.hu.brg.generator.oracle;

import org.hu.brg.generator.DatabaseType;
import org.hu.brg.generator.Generator;
import org.hu.brg.model.BusinessRule;
import org.hu.brg.model.business_rule.AttributeCompare;

public class AttributeCompareGenerator extends Generator {
    public AttributeCompareGenerator() {
        super(DatabaseType.Oracle);
    }

    @Override
    public boolean canHandle(BusinessRule businessRule) {
        return businessRule instanceof AttributeCompare;
    }

    @Override
    public String getOutput(BusinessRule businessRule) {
        AttributeCompare rule = (AttributeCompare) businessRule;

        String[] comparisonOperators = {"=", "!=", "^=", "<>", ">", ">=", "<="};

        String result = "";
        for (String op : comparisonOperators) {
            if (op.equals(rule.getOperator())) {
                result = rule.getOperator();
            }
        }

        String sql = "ALTER TABLE " + rule.getTable() + "\n" +
                "ADD CONSTRAINT " + rule.getConstraint() + "\n" +
                "CHECK (" + rule.getAttribute() + " " + rule.getOperator() + " " + rule.getValue() + ");";

        if (result.equals("")) {
            return "Failed SQL generation.";
        } else {
            return sql;
        }
    }
}
