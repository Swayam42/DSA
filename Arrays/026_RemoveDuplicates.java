/*
26. Remove Duplicates from Sorted Array

Given an integer array nums sorted in non-decreasing order, remove the duplicates
 in-place such that each unique element appears only once. The relative order of the 
 elements should be kept the same. Then return the number of unique elements in nums.

 Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 */
public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i=0;
        for(int j=1;j<nums.length;j++) {
        if (nums[j]!=nums[i]){
            i++;
            nums[i]=nums[j];
        }
    }
        return i+1;
    }
    public static void main(String[] args) {
       int arr[]={1,1,2};
       System.out.println(removeDuplicates(arr));
    }
}
