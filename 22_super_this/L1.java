class T1{
    void pro(){
        System.out.println("pro in parent");
    }
}

class L1 extends T1 {

        void pro(){
            System.out.println("pro in child");
        }

        void info(){
            pro();
            super.pro();
        }

        public static void main(String args[]){

                L1 f = new L1();

                f.info();
        }
}