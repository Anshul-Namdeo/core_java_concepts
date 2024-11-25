package a.b.c;

import x.y.z.B;

class A {

        public static void main(String[] args){

                B x = new B ();

                x.pro();
        }
}




// D:\javaprac\7_packages\D>javac a/b/c/A.java
// a\b\c\A.java:11: error: pro() is not public in B; cannot be accessed from outside package
//                 x.pro();
//                  ^
// 1 error