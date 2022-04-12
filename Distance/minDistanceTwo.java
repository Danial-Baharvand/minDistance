package Distance;
// --------------------------------------------------------------------------------------
// Author:  Jo Kelly-Fenton & Danial Baharvand
// Purpose: Returns the minimum distance between the two closests elements in an array
// Date:    5 May 2019 
// --------------------------------------------------------------------------------------

import java.util.Arrays;
public class minDistanceTwo {
    /* Algorithm implementation */
    public static double minDistanceTwo(int[] A) {

        int dmin = Integer.MAX_VALUE;

        for (int i = 0; i < (A.length-1); i++) {

            for (int j=i+1; j < A.length; j++) {
                int temp = Math.abs(A[i] - A[j]);
                if (temp < dmin) {
                    dmin = temp;
                }
            }
        }
        return dmin;
    }
    /* Main program */
    public static void main(String[] args) {
        //int array[] = {1,6,11,15,19,22,25,27,29,30,31}; //uncomment for custom array
        int[] array = Data.makeData(10,0);
        System.out.println("Min distance is: " + minDistanceTwo(array));
        System.out.println("Array: " + Arrays.toString(array));

    }

}