class M 
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
        pro("mohan",12,13,14);
    }
}


// D:\javaprac\52_var_args>javac M.java

// D:\javaprac\52_var_args>java M
// mohan
// 12
// 13
// 14