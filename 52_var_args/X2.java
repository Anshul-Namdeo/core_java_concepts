class X2 
{
    static void pro(Integer... x)
    {
        for(Integer next : x)
        {
            System.out.println(next + "##");
        }
    }


    public static void main(String args[])
    {
        int[] arr = {12,34,60};
        pro(arr);
    }
}

// D:\javaprac\52_var_args>javac X2.java
// X2.java:15: error: method pro in class X2 cannot be applied to given types;
//         pro(arr);
//         ^
//   required: Integer[]
//   found:    int[]
//   reason: varargs mismatch; int[] cannot be converted to Integer
// 1 error
