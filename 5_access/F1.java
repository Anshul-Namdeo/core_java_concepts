class F1{

        public static void main(String[] args){

            System.out.println(F1.e);
        }

}

class U{

        static boolean e = true ;
}

// F1.java:5: error: cannot find symbol
//             System.out.println(F1.e);
//                                  ^
//   symbol:   variable e
//   location: class F1
// 1 error