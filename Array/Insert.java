//2018 Past paper PART 2

public class Insert {
    public static void main(String args[]){
        int A[]={10,20,30,40,50};
        int N=A.length;
        int POS=2;
        int VAL=90;

        
        for(int i=N-1;i>POS;i--){
            A[i]=A[i-1];
        } 

        A[POS]=VAL;

        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }

    }
}
