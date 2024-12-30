class F3 
{
    static void pro(int... x)
    {
        System.out.println(" length is : " + x.length);
        for(int next : x)
        {
            System.out.println(next);
        }
    }

    public static void main(String args[])
    {
        byte x1 = 32;
        byte x2 = 56;
        byte x3 = 45;

        byte[] a = {x1,x2,x3};
        int[] b = a;

        pro(b);
    }
}


// D:\javaprac\52_var_args>javac F3.java
// F3.java:19: error: incompatible types: byte[] cannot be converted to int[]
//         int[] b = a;
//                   ^
// 1 error