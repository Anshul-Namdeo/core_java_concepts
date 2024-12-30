class WWW 
{
    private static int w = 7777;

    static class A 
    {
        void pro()
        {
            System.out.println(w);
        }
    }
}

class Y 
{
    public static void main(String args[])
    {
        A a = new A();
        a.pro();
    }
}



// D:\javaprac\49_inner_classes>javac Y.java
// Y.java:18: error: cannot access A
//         A a = new A();
//         ^
//   bad source file: .\A.java
//     file does not contain class A
//     Please remove or make sure it appears in the correct subdirectory of the sourcepath.
// 1 error
