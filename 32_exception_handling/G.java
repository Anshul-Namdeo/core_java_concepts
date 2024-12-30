class G 
{
    public static void main(String[] args) {
      
        System.out.println(1);

       try
       {
        System.out.println(args[0]);
       }catch (ArrayIndexOutOfBoundsException e)
       {
            System.out.println("problem solved ");
       }

        System.out.println(3);
    }
}


// D:\javaprac\32_exception_handling>javac F.java

// D:\javaprac\32_exception_handling>java F mohan
// 1
// problem solved
// 3

// D:\javaprac\32_exception_handling>java F
// 1
// problem solved
// 3
