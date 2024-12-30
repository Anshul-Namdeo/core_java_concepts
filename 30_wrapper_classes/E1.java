class E1 
{
    public static void main(String[] args) {
     
        Boolean a = Boolean.valueOf(false);
        Boolean b = Boolean.valueOf(false);
        Boolean c = Boolean.valueOf(false);

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);

    }
}

// D:\javaprac\30_wrapper_classes>javac E1.java

// D:\javaprac\30_wrapper_classes>java E1
// true
// true
// true
