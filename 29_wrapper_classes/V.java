class V 
{
    public static void main(String[] args) {
        
        Integer x = Integer.valueOf(23);

        System.out.println(x.byteValue());
        System.out.println(x.shortValue());
        System.out.println(x.intValue());
        System.out.println(x.longValue());
        System.out.println(x.floatValue());
        System.out.println(x.doubleValue());

    }
}

// D:\javaprac\29_wrapper_classes>javac V.java

// D:\javaprac\29_wrapper_classes>java V
// 23
// 23
// 23
// 23
// 23.0
// 23.0
