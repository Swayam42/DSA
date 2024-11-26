package Sorting;

public class SelectionSort {
    //swaping method
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    //print method
    static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    //selection sort
    static void selectionSort(int arr[]){
        int n=arr.length;
        
        for(int i=0;i<=n-2;i++){ 
            int min=i; //var to store the first element of sub-array as min value
            for(int j=i;j<=n-1;j++){  //loop to traverse through the sub-arrays
                if(arr[j]<arr[min]){ //condition to compare the values to get min 
                    min=j; //min value is stored
                }
            }swap(arr,i, min); //swaping the 2 values(first element of sub-array and min val)
            
        }

    }

    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9};
        selectionSort(arr);
        print(arr);
    }
}
