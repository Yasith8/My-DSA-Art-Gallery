public class LinearSearch {

    static int search(int array[],int value){
        int n=array.length;

        for(int i =0;i<n;i++){
            if(array[i]==value){
                return i;
            }
        }

        return -1; //if search value is not found,you can return this value;

    }
    public static void main(String[] args) {
         
        int a[]={10,20,30,5,8,90,100,34};
        int key=90;
        

        int result=search(a,key);

        if(result==-1){
            System.out.println("Your value isn't in the array");
        }
        else{
            System.out.println("index related to key is "+result);
        }

       
    }
}
