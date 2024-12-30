class N
{
    static void pro(String... y, int...x) {
        System.out.println(y);
       
            System.out.println(x.length);
        
    }

    public static void main(String args[])
    {
        pro("om","ram","raj", 12,13,14);
    }
}


// D:\javaprac\52_var_args>javac N.java
// N.java:3: error: varargs parameter must be the last parameter
//     static void pro(String... y, int...x) {
//                               ^
// 1 error