import java.util.Arrays;
/*
977. Squares of a Sorted Array

Given an integer array nums sorted in non-decreasing order, 
return an array of the squares of each number sorted in non-decreasing order.

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
 */
public class SquaresOfSortedArray {
    
    //Brute Force :
    public static int [] squaresOfSorted(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            arr[i]=arr[i]*arr[i];    
        }
        Arrays.sort(arr);
        return arr;
    }
    
    public static int [] sortedSquares(int arr[]){
        int n=arr.length;
        int i=0;
        int j=n-1;
        int k=n-1;
        int res[]=new int[n];
        while(k>=0){
            int a=arr[i]*arr[i];
            int b=arr[j]*arr[j];
            if(a>b){
                res[k]=a;
                i++;
            }else{
                res[k]=b;
                j--;
            }
            k--;
        }
        return res;
    }
    
    public static void main(String[] args) {
            int nums[]={-7,-3,2,3,11};
            String brute=Arrays.toString(squaresOfSorted(nums));
            System.out.println(brute);
            int arr[]={-4,-1,0,3,10};
            String s=Arrays.toString(sortedSquares(arr));
            System.out.println(s);
    }
}
