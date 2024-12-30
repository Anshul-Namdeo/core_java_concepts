class T
{
    static void pro(String...... w)
    {
        for(String[] nx : w)
        {
            for(String x : nx)
            {
                System.out.print(x + "-");
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

// D:\javaprac\52_var_args>javac T.java
// T.java:3: error: <identifier> expected
//     static void pro(String...... w)
//                              ^
// 1 error