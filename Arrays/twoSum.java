package Arrays;
/*
1. Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers 
such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]. */
import java.util.Arrays;
import java.util.HashMap;
public class TwoSum{
    
    //Brute-Force Approach : O(N^2)
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            int req=target-nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==req){
                    return new int[]{i,j};
                }
            }
            
        }
        return new int[]{};
        
    }

    //Optimal : Using HashMap TC=O(N)
    public static int[] twoSumO(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int req=target-nums[i];
            if(map.containsKey(req)){
                return new int[]{map.get(req),i};
            }
            map.put(nums[i],i);
        }

        return new int[]{};        
    }


    public static void main(String[] args) {
        int arr[]={2,7,1,15};
        int res[]=twoSum(arr, 9);
        System.out.println(Arrays.toString(res));
        int res2[]=twoSumO(arr, 9);
        System.out.println(Arrays.toString(res2));
    }
}
