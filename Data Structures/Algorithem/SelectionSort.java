package Algorithem;

public class SelectionSort {
    
    public static void selectionSort(int arr[]){
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            int lowIdx=i;

            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[lowIdx]){
                    lowIdx=j;
                }
            }

            int temp=arr[lowIdx];
            arr[lowIdx]=arr[i];
            arr[i]=temp;
        }
    }



    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print("|"+arr[i]+"|");
        }
    }
    public static void main(String[] args) {
        int arr[]={50,12,87,02,46,86,23,16};
        System.out.println("Old Array");
        display(arr);
        System.out.println();
        System.out.println("After Selection Sort");
        selectionSort(arr);
        display(arr);
    }
}
