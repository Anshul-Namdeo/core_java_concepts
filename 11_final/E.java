class V {
    int w = 123;

    void pro(){
        System.out.println("namste");
    }
}
class E{
    void pro(){
        System.out.println("good morninng");
    }

    public static void main(String[] aegs){
        E x = new E();

        System.out.println(x.w);
        x.pro();
    }
}

// E.java:16: error: cannot find symbol
//         System.out.println(x.w);
//                             ^
//   symbol:   variable w
//   location: variable x of type E
// 1 error