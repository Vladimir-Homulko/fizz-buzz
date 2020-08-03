package ua.com.alevel;

import java.util.ArrayList;
import java.util.List;

public class FizzBazz implements fizzBazz {

    @Override
    public void fizzBazz(List<Integer> allInt) {

        for (int i = 0; i < allInt.size(); i++) {
            if (allInt.get(i) % 2 == 0) {
                System.out.println("fizz");
            }
            if (allInt.get(i) % 3 == 0) {
                System.out.println("bazz");
            }
            if (allInt.get(i) % 2 == 0 && allInt.get(i) % 3 == 0) {
                System.out.println("fizzbazz");
            }
            if (!(allInt.get(i) % 2 == 0) && !(allInt.get(i) % 3 == 0)) {
                System.out.println("--------------------------");
            }
        }
    }
}
