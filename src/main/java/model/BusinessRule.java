package model;

public class BusinessRule {
    private String code;
    private String name;
    private String table;
    private String column;
    private BusinessRuleType type;

    public BusinessRule() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public BusinessRuleType getType() {
        return type;
    }

    public void setType(BusinessRuleType type) {
        this.type = type;
    }
}