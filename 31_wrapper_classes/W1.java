class W1 
{
    public static void main(String[] args) {
        
        double a = 3.5f;  // primitive double

        String x = a.toString();

        System.out.println(x);
    }
}


// D:\javaprac\31_wrapper_classes>javac W1.java
// W1.java:7: error: double cannot be dereferenced
//         String x = a.toString();
//                     ^
// 1 error
