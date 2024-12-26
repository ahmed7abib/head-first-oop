package ch1.good_software.models.enums;

public enum Type {

    TYPE_ONE("t_1"),
    TYPE_TWO("t_2");

    private final String value;

    Type(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

