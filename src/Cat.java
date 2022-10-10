import java.io.Serializable;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Cat implements Serializable {
    private String name;
    private String breed;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(final String breed) {
        this.breed = breed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(final double weight) {
        this.weight = weight;
    }

    public Cat(final String name, final String breed, final double weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", weight=" + weight +
                '}';
    }
}
