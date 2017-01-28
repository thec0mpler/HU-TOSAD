package org.hu.brg.model.business_rule;

import org.hu.brg.model.BusinessRule;

public class AttributeRange extends BusinessRule {
    private String table;
    private String constraintName;
    private String column;
    private boolean negation;
    private double start;
    private double end;

    public AttributeRange(String table, String constraintName, String column, boolean negation, double start, double end) {
        this.table = table;
        this.constraintName = constraintName;
        this.column = column;
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
    public String getColumn() {
        return column;
    }

    @Override
    public void setColumn(String column) {
        this.column = column;
    }

    @Override
    public String getSQL() {
        String test = "";
        if (!negation) {
            test = "NOT ";
        } else {
            test = "";
        }

        String sql = "ALTER TABLE " + table + "\n" +
                "ADD CONSTRAINT " + constraintName + "\n" +
                "CHECK " + column + " " + test + "BETWEEN " + start + " AND " + end;
        return sql;
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