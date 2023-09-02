public class SearchArray {
    public static void main(String[] args) {
        int myArray[]={10,20,30,40,50,60,70,80};

        int newVal=50;

        for(int i=0;i<myArray.length;i++){
            if(newVal==myArray[i]){
                System.out.println("Found at index "+i+" and element is "+(i+1));
                break;
            }
        }
    }
}
