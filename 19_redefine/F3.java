class X {

        int a = 9;
}
interface Y {
        int a = 11;
}
class F3 extends X implements Y{

        public static void main(String args[]){

              //  X f = new  X();

                System.out.println(Y.a);
        }
}