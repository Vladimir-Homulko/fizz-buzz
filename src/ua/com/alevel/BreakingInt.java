package ua.com.alevel;

import java.util.ArrayList;
import java.util.List;

public class BreakingInt implements BreakInt {

    @Override
    public List<Integer> breakingUpInt(int num) {

        String n = Integer.toString(num);
        char[] charArray = n.toCharArray();
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < charArray.length; i++) {
            int c = Character.getNumericValue(charArray[i]);
            numList.add(c);
        }
        return numList;
    }
}
