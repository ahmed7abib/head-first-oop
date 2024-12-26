package ch1.good_software.models.enums;

public enum Model {

    MODEL_ONE("m_1"),
    MODEL_TWO("m_2");

    private final String value;

    Model(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
