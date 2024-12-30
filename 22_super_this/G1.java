class Y1 {
    int x = 88 ;
}

class G1 extends Y1{                                                                           

        int x = 44 ;

        void pro(){
          //  int x = 11;

            System.out.println(x);
        }

        public static void main(String args[]){
            G1 g =  new G1();

            g.pro();
        }
}

// D:\javaprac\22_super_this>javac G1.java

// D:\javaprac\22_super_this>java G1
// 44

