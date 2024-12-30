class C 
{
    public static void main(String[] args) {
        
        boolean a = true; //  primitive boolean

        // String x = a.toString();
        String x = Boolean.toString(a);

        System.out.println(x);

    }
}


// D:\javaprac\31_wrapper_classes>javac C.java

// D:\javaprac\31_wrapper_classes>java C
// true