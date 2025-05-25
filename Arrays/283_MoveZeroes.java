/*
283. Move Zeroes

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

 */
public class MoveZeroes {
    
    public static void moveZeroes(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[count++]=nums[i];
            }
        }
        while(count<nums.length){
            nums[count++]=0;
        }
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        moveZeroes(arr);
        for (int num:arr) {
            System.out.print(num + " ");
        }
    }
}
