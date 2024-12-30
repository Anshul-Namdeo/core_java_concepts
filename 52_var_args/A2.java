class A2
{
    void pro (int a, int b)
    {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String args[])
    {
        A2 a = new A2();
        a.pro(23,12,45);
    }
}


// D:\javaprac\52_var_args>javac A2.java
// A2.java:12: error: method pro in class A2 cannot be applied to given types;
//         a.pro(23,12,45);
//          ^
//   required: int,int
//   found:    int,int,int
//   reason: actual and formal argument lists differ in length
// 1 error