class C {
    static int[] x;

    public static void main(String args[]){

        System.out.println(x.length);
    }
}

// D:\javaprac\23_arrays>javac C.java

// D:\javaprac\23_arrays>java C
// Exception in thread "main" java.lang.NullPointerException: Cannot read the array length because "C.x" is null
//         at C.main(C.java:6)