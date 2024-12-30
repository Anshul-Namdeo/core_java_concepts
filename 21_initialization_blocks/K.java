class X {
    static {
        System.out.println(x);
    }
        static int x = 9;
}

// K.java:3: error: illegal forward reference
//         System.out.println(x);
//                            ^
// 1 error