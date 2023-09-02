//Challenge1: Print index 3 to end in array
//Challenge2: Print index 2 to 6 in array

public class PrintSelectedArray {
   public static void main(String args[]){
       int myArray[]={10,20,30,40,50,60,70,80,90};

       System.out.println("---Challenge--1---");
       //Challenge1:
       for(int i=3;i<myArray.length;i++){
           System.out.print(myArray[i]+" || ");
        }
        
        System.out.println("");

        System.out.println("---Challenge--2---");
    //Challenge2:
    for(int i =2;i<7;i++){
        System.out.print(myArray[i]+" || ");
       }

   }
}
