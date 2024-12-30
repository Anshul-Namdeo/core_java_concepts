class A2 {
        // overridden method
        final void pro(){

                System.out.println("hi");
        }
}

class B2 extends A2 {

        // overriding method
            void pro(){

                    System.out.println("hello");
            }
}

// I1.java:12: error: pro() in B2 cannot override pro() in A2
//             void pro(){
//                  ^
//   overridden method is final
// 1 error