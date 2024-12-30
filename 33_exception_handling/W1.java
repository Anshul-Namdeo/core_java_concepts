class W1 extends Exception
{
    public static void main(String[] args)  {
        
        throw new W1();
    }
}
// D:\javaprac\33_exception_handling>javac W1.java
// W1.java:5: error: unreported exception W1; must be caught or declared to be thrown
//         throw new W1();
//         ^
// 1 error
