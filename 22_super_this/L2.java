class T1{
    void pro(){
        System.out.println("pro in parent");
    }
}

class L extends T1 {

        void pro(){
            System.out.println("pro in child");
        }

        void info( I x){

            I pro(x){
                System.out.println("pro inside the Info");
            }
            pro();
            pro();
            pro();
        }

        public static void main(String args[]){

                L f = new L();

                f.info();
        }
}


