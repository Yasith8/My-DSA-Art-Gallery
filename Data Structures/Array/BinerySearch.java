public class BinerySearch {

    static void binerySearch(int array[],int firstVal,int lastVal,int key){
        
        int mid=(firstVal+lastVal)/2;

        while(firstVal<=lastVal){
        if(array[mid]<key){
            firstVal = mid+1;
        }
        else if(array[mid]==key){
            System.out.println("key found at "+mid);
            break;
        }
        else if(array[mid]>key){
            lastVal=mid-1;
        }
        mid=(firstVal+lastVal)/2;
        }

    }
    public static void main(String[] args) {
        int a[]={8,15,16,17,19,23,31,48,56,59,78,82};  //need to be sorted

        int key=16;

        int first=0;
        int last=a.length-1;

        binerySearch(a,first,last,key);

        

    }
}
