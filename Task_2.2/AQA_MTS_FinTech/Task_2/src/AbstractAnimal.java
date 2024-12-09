import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
public abstract class AbstractAnimal implements Animal {
    protected String breed;
    protected String name;
    protected double cost;
    protected String character;
    protected LocalDate birthDate;

    public AbstractAnimal(String breed, String name, Double cost, String character, LocalDate birthDate) {
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
        this.birthDate = birthDate;
    }

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCharacter() {
        return character;
    }

    @Override
    public Double getCost() {
        return cost;
    }

    @Override
    public LocalDate getBirthDate() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractAnimal that = (AbstractAnimal) o;
        return Objects.equals(breed, that.breed) && Objects.equals(name, that.name) && Objects.equals(cost, that.cost) && Objects.equals(character, that.character) && Objects.equals(birthDate, that.birthDate);
    }
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj == null || getClass() != obj.getClass()) return false;
//        AbstractAnimal that = (AbstractAnimal) obj;
//        return Objects.equals(breed, that.breed) &&
//                Objects.equals(name, that.name) &&
//                Objects.equals(cost, that.cost) &&
//                Objects.equals(character, that.character) &&
//                Objects.equals(birthDate, that.birthDate);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(breed, name, cost, character, birthDate);
    }
}
