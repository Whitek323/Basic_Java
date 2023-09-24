import model.Dice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate first = LocalDate.of(2022,12,24);
        System.out.println(first.until(today, ChronoUnit.DAYS));

    }

}
