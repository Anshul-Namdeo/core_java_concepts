class T 
{
   public static void main(String[] args) {
    
        System.out.println(1);

        ArithmeticException e = new ArithmeticException();

        throw e;

        System.out.println(2);
   }  
}

// D:\javaprac\33_exception_handling>javac T.java
// T.java:11: error: unreachable statement
//         System.out.println(2);
//         ^
// 1 error