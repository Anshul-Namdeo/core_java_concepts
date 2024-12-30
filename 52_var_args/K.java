class K 
{
    K(int... x)
    {
        for(int next : x)
        {
            System.out.println(next);
        } 
    }

    public static void main (String args[])
    {
        K y = new K({12,45,67,23});
    }
}

// D:\javaprac\52_var_args>javac K.java
// K.java:13: error: illegal start of expression
//         K y = new K({12,45,67,23});
//                     ^
// K.java:13: error: illegal start of type
//         K y = new K({12,45,67,23});
//                      ^
// K.java:13: error: ';' expected
//         K y = new K({12,45,67,23});
//                                  ^
// 3 errors