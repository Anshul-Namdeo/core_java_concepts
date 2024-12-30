class A1
{
    void pro (int a, int b)
    {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String args[])
    {
        A1 a = new A1();
        a.pro(23);
    }
}

// D:\javaprac\52_var_args>javac A1.java
// A1.java:12: error: method pro in class A1 cannot be applied to given types;
//         a.pro(23);
//          ^
//   required: int,int
//   found:    int
//   reason: actual and formal argument lists differ in length
// 1 error