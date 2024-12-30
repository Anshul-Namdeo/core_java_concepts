class C {
    public static void  main(String args[]){

        System.out.print(args[0] instanceof String);
        System.out.print(args[1] instanceof String);
        System.out.print(args[2] instanceof String);
        System.out.print(args[3] instanceof String);

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        System.out.print(args[0] );
        System.out.print(args[1]  +1);
        System.out.print(args[2] +1);
        System.out.print(args[3] );
    }
}
// java C mohan 23 89.23 true

// D:\javaprac\25_arrays>javac C.java

// D:\javaprac\25_arrays>java C mohan 23 89.23 true
// true true  true true!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
// mohan 231 89.231 true
