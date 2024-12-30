class W extends Throwable
{
    public static void main(String[] args)  {
        
        throw new W();
    }
}

// D:\javaprac\33_exception_handling>javac W.java
// W.java:5: error: unreported exception W; must be caught or declared to be thrown
//         throw new W();
//         ^
// 1 error
