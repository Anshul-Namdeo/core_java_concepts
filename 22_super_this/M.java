class W1 {
    static void pro(){
        System.out.println("pro in parent");
    }
}
class M extends W1 {
    static void pro(){
        System.out.println("pro in child");
    }

    public static void main(String args[]){

            pro();
            super.pro();
    }
}

// M.java:14: error: non-static variable super cannot be referenced from a static context
//             super.pro();
//             ^
// 1 error
