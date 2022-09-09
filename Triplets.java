import java.util.*;

/**
 * This program contains two overloaded methods that check if an integer or long array contains "multiple triplets."
 * "Multiple triplets" are defined as three consecutive numbers where the last two numbers are consecutive multiples of the first number.
 * @author Varun Chauhan
 */
public class Triplets {
    public static void main(String[] args) {
    }

    /**
     * Tests if an integer array contains any multiple triplets.
     * @param arr The integer array to be tested.
     * @return True if there is a multiple triplet; false if not
     */
    public static boolean multipleTriplets(int[] arr) {
        if(arr.length < 3) // array with less than 3 elements can't have a multiple triplet
            return false;

        for(int i = 0; i < arr.length - 2; i++) { // loops until 3rd last index because subsequent indices won't have 2 values after them
            if((arr[i + 1] == arr[i] * 2) && (arr[i + 2] == arr[i] * 3)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Tests if a long array contains any multiple triplets.
     * @param arr The long array to be tested.
     * @return True if there is a multiple triplet; false if not
     */
    public static boolean multipleTriplets(long[] arr) {
        if(arr.length < 3) // array with less than 3 elements can't have a multiple triplet
            return false;

        for(int i = 0; i < arr.length - 2; i++) { // loops until 3rd last index because subsequent indices won't have 2 values after them
            if((arr[i + 1] == arr[i] * 2) && (arr[i + 2] == arr[i] * 3)) {
                return true;
            }
        }

        return false;
    }
}
