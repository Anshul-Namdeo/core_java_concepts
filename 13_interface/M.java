interface X2 {
     int y = 20;
}

class M implements X2 {
     public static void main(String[] args){
        
        System.out.println(X2.y);

        X2.y = 89;

        System.out.println(X2.y);
     }
}

// M.java:10: error: cannot assign a value to final variable y
//         X2.y = 89;
//           ^
// 