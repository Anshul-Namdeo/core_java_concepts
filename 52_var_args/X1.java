class X1 
{
    static void pro(Integer... x)
    {
        for(Integer next : x)
        {
            System.out.println(next + "##");
        }
    }

    static void pro(int... x)
    {
        for(int next : x)
        {
            System.out.println(next + "--");
        }
    }

    public static void main(String args[])
    {
        int[] arr = {12,34,60};
        //Integer[] brr = {11,13,78};
        pro(arr);
    }
}


// D:\javaprac\52_var_args>javac  X1.java

// D:\javaprac\52_var_args>java  X1
// 12--
// 34--
// 60-