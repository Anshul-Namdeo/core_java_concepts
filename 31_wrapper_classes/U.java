class U 
{
    public static void main(String[] args) {
        
        float a = 3.5f;  // primitive float 

        String x = a.toString();

        System.out.println(x);
    }
}


// D:\javaprac\31_wrapper_classes>javac U.java
// U.java:7: error: float cannot be dereferenced
//         String x = a.toString();
//                     ^
// 1 error