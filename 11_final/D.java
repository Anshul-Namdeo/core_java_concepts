class W {
    int y = 0;

    void pro(){
        System.out.println("jay");
    }
}
class D {
    public static void main(String[] args){
        D x = new D();

        System.out.println(x.y);
        x.pro();
    }
}
// D.java:12: error: cannot find symbol
//         System.out.println(x.y);
//                             ^
//   symbol:   variable y
//   location: variable x of type D
// D.java:13: error: cannot find symbol
//         x.pro();
//          ^
//   symbol:   method pro()
//   location: variable x of type D
// 2 errors