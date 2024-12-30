class P3 
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
        pro("om","ram","dinesh","mike","john","relosbo");
    }
}

// D:\javaprac\52_var_args>javac P3.java
// P3.java:16: error: incompatible types: String cannot be converted to String[]
//         pro("om","ram","dinesh","mike","john","relosbo");
//             ^