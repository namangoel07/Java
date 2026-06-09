class Gamma{
    public int disp(){
        try{
            System.out.println("Disp method of alpha");
            return 10;//will run at last if it is only return statement after finally
            //it will not run as finally block is there with return statement


        }
        finally{
            System.out.println("Finally block of Gamma");//run evcen after return statement
           // return 44;
        }
    }
}
public class ExceptionHandling6 {
    public static void main(String[] args) {
        Gamma g=new Gamma();
        System.out.println(g.disp());
    }
}
