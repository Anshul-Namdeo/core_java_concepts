class R
{
    public static void main(String[] args) {
        
        long a = 67l; //  primitive long

         String x = a.toString();
        

        System.out.println(x);
    }
}


// D:\javaprac\31_wrapper_classes>javac R.java
// R.java:7: error: long cannot be dereferenced
//          String x = a.toString();
//                      ^
// 1 error