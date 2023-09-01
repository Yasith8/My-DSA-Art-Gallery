public class InsertEven {
    public static void main(String[] args) {
        int A[]={10,20,30,40,50,60};

        int N=A.length;
        int first=0;
        int last=N-1;

        int POS=(first+last)/2;
        int VAL=90;

        for(int i=last;i>POS;i--){
            A[i]=A[i-1];
        }

        A[POS]=VAL;

        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }

    }
}
