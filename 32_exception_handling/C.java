class C 
{
    public static void main(String[] args) {
      
        System.out.println(1);

        System.out.println(args[0]);

        System.out.println(3);
    }
}


// D:\javaprac\32_exception_handling>javac C.java

// D:\javaprac\32_exception_handling>java C
// 1
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
//         at C.main(C.java:7)