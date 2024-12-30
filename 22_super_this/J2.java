class Z1 {
    static int t = 8;
}

class J1 extends Z1 {
    static int t = 80;

    static void pro(){
        int t = 800;
        System.out.println(t);
        System.out.println(this.t);
        System.out.println(super.t);
    }

    public static void  main(String args[]){

            pro();
    }
}

// J2.java:11: error: non-static variable this cannot be referenced from a static context
//         System.out.println(this.t);
//                            ^
// J2.java:12: error: non-static variable super cannot be referenced from a static context
//         System.out.println(super.t);
//                            ^
// 2 errors