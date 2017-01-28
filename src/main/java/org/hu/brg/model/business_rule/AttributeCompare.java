package org.hu.brg.model.business_rule;

import org.hu.brg.model.BusinessRule;

/**
 * Created by lap on 27-1-2017.
 */
public class AttributeCompare extends BusinessRule{
    private String table;
    private String constraint;
    private String attribute;
    private String operator;
    private double value;

    public AttributeCompare(String table, String constraint, String attribute, String operator, double value) {
        this.table = table;
        this.constraint = constraint;
        this.attribute = attribute;
        this.operator = operator;
        this.value = value;
    }

    @Override
    public String getTable() {
        return table;
    }

    @Override
    public void setTable(String table) {
        this.table = table;
    }

    public String getConstraint() {
        return constraint;
    }

    public void setConstraint(String constraint) {
        this.constraint = constraint;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
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

        String sql = "ALTER TABLE " + table + "\n" +
                "ADD CONSTRAINT " + constraint + "\n" +
                "CHECK " + attribute + " " + operator + " " + value;

        if (result.equals("")) {
            return "Failed SQL generation.";
        } else {
            return sql;
        }
    }
}
