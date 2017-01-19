package model;

public class Operator {
    private int id;
    private String code;
    private String name;
    private String displayCode;

    public Operator() {
    }

    public Operator(String code, String name, String displayCode) {
        this.setCode(code);
        this.setName(name);
        this.setDisplayCode(displayCode);
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
        this.code = code.toUpperCase();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayCode() {
        return displayCode;
    }

    public void setDisplayCode(String displayCode) {
        this.displayCode = displayCode;
    }
}
