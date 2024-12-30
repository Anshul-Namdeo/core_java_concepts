class W1 {
    static void pro(){
        System.out.println("pro in parent");
    }
}
class M1 extends W1 {
    static void pro(){
        System.out.println("pro in child");
    }

    public static void main(String args[]){

            pro();
           // super.pro();
           W1.pro();
    }
}

// pro in child
// pro in parent