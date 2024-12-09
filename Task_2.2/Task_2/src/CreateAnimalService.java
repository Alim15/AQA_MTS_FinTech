import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public interface CreateAnimalService {
    List<AbstractAnimal> createAnimals();
}
