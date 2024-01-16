package Java;

public class Init {
    public double sqrm;
    public  Init(double radius){
        sqrm=0.5*radius*3.4;
        System.out.println(sqrm);
    }
    
    public Init(double len,double high){
        sqrm=len*high;
        System.out.println(sqrm);
    }

    public static void main(String[] args) {
        Init circle=new Init(12.5);
        Init square=new Init(10, 10);

        
    }
}
