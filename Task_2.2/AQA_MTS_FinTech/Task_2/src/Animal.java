import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
public interface Animal {
    String getBreed();
    String getName();
    Double getCost();
    String getCharacter();
    LocalDate getBirthDate();


}
