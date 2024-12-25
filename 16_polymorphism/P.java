interface Y {  // interface 100% abstract hota hai .

}
class X1 implements Y {

}

class P {

        public static void main(String args[]){

                // case 1:

                    Y y1;

                // case 2:

                    // Y y2 = new Y(); 

                    // P.java:18: error: Y is abstract; cannot be instantiated
                    // Y y2 = new Y();
                    //        ^
                    // 1 error

                    // case 3:

                    Y y3 = new X1();

        }
}