class H
{
    public static void main(String[] args) {
        
        byte a = 67; //  primitive byte

         String x = a.toString();
        

        System.out.println(x);
    }
}


// D:\javaprac\31_wrapper_classes>java H.java
// H.java:7: error: byte cannot be dereferenced
//          String x = a.toString();
//                      ^
// 1 error
// error: compilation failed