class M1
{
    static void pro(String y, int...x) {
        System.out.println(y);
        for(int next : x)
        {
            System.out.println(next);
        }
    }

    public static void main(String args[])
    {
        pro("mohan");
    }
}

// D:\javaprac\52_var_args>javac M1.java

// D:\javaprac\52_var_args>java M1
// mohan