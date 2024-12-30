class E {
    static {
        System.out.println(this);
    }
}
// E.java:3: error: non-static variable this cannot be referenced from a static context
//         System.out.println(this);
//                            ^
// 1 error

// conclusion : hum static block ke ander (non-static variable this) ka use nhi kar sakte hai ..