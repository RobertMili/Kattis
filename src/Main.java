import java.util.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firsNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        // Get the current time
        LocalTime currentTime = LocalTime.of(firsNumber, secondNumber);

        var minustTIme = currentTime.minusMinutes(45);

        System.out.println(minustTIme.getHour());
        System.out.println(minustTIme.getMinute());
    }
}

