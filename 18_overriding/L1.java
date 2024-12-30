class AA {

        public void pro(){

        }
}

class BB extends AA {

        void pro(){

        }
}

// L1.java:10: error: pro() in BB cannot override pro() in AA
//         void pro(){
//              ^
//   attempting to assign weaker access privileges; was public
// 1 error