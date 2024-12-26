package ch1.good_software;

import ch1.good_software.models.Guitar;
import ch1.good_software.models.GuitarSpecification;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private final ArrayList<Guitar> guitars = new ArrayList<>();

    public void addGuitar(Guitar guitar) {
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }

        return null;
    }

    public List<Guitar> search(GuitarSpecification specification) {
        ArrayList<Guitar> searchedGuitar = new ArrayList<>();

        for (Guitar guitar : guitars) {
            if (guitar.getGuitarSpecification().isMatch(specification)) {
                searchedGuitar.add(guitar);
            }
        }

        return searchedGuitar;
    }
}
