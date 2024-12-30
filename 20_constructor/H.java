class X1 {

        X1(){
                // super();
                System.out.println("y");
        }
}

class X2 extends X1 {

        X2(){
                // super();
                System.out.println("A");
        }
}

class X3 extends X2 {

        X3(){
                // super();
                System.out.println("W");
        }
}

class H {

        public static void main(String args[]){

                System.out.println("T");

                X3 a = new X3();

                System.out.println("D");
        }
}

// conclusion : main method se execution start hoga . to subse phle T print ho jayaega then x3 class ka ek variavle banaya hai or new keyword ke through usa ka object banaya hai . fir constructor X3() ko dekhte hi wo constructor X3 par jayrga waha par user make constructor hai to jb bhi koi user apna khud ka constructor banata hai to usa constructor ke ander ek keyword jis ka nam super() hai wo first line mai hi likha hota hai jo ki hide hota hai dikhta nhi hai . ab super ka mtlb hota hai ki usa ka bhi parent agr X3 ka koi parent hoga to wo usa ke pass jayega ..... 