class X {

        int a = 9;
}

class X1 extends X {

        int a = 11;
}

class A {

        public static void main(String args[]){

                X x = new X1();

                System.out.println(x.a);
        }
}