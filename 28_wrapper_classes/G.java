 class G 
 {
    public static void main(String args[])
    {
        // Byte x = Byte.valueOf("111"); // Default radix :10

        Byte x = Byte.valueOf("111",2);

        System.out.println(x);
    }
 }

 
// D:\javaprac\28_wrapper_classes>javac G.java

// D:\javaprac\28_wrapper_classes>java G
// 7
