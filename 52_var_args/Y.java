class Y 
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
        
        pro(45,67,89);
    }
}

// D:\javaprac\52_var_args>javac Y.java
// Y.java:22: error: reference to pro is ambiguous
//         pro(45,67,89);
//         ^
//   both method pro(Integer...) in X and method pro(int...) in X match
// 1 error
