class G1 
{
    static void pro(int... x)
    {
         for(int next : x)
        {
            System.out.println(next);
        }
    }

    public static void main(String args[])
    {
        byte a = 23;
        short b = 56;
        char c = 'A';
        long e = 34;

        pro(a, b, c, e);
    }
}


// D:\javaprac\52_var_args>javac G1.java
// G1.java:18: error: method pro in class G1 cannot be applied to given types;
//         pro(a, b, c, e);
//         ^
//   required: int[]
//   found:    byte,short,char,long
//   reason: varargs mismatch; possible lossy conversion from long to int
// 1 error