class P 
{
    static void pro(String[] x)
    {
        for(String next : x) {
            System.out.println(next + " ####");
        }
    }

    public static void main(String args[])
    {
        pro("om","ram","dinesh","mike","john","relosbo");
    }
}

// D:\javaprac\52_var_args>javac P.java
// P.java:12: error: method pro in class P cannot be applied to given types;
//         pro("om","ram","dinesh","mike","john","relosbo");
//         ^
//   required: String[]
//   found:    String,String,String,String,String,String
//   reason: actual and formal argument lists differ in length
// 1 error
