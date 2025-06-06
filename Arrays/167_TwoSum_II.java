package Arrays;

import java.util.Arrays;

/*
167.Two Sum II - Input Array Is Sorted

 Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.
Your solution must use only constant extra space.
Example 1:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
 */


public class TwoSum_II {

    public static int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        //Two pointers 
        int i=0,j=n-1;

        while(i<j){
            int sum=numbers[i]+numbers[j];
            if(sum>target){
                j--;

            }else if(sum<target){
                i++;
            }else{
                return new int []{i+1,j+1};
            }
        }

        return new int[]{};

    }
    public static void main(String[] args) {
        int arr[]={2,7,11,15}; //Sorted Array
        int res[]=twoSum(arr, 9);
         System.out.println(Arrays.toString(res));  
    }
}
