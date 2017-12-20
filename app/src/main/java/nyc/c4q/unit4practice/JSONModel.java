package nyc.c4q.unit4practice;

import java.util.List;

/**
 * Created by yokilam on 12/20/17.
 */

public class JSONModel {
    private String name;
    private List<Pets1> Pet;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List <Pets1> getPet() {
        return Pet;
    }

    public void setPet(List <Pets1> pet) {
        Pet = pet;
    }
}
