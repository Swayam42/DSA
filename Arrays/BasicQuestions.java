package Arrays;
import java.util.Arrays;
public class BasicQuestions {
    
    //LargestElementInArray
    //brute force code
    static void largestInArray(int arr[]){
            Arrays.sort(arr); //if we use merge or selection or bubble sort TimeComplex : O(nlogn)
            int n=arr.length;
            System.out.println(arr[n-1]);
    }

    //optimal code TimeComplexity : O(n)
    static void LarElementInArray(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }

    //SecondLargest : 
    //brute force code 
    static void secondLar(int arr[]){
        Arrays.sort(arr); //TC : O(nlogn)
        int n=arr.length;
        int max=arr[n-1];
        for(int i=n-2;i>=0;i--){ //TC: O(n)
            if(arr[i]!=max){
                System.out.println(arr[i]+" : 2nd largest");
                break;
            }
            else{
                System.out.println(-1);
            }
        }
    }

    //better code : 
        static void secLar(int arr[]){ //TC : O(2n)
            int n=arr.length;
            int max=arr[0];
            int secLar=Integer.MIN_VALUE; //min_value : if negative no.s are present or else take as -1
        for(int i=0;i<n;i++){ //TC : O(n)
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<n;i++){//TC : O(n)
            if(arr[i]>secLar&&arr[i]!=max){
                secLar=arr[i];
            }
        }
        System.out.println(secLar);

        }

        //optimal code

        static int secoLar(int arr[]){
            int n=arr.length;
            int lar=arr[0];
            int sLar=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){ //TC : O(n)
                if(arr[i]>lar){
                    sLar=lar;
                    lar=arr[i];
                }
                else if(arr[i]<lar&&arr[i]>sLar){
                    sLar=arr[i];
                }
            }

            return sLar;
        }

        //SecondSmallest :

        static void secSmall(int arr[]){
            int n=arr.length;
            int smallest=arr[0];
            int secSmall=Integer.MAX_VALUE;
            for(int i=1;i<n;i++){
                if(arr[i]<smallest){
                    secSmall=smallest;
                    smallest=arr[i];
                }
                else if(arr[i]!=smallest && arr[i]<secSmall){
                    secSmall=arr[i];
                }
            }
            System.out.println(secSmall+" : second smallest");
            System.out.println(smallest+" : smallest");
        }

        //check whether an array is sorted

        static boolean isSorted(int arr[]){
            for(int i=1;i<arr.length;i++){
                if(arr[i]>=arr[i-1]){
                }
                else{
                    return false;
                }
            }
            return true;
        }

        //remove duplicates from a sorted array

        static void removeDuplicate(int arr[]) {
            if (arr.length == 0) return; 
        
            int i = 0; 
            int n = arr.length;
        
            for (int j = 1; j < n; j++) {
                if (arr[j] != arr[i]) {
                    i++; 
                    arr[i] = arr[j];
                }
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println("\nArray size after removing duplicates: " + (i + 1));
        }
        
    public static void main(String[] args) {
        int arr[]={1,3,5,4,2,5,4};
        //largestInArray(arr);
        //LarElementInArray(arr);
        //secondLar(arr);
        //secLar(arr);
       //System.out.println(secoLar(arr));
       //secSmall(arr);
       // System.out.println(isSorted(arr));
       int a[]={1,1,2,2,3,3,4,4,4};
      removeDuplicate(a);
    }
}
