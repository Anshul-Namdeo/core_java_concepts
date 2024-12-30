class T 
{
    public static void main(String args[])
    {
        
        Y[] x = new Y[3];

        System.out.println(x[0]);
         System.out.println(x[1]);
          System.out.println(x[2]);

           System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

           x[0] = new B1();
           x[1] = new B2();
           x[2] = new B3();

           System.out.println(x[0]);
         System.out.println(x[1]);
          System.out.println(x[2]);


    }
}

abstract class Y {}

class B1 extends Y {}
class B2 extends Y {}
class B3 extends Y {}


// D:\javaprac\25_arrays>javac T.java

// D:\javaprac\25_arrays>java T
// null
// null
// null
// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
// B1@24d46ca6
// B2@4517d9a3
// B3@372f7a8d