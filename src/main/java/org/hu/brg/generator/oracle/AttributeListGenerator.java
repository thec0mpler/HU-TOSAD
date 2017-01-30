package org.hu.brg.generator.oracle;

import org.hu.brg.generator.DatabaseType;
import org.hu.brg.generator.Generator;
import org.hu.brg.model.BusinessRule;
import org.hu.brg.model.business_rule.AttributeList;

public class AttributeListGenerator extends Generator {
    public AttributeListGenerator() {
        super(DatabaseType.Oracle);
    }

    @Override
    public boolean canHandle(BusinessRule businessRule) {
        return businessRule instanceof AttributeList;
    }

    @Override
    public String getOutput(BusinessRule businessRule) {
        if (canHandle(businessRule)) {

            AttributeList rule = (AttributeList) businessRule;

            String result = "";
            if (!rule.isNegation()) {
                result = " NOT";
            } else {
                result = "";
            }

            String orderedList = "";
            for (String value : rule.getList()) {
                orderedList += ("'"+value+"'" + ", ");
            }
            orderedList = orderedList.substring(0, orderedList.length() - 2);

            String sql = "ALTER TABLE " + rule.getTable() + "\n" +
                    "ADD CONSTRAINT " + rule.getConstraint() + "\n" +
                    "CHECK (" + rule.getAttribute() + result + " IN (" + orderedList + "));";
            return sql;
        }
        return "Is no instance of BusinessRule";
    }
}
