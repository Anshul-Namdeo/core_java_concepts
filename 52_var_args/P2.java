class P2
{
    static void pro(String[] x)
    {
        for(String nx : x)
        {
            System.out.println(nx + " ++++");
        }
    }

    public static void main(String args[])
    {
        String[] arr = { "om","ram","dinesh","mike","john","relosbo"};
        pro(arr);
    }
}


// D:\javaprac\52_var_args>javac P2.java

// D:\javaprac\52_var_args>java P2
// om ++++
// ram ++++
// dinesh ++++
// mike ++++
// john ++++
// relosbo ++++