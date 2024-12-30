class A 
{
    void pro (int a, int b)
    {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String args[])
    {
        A a = new A();
        a.pro();
    }
}

// D:\javaprac\52_var_args>javac A.java
// A.java:12: error: method pro in class A cannot be applied to given types;
//         a.pro();
//          ^
//   required: int,int
//   found:    no arguments
//   reason: actual and formal argument lists differ in length
// 1 error
