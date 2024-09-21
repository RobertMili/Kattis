import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Patuljci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = 9;
        int Sum = 0;
        int firstRemoveNumber = 0;
        int secondRemoveNumber = 0;

        List<Integer> number = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            number.add(sc.nextInt());
        }

        for (int i = 0; i < number.size(); i++) {
            Sum += number.get(i);
        }

        int fakeSum = Sum - 100;



        boolean found = false;
        for (int i = 0; i < length && !found; i++) {
            for (int j = i + 1; j < length && !found ; j++) {

                if (number.get(i) + number.get(j) == fakeSum) {
                    firstRemoveNumber = number.get(i);
                    secondRemoveNumber = number.get(j);

                    found = true;
                }
            }
        }

        number.remove(Integer.valueOf(firstRemoveNumber));
        number.remove(Integer.valueOf(secondRemoveNumber));

        for (int i = 0; i < 7; i++) {
            System.out.println(number.get(i));
        }
    }
}
