class H1 
{
    public static void main(String[] args) {
        
        System.out.println(1);

       try
       {
        System.out.println(Integer.parseInt(args[0]));
       }catch(NumberFormatException e)
       {
        System.out.println("problm solved");
       }

        System.out.println(3);
    }
}


// D:\javaprac\32_exception_handling>javac H1.java

// D:\javaprac\32_exception_handling>java H1 123
// 1
// 123
// 3

// D:\javaprac\32_exception_handling> java H1 abc
// 1
// problm solved
// 3
