class D /*extends Object */
{
    public static void main(String args[]) throws CloneNotSupportedException
    {
        D x = new D();
        D y = x.clone();
    }
}

// D:\javaprac\56_cloning>javac D.java
// D.java:6: error: incompatible types: Object cannot be converted to D
//         D y = x.clone();
//                      ^
// 1 error