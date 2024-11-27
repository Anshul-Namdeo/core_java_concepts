abstract class X2 {

        abstract void abc();
}

class E {

        public static void main(String[] args){

                X2 a = new X2();
        }
}

// E.java:10: error: X2 is abstract; cannot be instantiated
//                 X2 a = new X2();
//                        ^
// 1 error