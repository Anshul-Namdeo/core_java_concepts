class R 
{
    static void pro(String[][] w)
    {
        for(String[] nx : w)
        {
            for(String x : nx)
            {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        String[][] arr = {
            {"a","b","c","d"},
            {"x","y","z"}
        };

        pro(arr);
    }
}

// D:\javaprac\52_var_args>javac R.java

// D:\javaprac\52_var_args>java R
// a b c d
// x y z