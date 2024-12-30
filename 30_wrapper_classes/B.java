class B 
{
    public static void main(String[] args) {
        
        Byte x = 2;
        Byte y = 3;

        Object c  = x + y;

        System.out.println(c instanceof Integer);
    }
}


// D:\javaprac\30_wrapper_classes>javac B.java

// D:\javaprac\30_wrapper_classes>java B
// true