abstract class X {

}

class X1 extends X{

}
class N {

        public static void main(String args[]){

                // case 1:

                X x;

                // case 2:

                // X x1 = new X();

                // N.java:18: error: X is abstract; cannot be instantiated
                // X x1 = new X();
                //        ^
                // 1 error

                // case 3:

                X x2 = new X1();


        }
}