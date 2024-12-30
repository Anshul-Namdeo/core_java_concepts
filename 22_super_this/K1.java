class Z1 {
    static int t = 9;
}

class K1 extends Z1 {
    static int t = 90;

    void pro(){
        int t = 900;

        System.out.println(t);
        System.out.println(this.t);
        System.out.println(super.t);
    }

    public static void main(String args[]){

            K1 x = new K1();

            x.pro();
    }
}
// 900
// 90
// 9





