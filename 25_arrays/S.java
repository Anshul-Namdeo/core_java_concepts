class S 
{
    public static void main(String args[])
    {
        X[] a = new X[4];

        a[0] = new A1();
        a[1] = new A2();
        a[2] = new A3();
        // a[3] = new A4();

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
         System.out.println(a[3]); 
    }
}

interface X { }

class A1 implements X{ }
class A2 implements X{ }
class A3 implements X{ }
class A4 { }


// D:\javaprac\25_arrays>javac S.java

// D:\javaprac\25_arrays>java S
// A1@24d46ca6
// A2@4517d9a3
// A3@372f7a8d
// null