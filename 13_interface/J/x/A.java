package x;

import y.B;

class A implements B {

     /*public*/ void pro(){

        }
}

// x\A.java:7: error: pro() in A cannot implement pro() in B
//         void pro(){
//              ^
//   attempting to assign weaker access privileges; was public
// 1 error
