class HH {

        static void pro(){

        }
}

class GG extends HH {

        static int pro(){
            return 0;
        }
}

// D:\javaprac\18_overriding>javac R1.java
// R1.java:10: error: pro() in GG cannot hide pro() in HH
//         static int pro(){
//                    ^
//   return type int is not compatible with void
// 1 error