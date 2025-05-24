/*
53. Maximum Subarray

 Given an integer array nums, find the subarray with the largest sum, and return its sum.
Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 */

public class MaxSubArray{

    /*public static void printAllSubArrays(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            
        }
    }*/

    //BruteForce :
    public static int maxSubA(int arr[]){
        int n=arr.length;int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
        }
        return maxSum;
    }


    //Optimal
    public static int maxSubArray(int arr[]){
        int maxSum=arr[0];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>maxSum){
                maxSum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        //printAllSubArrays(arr);
        //System.out.println(maxSubA(arr));
        System.out.println(maxSubArray(arr));
    }
}
