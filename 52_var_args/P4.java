class P4
{
    static void pro(String[] x, String... y )
    {
        for(String next : x) {
            System.out.println(next + " ####");
        }

        for(String next : y) {
            System.out.println(next + " -----");
        }
    }

    public static void main(String args[])
    {
        pro(new String[] {"om","ram","dinesh"},"mike","john","relosbo");
    }
}


// D:\javaprac\52_var_args>javac P4.java

// D:\javaprac\52_var_args>java P4
// om ####
// ram ####
// dinesh ####
// mike -----
// john -----
// relosbo -----
