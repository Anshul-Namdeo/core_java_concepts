class Q1 {
    public static void main(String args[]){

            long l = 45l;
            float f = 0.12f;
            double d = 12.3;

            int x ;

            x = l ;
             x = f ;
              x = d ;
    }
}

// Q1.java:10: error: incompatible types: possible lossy conversion from long to int
//             x = l ;
//                 ^
// Q1.java:11: error: incompatible types: possible lossy conversion from float to int
//              x = f ;
//                  ^
// Q1.java:12: error: incompatible types: possible lossy conversion from double to int
//               x = d ;
//                   ^
// 3 errors