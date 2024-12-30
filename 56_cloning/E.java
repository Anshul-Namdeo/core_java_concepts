class E /*extends Object */
{
    public static void main(String args[]) throws CloneNotSupportedException
    {
        E x = new E();

        E y = (E) x.clone();
    }
}



// D:\javaprac\56_cloning>javac E.java

// D:\javaprac\56_cloning>java E
// Exception in thread "main" java.lang.CloneNotSupportedException: E
//         at java.base/java.lang.Object.clone(Native Method)
//         at E.main(E.java:7)