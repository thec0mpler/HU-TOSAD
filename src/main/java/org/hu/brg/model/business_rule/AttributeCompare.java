package org.hu.brg.model.business_rule;

import org.hu.brg.model.BusinessRule;

/**
 * Created by lap on 27-1-2017.
 */
public class AttributeCompare extends BusinessRule{
    //private String table;
    private String attribute;
    private String constraint;
    private String operator;
    private double value;

    public AttributeCompare(int id, String ruleName,
                            String table, String constraint, String attribute,
                            String operator, double value) {
        super(id, ruleName, table);
        code = "ACMP";
        this.attribute = attribute;
        this.constraint = constraint;
        this.operator = operator;
        this.value = value;
    }

    public String getConstraint() {
        return constraint;
    }

    public void setConstraint(String constraint) {
        this.constraint = constraint;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String getSQL() {
        String[] comparisonOperators = {"=", "!=", "^=", "<>", ">", ">=", "<="};

        String result = "";
        for (String op : comparisonOperators) {
            if (op.equals(operator)) {
                result = operator;
            }
        }

        String sql = "ALTER TABLE " + super.getTable() + "\n" +
                "ADD CONSTRAINT " + constraint + "\n" +
                "CHECK (" + attribute + " " + operator + " " + value + ");";

        if (result.equals("")) {
            return "Failed SQL generation.";
        } else {
            return sql;
        }
    }
}
