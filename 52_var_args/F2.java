class F2 
{
    static void pro(int... x)
    {
        System.out.println(x.length);
    }

    public static void main(String args[])
    {
        byte x1 = 34;
        byte x2 = 67;

        byte[] a = {x1,x2};

        pro(a);
    }
}


// D:\javaprac\52_var_args>javac F2.java
// F2.java:15: error: method pro in class F2 cannot be applied to given types;
//         pro(a);
//         ^
//   required: int[]
//   found:    byte[]
//   reason: varargs mismatch; byte[] cannot be converted to int
// 1 error