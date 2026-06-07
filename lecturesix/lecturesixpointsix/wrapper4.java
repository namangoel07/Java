package lecturesix.lecturesixpointsix;

import java.util.ArrayList;

public class wrapper4 {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a);
        //Integer i=new Integer(10);//strike creates no error but don't use it
        Integer i=Integer.valueOf(10);//Integer is the object
        System.out.println("i:"+i);






        //Boxing-> Converting primitive data type into its corresponding warpper class object
        //Auto Boxing-> Automatically Converting primitive datatype into its corresponding wrapper class object by java compiler
        int n1=10;// n1 is primitive
        Integer n2=n1;//auto boxing
        Integer x=Integer.valueOf(n1);// boxing only







        //UnBoxing-> Converting wrapper class object back to its corresponding datatype
        //Auto UnBoxing-> Automatically converting wrapper class object back to its corresponding primitive datatype by java compiler
        Integer n3=Integer.valueOf(44);
        int n4=n3;//auto unboxing
        int n5=n3.intValue();//unboxing only


        // ArrayList<Integer> al=new ArrayList<>();
        // al.add(10);
        
        
    }
}
