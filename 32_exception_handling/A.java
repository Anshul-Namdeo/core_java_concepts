class A 
{
    public static void main(String[] args) {
        
        System.out.println(1);

        int x = 12/0;

        System.out.println(3);
    }
}


// D:\javaprac\32_exception_handling>javac A.java

// D:\javaprac\32_exception_handling>java A
// 1
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at A.main(A.java:7)