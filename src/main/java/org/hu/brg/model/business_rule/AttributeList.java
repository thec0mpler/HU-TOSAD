package org.hu.brg.model.business_rule;

import org.hu.brg.model.BusinessRule;

/**
 * Created by lap on 28-1-2017.
 */
public class AttributeList extends BusinessRule {
    private String table;
    private String constraint;
    private String attribute;
    private boolean negation;
    private String[] list;

    public AttributeList(int id, String ruleName, String table, String constraint, String attribute, boolean negation, String[] list) {
        super(id, ruleName, table);
        code = "ALIS";
        this.table = table;
        this.constraint = constraint;
        this.attribute = attribute;
        this.negation = negation;
        this.list = list;
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

    @Override
    public String getAttribute() {
        return attribute;
    }

    @Override
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public boolean isNegation() {
        return negation;
    }

    public void setNegation(boolean negation) {
        this.negation = negation;
    }

    public String[] getList() {
        return list;
    }

    public void setList(String[] list) {
        this.list = list;
    }

    @Override
    public String getSQL() {
        String result = "";
        if (!negation) {
            result = " NOT";
        } else {
            result = "";
        }

        String orderedList = "";
        for (String value : list) {
            orderedList += ("'"+value+"'" + ", ");
        }
        orderedList = orderedList.substring(0, orderedList.length() - 2);

        String sql = "ALTER TABLE " + table + "\n" +
                "ADD CONSTRAINT " + constraint + "\n" +
                "CHECK (" + attribute + result + " IN (" + orderedList + "));";
        return sql;
    }
}
