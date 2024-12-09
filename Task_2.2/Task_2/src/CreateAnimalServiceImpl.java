import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class CreateAnimalServiceImpl implements CreateAnimalService {
    @Override
    public List<AbstractAnimal> createAnimals() {
        List<AbstractAnimal> animals = new ArrayList<>();
        Random random = new Random();
        while (animals.size() < 10) {
            animals.add(generateRandomAnimal());
        }
        return animals;
    }

    private AbstractAnimal generateRandomAnimal() {
        Random random = new Random();
        String[] breeds = {"Lion", "Wolf", "Dog", "Cat"};
        String[] characters = {"Aggressive", "Calm", "Playful", "Lazy"};
        String breed = breeds[random.nextInt(breeds.length)];
        String name = "Animal" + random.nextInt(100);
        Double cost = 100 + random.nextDouble() * 900;
        String character = characters[random.nextInt(characters.length)];
        LocalDate birthDate = LocalDate.of(random.nextInt(20) + 2000, random.nextInt(12) + 1, random.nextInt(28) + 1);
        return null;
    }

//    public CreateAnimalServiceImpl() {
////
////    }
}
