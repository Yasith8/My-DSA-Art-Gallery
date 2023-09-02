public class AddIndexValue {
    public static void main(String[] args) {
        int myArray[]= new int[5];

        myArray[0]=10;
        myArray[1]=20;
        myArray[2]=30;
        myArray[3]=40;

        System.out.println("---Print myArray---");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]+" ");
        }

        System.out.println(" ");
        
        int index=2;
        int newValue=90;
        
        

        System.out.println("---Print myArray after assign values---");
        for(int i=myArray.length-1; i>index;i--){
            myArray[i]=myArray[i-1];
        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]+" ");
        }
        System.out.println(" ");
        

        myArray[2]=newValue;
        
        System.out.println("---Final myArray---");
        
         for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]+" ");
        }

    }
}
