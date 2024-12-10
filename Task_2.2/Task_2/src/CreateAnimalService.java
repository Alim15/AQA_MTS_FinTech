import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public interface CreateAnimalService {
    default List<AbstractAnimal> createAnimals() {
        List<AbstractAnimal> animals = new ArrayList<>();
        Random random = new Random();
        while (animals.size() < 10) {
            AbstractAnimal animal = generateRandomAnimal();
            animals.add(animal);
            System.out.println("Created (while): " + animal.getName() + ", " + animal.getBreed());
        }
        return animals;
    }

    AbstractAnimal generateRandomAnimal();
}

