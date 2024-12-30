class X {

        static int a = 9;
}

class X1 extends X {

        static int a = 11;
}

class B {

        public static void main(String args[]){

                X x = new X1();
                System.out.println(x.a);
        }
}