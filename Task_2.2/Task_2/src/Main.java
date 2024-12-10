import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        CreateAnimalServiceImpl createService = new CreateAnimalServiceImpl();

        // Вызов метода по умолчанию (while)
        System.out.println("Метод (while):");
        List<AbstractAnimal> animalsFromWhile = createService.createAnimals();

        // Вызов перегруженного метода (for)
        System.out.println("Метод (for):");
        List<AbstractAnimal> animalsFromFor = createService.createAnimals(5);

        // Вызов метода с использованием do-while
        System.out.println("Переопределенный метод через @Override (do-while):");
        List<AbstractAnimal> animalsFromDoWhile = createService.createAnimalsUsingDoWhile(3);
    }
}