import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        int sum=0;
        for (Integer i : L) {
            sum+=i;
        }
        return sum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        List<Integer>A=new ArrayList<>();
        for (Integer i : L) {
            if(i%2==0)A.add(i);
        }
        return A;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        List<Integer>B=new ArrayList<>();
        for (Integer i1 : L1) {
            for (Integer i2 : L2) {
                if(Objects.equals(i1, i2))B.add(i1);
            }
        }
        return B;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        int count = 0;
        for (String element : words) {
            if (element.contains(c+"")) {
                count++;
            }
        }
        return count;
    }
}
