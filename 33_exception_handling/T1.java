class T1 
{
    public static void main(String[] args) {
        
        System.out.println(1);

        if(12 < 13) {

            ArithmeticException e = new ArithmeticException();

            throw e;
        }

        System.out.println(2);

    }
    
}


// D:\javaprac\33_exception_handling>javac T1.java

// D:\javaprac\33_exception_handling>java T1
// 1
// Exception in thread "main" java.lang.ArithmeticException
//         at T1.main(T1.java:9)