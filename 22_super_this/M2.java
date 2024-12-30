class W1 {
    static void pro(){
        System.out.println("pro in parent");
    }
}

class M2 extends W1 {
    static void pro (){
        System.out.println("pro in child ");
    }

    void aaa(){
        pro();           // 1
        this.pro();     // 2  (line no 1 & 2 & 3 theeno hi ("pro in child ko print karenge"))
       // M2.pro();     //3 
         super.pro();
        W1.pro();
    }

    public static void main(String args[]){

            M2 x = new M2();

            x.aaa();
    }
}
