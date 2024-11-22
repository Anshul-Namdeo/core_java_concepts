class A {

        public static void main(String[] args){

                B x = new B();

                x.pro();

                C y = new C();

                y.Info();
        }
}

// A.java:9: error: cannot find symbol
//                 C y = new C();
//                 ^
//   symbol:   class C
//   location: class A
// A.java:9: error: cannot find symbol
//                 C y = new C();
//                           ^
//   symbol:   class C
//   location: class A
// 2 errors