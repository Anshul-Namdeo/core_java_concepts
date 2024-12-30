class X 
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
        //int[] arr = {12,34,60};
        Integer[] brr = {11,13,78};
        pro(brr);
    }
}


// D:\javaprac\52_var_args>javac X.java

// D:\javaprac\52_var_args>java X
// 11##
// 13##
// 78##