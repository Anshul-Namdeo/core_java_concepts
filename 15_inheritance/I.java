// multilevel inheritance 

class Y1 {

        void abc(){

                System.out.println("Y1 in method abc()");
        }
}

class Y2 extends Y1 {

        void bcd(){

                System.out.println("Y2 in method bcd()");
        }
}

class Y3 extends Y2 {

        void cde(){

                System.out.println("Y3 in method cde()");
        }
}

class Y4 extends Y3 {

        void def(){

                System.out.println("Y4 in method def()");
        }
}

class I extends Y4 {

        public static void main(String[] args){

                I x = new I();

                x.abc();
                x.bcd();
                x.cde();
                x.def();

        }
}