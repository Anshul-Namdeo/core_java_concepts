class M2 
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
        pro(12,13,14);
    }
}


// D:\javaprac\52_var_args>javac M2.java
// M2.java:13: error: incompatible types: int cannot be converted to String
//         pro(12,13,14);
//             ^
// Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
// 1 error