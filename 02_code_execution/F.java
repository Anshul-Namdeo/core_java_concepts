class F {

        public static void main(String[] args){
            System.out.println("T");
            abc();
        }

        static void abc(){

                System.out.println("Z");
                bcd();
        }

        static void bcd(){

                System.out.println("I");
                cde();
        }

        static void cde(){

                System.out.println("M");
        }
}