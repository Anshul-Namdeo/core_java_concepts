class L
{
    public static void main(String[] args) {
        
        short a = 67; //  primitive short

        //  String x = a.toString();
        String x = Short.toString(a);
        

        System.out.println(x);
    }
}

// D:\javaprac\31_wrapper_classes>javac L.java

// D:\javaprac\31_wrapper_classes>java L
// 67