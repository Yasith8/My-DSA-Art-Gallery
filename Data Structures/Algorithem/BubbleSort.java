package Algorithem;


public class BubbleSort {

    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print("|"+arr[i]+"|");
        }
    }
    public static void main(String[] args) {
        
        int arr[]={3,5,4,7,2,1};
        System.out.println("Old Array");
        display(arr);
        System.out.println();
        System.out.println("After Bubble Sort");
        bubbleSort(arr);
        display(arr);

    }
}