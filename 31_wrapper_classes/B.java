class B 
{
    public static void main(String[] args) {
        
        boolean a = true; //  primitive boolean

        String x = a.toString();

        System.out.println(x);

    }
}

// D:\javaprac\31_wrapper_classes>javac B.java
// B.java:7: error: boolean cannot be dereferenced
//         String x = a.toString();
//                     ^
// 1 error
