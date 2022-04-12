package Distance;// --------------------------------------------------------------------------------------
// Author:  Jo Kelly-Fenton & Danial Baharvand
// Purpose: Returns the minimum distance between the two closest elements in an array
// Date:    5 May 2019 
// --------------------------------------------------------------------------------------

public class minDistance {
    /* Algorithm implementation */
    public static int minDistance(int[] A) {
        int dmin = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            for (int j=0; j < A.length; j++) {
                if (i != j && Math.abs(A[i] - A[j]) < dmin) {
                    dmin = Math.abs(A[i] - A[j]);
                }
            }
        }
        return dmin;
    }

    /* Main program */
    public static void main(String[] args) {
        //int array[] = {2,4,3,5}; //uncomment for custom array
        int[] array = Data.makeData(10,0);
        System.out.println("Min distance is: " + minDistance(array));


    }

}