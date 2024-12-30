class EE /*extends Object */
{

}

class F extends EE 
{
    public static void main(String args[]) throws CloneNotSupportedException
    {
        F x = new F();
        F y = (F) x.clone();
    }
}

// D:\javaprac\56_cloning>javac F.java

// D:\javaprac\56_cloning>java F
// Exception in thread "main" java.lang.CloneNotSupportedException: F
//         at java.base/java.lang.Object.clone(Native Method)
//         at F.main(F.java:11)