package ch1.good_software.models.enums;

public enum Wood {

    TOP_WOOD("top"),
    BACK_WOOD("back");

    private final String value;

    Wood(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

