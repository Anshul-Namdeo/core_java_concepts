class X {

        int a = 9;
}

interface Y {

        int a = 11;
}

class F extends X implements Y {

        public static void main(String args[]){

                F f = new F();

                System.out.println(f.a);
        }
}

// F.java:17: error: reference to a is ambiguous
//                 System.out.println(f.a);
//                                     ^
//   both variable a in X and variable a in Y match
// 1 error