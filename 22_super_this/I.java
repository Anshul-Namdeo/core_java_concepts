class Y1 {
    private int x = 88;

    void info(){
        System.out.println(x);
    }

    private void aaa(){
        System.out.println("hi");
    }
}

class I extends Y1 {
    int x = 44;

    void pro(){
        int x = 11;

        System.out.println(x);
        System.out.println(this.x);
        System.out.println(super.x);
    }

    public static void main(String args[]){

            I g = new I();
            g.pro();
    }
}

// I.java:21: error: x has private access in Y1
//         System.out.println(super.x);
//                                 ^
// 1 error
