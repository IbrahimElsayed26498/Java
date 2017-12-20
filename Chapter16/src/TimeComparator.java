/**
 * Figure 16.8: TimeComparator.java
 * Custom Comparator class that compares two Time2 objects
 */

import java.util.Comparator;

public class TimeComparator implements Comparator<TimeTwo>{

    @Override
    public int compare(TimeTwo timeTwoOne, TimeTwo timeTwoTwo)
    {
        int hourDifference = timeTwoOne.getHour() - timeTwoTwo.getHour();

        if (hourDifference != 0)
            return hourDifference;

        int minuteDifference = timeTwoOne.getMinute() - timeTwoTwo.getMinute();

        if (minuteDifference != 0)
            return minuteDifference;

        int secondsDifference = timeTwoOne.getSecond() - timeTwoTwo.getSecond();
        return secondsDifference;
    }
}
