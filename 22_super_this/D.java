class D{

        void pro(){
            System.out.println(this + "~~~~~~~");
            info(this);
        }

        static void info(D x){
            System.out.println(x + "######");
        }

        public static void main(String args[]){

                D d = new D();

                System.out.println( d + "********");
                d.pro();
        }
}