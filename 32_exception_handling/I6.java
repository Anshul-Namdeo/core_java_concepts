class I6 
{
    public static void main(String[] args) 
    {
        Exception x = new ArithmeticException();
        
        Exception y = new ArrayIndexOutOfBoundsException();

        Exception z = new NumberFormatException();


        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}


// D:\javaprac\32_exception_handling>javac I6.java

// D:\javaprac\32_exception_handling>java I6
// java.lang.ArithmeticException
// java.lang.ArrayIndexOutOfBoundsException
// java.lang.NumberFormatException