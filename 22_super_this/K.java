class Z1 {
    static int t = 5;
}

class K extends Z1 {
    static int t = 20;

    static void pro(){
        int t = 56;

        System.out.println(t);
        System.out.println(K.t);
        System.out.println(Z1.t);
    }

    public static void main(String args[]){
        pro();
    }
}

// 56
// 20
// 5