// multiple inheritance (java support multiple inheritance)

class X4{

        void a1(){
            System.out.println("method a1() in class X4");
        }
}
interface X5{

            void a2();
}
interface X6{

            void a3();
}

class H1 extends X4 implements X5,X6{


        public static void main(String[] args){

                H1 x = new H1();

                    x.a1();
                    x.a2();
                    x.a3();

        }
            
            public void a2(){

                System.out.println("method a2() in interface X5");
            }

            public void a3(){

                    System.out.println("method a3() in interface X6");
            }
}