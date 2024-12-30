class Y1 {
    int x = 88 ;
}

class G2 extends Y1{                                                                           

      //  int x = 44 ;

        void pro(){
          //  int x = 11;

            System.out.println(x);
        }

        public static void main(String args[]){
            G2 g =  new G2();

            g.pro();
        }
}

// D:\javaprac\22_super_this>javac G2.java

// D:\javaprac\22_super_this>java G2
// 88



