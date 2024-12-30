class Y2 
{
    // static void pro(Integer... x)
    // {
    //     for(Integer next : x)
    //     {
    //         System.out.println(next + "##");
    //     }
    // }

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


// D:\javaprac\52_var_args>javac Y2.java

// D:\javaprac\52_var_args>java Y2
// 45--
// 67--
// 89--