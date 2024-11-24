class X{
        int y = 9;

        void pro(){
            System.out.println("hello");
        }
}
class A {

        public static void main(String[] args){

                X x = new X();

                System.out.println(x.y);
                x.pro();
        }
}

