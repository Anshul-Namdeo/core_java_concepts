class D 
{
    public static void main(String[] args) {
        
        Float a = 2.3f;
        Byte b = 3;

        Object c = a + b;

        System.out.println(c instanceof Float);
        System.out.println(c);
    }
    
}

// D:\javaprac\30_wrapper_classes>javac D.java

// D:\javaprac\30_wrapper_classes>java D
// true