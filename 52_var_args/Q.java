class Q 
{
    static void pro(long... x) 
    {
        for(long next : x)
        {
            System.out.println(next);
        }
    }

    public static void main(String args[])
    {
        pro('A',78);   // long variable mai (char,byte,short,int) values ko assign kar sakte hai. bez long badha deta type hai ina charo se ...
    }
}


// D:\javaprac\52_var_args>javac Q.java

// D:\javaprac\52_var_args>java Q
// 65
// 78