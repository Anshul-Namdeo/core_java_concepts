class P {

        public static void main(String args[]){
        
         //operator overloading(java does not support operator overloading)

         
         System.out.println(12 + 13);
         System.out.println(1.2 + 1.3);
         System.out.println(10 + 1.3);
         System.out.println("om" + 13);
         System.out.println("om" + "ji");
         System.out.println("om"+ true);
         System.out.println("om" + new Student());
         System.out.println("om" * 9);

        //  P.java:15: error: bad operand types for binary operator '*'
        //  System.out.println("om" * 9);
        //                          ^
        // first type:  String
        //  second type: int
        //   1 error
        }
}

class Student{

}