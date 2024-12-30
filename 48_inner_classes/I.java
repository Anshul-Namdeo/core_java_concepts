class H1 {
    class A {
        A(){
            System.out.println("namaskaram....");
        }
    }
}

class I 
{
    public static void main(String args[])
    {
        H1 h = new H1 ();
        A x = h.new A();
    }
}

// D:\javaprac\48_inner_classes>javac I.java
// I.java:14: error: incompatible types: H1.A cannot be converted to A
//         A x = h.new A();
//                 ^
// 1 error