class R1 {
    public static void main(String args[]){

            long l = 45l;
            float f = 0.12f;
            double d = 12.3;

            int[] x = {l,f,d};

            System.out.println(x[0]);
            System.out.println(x[1]);
            System.out.println(x[2]);

    }
}

// R1.java:8: error: incompatible types: possible lossy conversion from long to int
//             int[] x = {l,f,d};
//                        ^
// R1.java:8: error: incompatible types: possible lossy conversion from float to int
//             int[] x = {l,f,d};
//                          ^
// R1.java:8: error: incompatible types: possible lossy conversion from double to int
//             int[] x = {l,f,d};
//                            ^
// 3 errors