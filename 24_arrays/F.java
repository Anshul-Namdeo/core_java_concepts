class F {
    static int[] x;
    public static void main(String args[]){

            System.out.println(x[0]);
    }
}

// Exception in thread "main" java.lang.NullPointerException: Cannot load from int array because "F.x" is null
//         at F.main(F.java:5)