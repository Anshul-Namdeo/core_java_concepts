class X2 extends X1{

}

class X1 {
            
}

class D {

        public static void main(String[] args){

          //   case 1:
             
                X1  x  = new X2();
   //         (parent)      (child)

             //   case 2:

                X2 y =  new X1();
   //          (child)        (parent)

        }
}

// D.java:20: error: incompatible types: X1 cannot be converted to X2
//                 X2 y =  new X1();
//                         ^
// 1 error

// case 1:   case 1 mai hum ne parent class ke variavle mai child class ke object ka ref.. code store kar baya hai jo ki shi hai ...


// case 2: case 2 mai hum ne child class ke varivale main parent clas ke object ka ref.. code store kar baya hai jo ki glt hai bec.. 