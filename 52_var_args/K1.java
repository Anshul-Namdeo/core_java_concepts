class K1
{
    K1(int... x)
    {
        for(int next : x)
        {
            System.out.println(next);
        } 
    }

    public static void main (String args[])
    {
        K1 y = new K1(new int[]{12,45,67,23});
    }
}

// D:\javaprac\52_var_args>javac K1.java

// D:\javaprac\52_var_args>java K1
// 12
// 45
// 67
// 23