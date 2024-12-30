class X3 
{
   

    static void pro(int... x)
    {
        for(int next : x)
        {
            System.out.println(next + "--");
        }
    }

    public static void main(String args[])
    {
       
        Integer[] brr = {11,13,78};
        pro(brr);
    }
}

// D:\javaprac\52_var_args>javac X3.java
// X3.java:17: error: method pro in class X3 cannot be applied to given types;
//         pro(brr);
//         ^
//   required: int[]
//   found:    Integer[]
//   reason: varargs mismatch; Integer[] cannot be converted to int
// 1 error
