class P1
{
    static void pro(String[] x)
    {
        for(String nx : x)
        {
            System.out.println(nx + " ===");
        }
    }

    public static void main(String args[])
    {
        pro (new String[] { "om","ram","dinesh","mike","john","relosbo"});
    }
}

// D:\javaprac\52_var_args>javac P1.java

// D:\javaprac\52_var_args>java P1
// om ===
// ram ===
// dinesh ===
// mike ===
// john ===
// relosbo ===
