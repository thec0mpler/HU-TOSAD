package org.hu.brg.generator.oracle;

import org.hu.brg.generator.DatabaseType;
import org.hu.brg.generator.Generator;
import org.hu.brg.model.BusinessRule;
import org.hu.brg.model.business_rule.TupleCompare;

public class TupleCompareGenerator extends Generator {
    public TupleCompareGenerator() {
        super(DatabaseType.Oracle);
    }

    @Override
    public boolean canHandle(BusinessRule businessRule) {
        return businessRule instanceof TupleCompare;
    }

    @Override
    public String getOutput(BusinessRule businessRule) {
        TupleCompare rule = (TupleCompare) businessRule;

        String[] comparisonOperators = {"!=", "=", "^=", "<>", ">", ">=", "<="};

        String result = "";
        for (String op : comparisonOperators) {
            if (op.equals(rule.getOperator())) {
                result = rule.getOperator();
            }
        }

        String sql = "ALTER TABLE " + rule.getTable() + "\n" +
                "ADD CONSTRAINT " + rule.getConstraint() + "\n" +
                "CHECK (" + rule.getFirstAttribute() + " " + rule.getOperator() + " " + rule.getSecondAttribute() + ");";

        if (result.equals("")) {
            return "/*** \n" +
                    "Failed SQL generation on " + rule.getCode() + " with the following ID: " + rule.getId() + ".\n" +
                    "***/";
        } else {
            return sql;
        }
    }
}
