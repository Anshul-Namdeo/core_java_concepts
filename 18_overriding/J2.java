class C3 {

        private void pro(){

                System.out.println("hi");
        }
}

class D3 extends C3 {

        void pro(){

                System.out.println("hello");
        }
}

class J2 {

        public static void main(String args[]){

                D3 x = new D3();

                x.pro();

        }
}

// J1.java:23: error: pro() has private access in C2
//                 x.pro();
//                  ^
// 1 error