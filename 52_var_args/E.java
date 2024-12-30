class E 
{
    static void pro(int... x)
    {
        System.out.println(x.length);
    }

    public static void main(String args[])
    {
        pro(12,13,14,15);
    }
}


// D:\javaprac\52_var_args>javac E.java

// D:\javaprac\52_var_args>java E
// 4
