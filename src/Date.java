import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.spi.LocaleServiceProvider;

public class Date {
    public Date(){
    }

    public void date(){
        LocalDate today = LocalDate.now();
        System.out.println(today);
    }
}
