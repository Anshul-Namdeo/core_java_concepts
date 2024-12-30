class G 
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

        pro(a, b, c);
    }
}


// D:\javaprac\52_var_args>javac G.java

// D:\javaprac\52_var_args>java G
// 23
// 56
// 65