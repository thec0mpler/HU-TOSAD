package org.hu.brg.model.business_rule;

import org.hu.brg.model.BusinessRule;

public class AttributeRange extends BusinessRule {
    private String table;
    private String constraintName;
    private String attribute;
    private boolean negation;
    private double start;
    private double end;

    public AttributeRange(int id, String ruleName, String table, String constraintName,
                          String attribute, boolean negation, double start, double end) {
        super(id, ruleName, table);
        code = "ARNG";
        this.table = table;
        this.constraintName = constraintName;
        this.attribute = attribute;
        this.negation = negation;
        this.start = start;
        this.end = end;
    }

    @Override
    public String getTable() {
        return table;
    }

    @Override
    public void setTable(String table) {
        this.table = table;
    }

    public String getConstraintName() {
        return constraintName;
    }

    public void setConstraintName(String constraintName) {
        this.constraintName = constraintName;
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

    public double getStart() {
        return start;
    }

    public void setStart(double start) {
        this.start = start;
    }

    public double getEnd() {
        return end;
    }

    public void setEnd(double end) {
        this.end = end;
    }
}