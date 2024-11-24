/*final*/ class R{
    void aaa(){
        System.out.println("aaa form class R");
    }
    final void bbb(){
        System.out.println("bbb form class R");
    }
    void ccc(){
        System.out.println("ccc from class R");
    }
}

class J extends R{
    void aaa(){
        System.out.println("aaa from class J");
    }
    void bbb(){
        System.out.println("bbb from class J");
    }
    void ccc(){
        System.out.println("ccc from class J");
    }


        public static void main(String[]args){
            J x = new J();

            x.aaa();
            x.bbb();
            x.ccc();
        }
        }

//         J.java:17: error: bbb() in J cannot override bbb() in R
//     void bbb(){
//          ^
//   overridden method is final
// 1 error
