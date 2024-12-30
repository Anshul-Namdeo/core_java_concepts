class DD{

        int y = 9;

        void pro(){

                System.out.println("dholu");
        }
}

class EE  extends DD {

        boolean w;

        void info(){
            System.out.println("bholu");

        }
}

class J {

        public static void main(String args[]){

                    EE x = new EE();

                    System.out.println(x.y);
                    System.out.println(x.w);

                    x.pro();
                    x.info();
        }
}