interface XY {

        void pro();
}

class T implements XY {

       /* public */ void pro(){

        }
}

// T.java:8: error: pro() in T cannot implement pro() in XY
//        /* public */ void pro(){
//                          ^
//   attempting to assign weaker access privileges; was public
// 1 error