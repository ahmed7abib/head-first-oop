package ch1.good_software.models.enums;

public enum Builder {

    BUILDER_ONE("b_1"),
    BUILDER_TWO("b_2");

    private final String value;

    Builder(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
