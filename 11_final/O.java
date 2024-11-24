class O {
    final int y = 100;

    public static void main(){
        O x = new O();

        System.out.println(x.y);

        x.y = 8;

        System.out.println(x.y);
    }
}

// O.java:9: error: cannot assign a value to final variable y
//         x.y = 8;
//          ^
// 1 error