package x;

import y.B;

class A implements B {

        public static void main(String[] args){


        }
}

// D:\javaprac\13_interface\G>javac x/A.java
// x\A.java:3: error: B is not public in y; cannot be accessed from outside package
// import y.B;
//         ^
// x\A.java:5: error: B is not public in y; cannot be accessed from outside package
// class A implements B {
//                    ^
// 2 errors