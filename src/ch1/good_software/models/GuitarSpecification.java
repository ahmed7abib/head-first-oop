package ch1.good_software.models;

import ch1.good_software.models.enums.Builder;
import ch1.good_software.models.enums.Model;
import ch1.good_software.models.enums.Type;
import ch1.good_software.models.enums.Wood;

public class GuitarSpecification {

    private final Builder builder;
    private final Type type;
    private final Model model;
    private final Wood top;
    private final Wood back;
    private final String stringsNum;

    public GuitarSpecification(Builder builder, Type type, Model model, Wood top, Wood back, String stringsNum) {
        this.builder = builder;
        this.type = type;
        this.model = model;
        this.top = top;
        this.back = back;
        this.stringsNum = stringsNum;
    }

    public Builder getBuilder() {
        return builder;
    }

    public Type getType() {
        return type;
    }

    public Model getModel() {
        return model;
    }

    public Wood getTop() {
        return top;
    }

    public Wood getBack() {
        return back;
    }

    public String getStringsNum() {
        return stringsNum;
    }

    public boolean isMatch(GuitarSpecification specification) {
        return getBuilder().getValue().equals(specification.getBuilder().getValue())
                && getType().getValue().equals(specification.getType().getValue())
                && getModel().getValue().equals(specification.getModel().getValue())
                && getTop().getValue().equals(specification.getTop().getValue())
                && getBack().getValue().equals(specification.getBack().getValue())
                && getStringsNum().equals(specification.getStringsNum());
    }
}