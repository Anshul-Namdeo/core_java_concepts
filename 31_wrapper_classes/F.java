class F 
{
    public static void main(String[] args) {
        
        char a = 'A'; //  primitive character

        // String x = a.toString();
        String x = Character.toString(a);

        System.out.println(x);
    }
}
// D:\javaprac\31_wrapper_classes>javac F.java

// D:\javaprac\31_wrapper_classes>java F
// A

