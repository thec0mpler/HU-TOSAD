package org.hu.brg.model;

public abstract class BusinessRule {
    private int id;
    protected String code;
    private String ruleName;
    private String table;
    private String attribute;
    private BusinessRuleType type;

    public BusinessRule(int id, String ruleName, String table) {
        this.id = id;
        this.ruleName = ruleName;
        this.table = table;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public BusinessRuleType getType() {
        return type;
    }

    public void setType(BusinessRuleType type) {
        this.type = type;
    }

    public abstract String getSQL();
}