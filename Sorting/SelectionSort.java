package Sorting;

public class SelectionSort {
    
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void selectionSort(int arr[]){
        int n=arr.length;
        
        for(int i=0;i<=n-2;i++){
            int min=i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }swap(arr,i, min);
            
        }

    }

    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9};
        selectionSort(arr);
        print(arr);
    }
}
