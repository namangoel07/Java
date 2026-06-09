import java.io.IOException;

// class Parent{
//     public void work(){
//         System.out.println("Parent");
//     }
// }
// class Child1 extends Parent{
//     public void work() throws ArithmeticException// no error because it is unchecked exception
//     {
//         System.out.println("Child1");
//     }

// }
// class Child2 extends Parent{
//     public void work() //throws IOException-> error becuase it is checked exception
//     {
//         System.out.println("Child2");
//     }
//}
class Parent{
    public void work() throws IOException {//now child can throw checked exception
        System.out.println(" Parent");
    }
}
class Child1 extends Parent{ 
    public void work() throws ArithmeticException// no error because it is unchecked exception
    {
        System.out.println("Child1");
    }

}
class Child2 extends Parent{
    public void work() throws IOException//->no error becuase Parent is also throws checked exception
    {
        System.out.println("Child2");
    }
}
class Child3 extends Parent{
    public void work(){// throws Exception-> error because it is partial exception
        System.out.println("Child 3");
    }
}
public class ExceptionHandling9 {
    public static void main(String[] args) {
        
    }
}
