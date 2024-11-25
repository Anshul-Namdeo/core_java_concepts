class D {

        public static void main(String[] args){

                    D d1 = new D();
                    System.out.println(d1.y);
        }

}

class W{

        int y = 20;
}

// D.java:6: error: cannot find symbol
//                     System.out.println(d1.y);
//                                          ^
//   symbol:   variable y
//   location: variable d1 of type D
// 1 error