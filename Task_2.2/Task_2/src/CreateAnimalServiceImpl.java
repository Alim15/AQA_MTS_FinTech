import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class CreateAnimalServiceImpl implements CreateAnimalService {
    @Override
    public AbstractAnimal generateRandomAnimal() {
        Random random = new Random();
        String[] breeds = {"Lion", "Wolf", "Dog", "Cat"};
        String[] characters = {"Aggressive", "Calm", "Playful", "Lazy"};
        String breed = breeds[random.nextInt(breeds.length)];
        String name = "Animal" + random.nextInt(100);
        Double cost = 100 + random.nextDouble() * 900;
        String character = characters[random.nextInt(characters.length)];
        LocalDate birthDate = LocalDate.of(random.nextInt(20) + 2000, random.nextInt(12) + 1, random.nextInt(28) + 1);
        return random.nextBoolean() ? new Predator(breed, name, cost, character, birthDate) : new Pet(breed, name, cost, character, birthDate);
    }

    /**
     * Перегруженный метод для создания N животных с использованием цикла for.
     */
    public List<AbstractAnimal> createAnimals(int n) {
        List<AbstractAnimal> animals = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            AbstractAnimal animal = generateRandomAnimal();
            animals.add(animal);
            System.out.println("Created (for): " + animal.getName() + ", " + animal.getBreed());
        }
        return animals;
    }

    /**
     * Переопределенный метод для создания N животных с использованием цикла do-while.
     */
    public List<AbstractAnimal> createAnimalsUsingDoWhile(int n) {
        List<AbstractAnimal> animals = new ArrayList<>();
        int count = 0;
        do {
            AbstractAnimal animal = generateRandomAnimal();
            animals.add(animal);
            System.out.println("Created (do-while): " + animal.getName() + ", " + animal.getBreed());
            count++;
        } while (count < n);
        return animals;
    }
}


//    public CreateAnimalServiceImpl() {
////
////    }

