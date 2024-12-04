// hieerarchical inheritance 

class J {

        public static void main(String[] args){

                Z1 x = new Z1();

                x.mno();

                Z2 y = new Z2();

                y.pqr();

                Z3 z = new Z3();

                z.xyz();
        }
}

class Z1 extends J {
  
        void mno(){
            System.out.println("mno in mno");
        }
}

class Z2 extends J{

        void pqr(){

            System.out.println("pqr in pqr");
        }
}

class Z3 extends J {


        void xyz(){

                System.out.println("xyz in xyz");
        }

}