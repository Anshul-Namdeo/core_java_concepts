class Z1 {
    static int t = 8;
}

class J extends Z1 {
    static int t = 80;

    static void pro(){
        int t = 800;
        System.out.println(t);
    }

    public static void  main(String args[]){

            pro();
    }
}