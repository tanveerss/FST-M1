
/*Activity 2

In this activity, we are writing a program to check if the sum of all the 10's in the array is exactly 30.

The program returns false if the condition does not satisfy, otherwise returns true.

Instructions:

    Add a Class named Activity2.
    In the main() method:
        Initialize an array with 6 number: [10, 77, 10, 54, -11, 10]
        Find the 10's in the array and add them
        Check if value is equal to 30.
*/


package Activities;

import java.util.Arrays;

public class Activity2 {
	public static void main(String[] args) {
        int[] numArr = {10, 77, 10, 54, -11, 10};
        System.out.println("Original Array: " + Arrays.toString(numArr));
        int searchNum = 10; int fixedSum = 30;
        System.out.println("Result: " + result(numArr, searchNum, fixedSum));
    }

    public static boolean result(int[] numbers, int searchNum, int fixedSum) {
        int temp_sum = 0;
        for (int number : numbers) {
            if (number == searchNum) {
                temp_sum += searchNum;
            }

            if (temp_sum > fixedSum) {
                break;
            }
        }
        return temp_sum == fixedSum;
    }
}
