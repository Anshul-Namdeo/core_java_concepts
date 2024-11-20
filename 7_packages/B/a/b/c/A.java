package a.b.c;

import x.y.z.B;

class A {

        public static void main(String[] args){

                B x;
        }
}


// D:\javaprac\7_packages\B>javac a/b/c/A.java
// a\b\c\A.java:3: error: B is not public in x.y.z; cannot be accessed from outside package
// import x.y.z.B;
//             ^
// a\b\c\A.java:9: error: B is not public in x.y.z; cannot be accessed from outside package
//                 B x;
//                 ^
// 2 errors