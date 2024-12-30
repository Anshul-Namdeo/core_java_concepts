class E 
{
    public static void main(String[] args) {
        
        char a = 'A'; //  primitive character

        String x = a.toString();

        System.out.println(x);
    }
}


// D:\javaprac\31_wrapper_classes>javac E.java
// E.java:7: error: char cannot be dereferenced
//         String x = a.toString();
//                     ^
// 1 error
