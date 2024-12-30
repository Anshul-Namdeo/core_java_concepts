class F {
    public static void main(String agrs[]){

        int[] x = new int[0];

        int[][] y = new int[2][];

        System.out.println(x instanceof int[]);
        //  System.out.println(x instanceof int[][]);
        // System.out.println(y instanceof int[]);
        System.out.println(y instanceof int[][]);

    }
}

// D:\javaprac\25_arrays>javac F.java
// F.java:9: error: incompatible types: int[] cannot be converted to int[][]
//          System.out.println(x instanceof int[][]);
//                             ^
// 1 error

// F.java:10: error: incompatible types: int[][] cannot be converted to int[]
//         System.out.println(y instanceof int[]);