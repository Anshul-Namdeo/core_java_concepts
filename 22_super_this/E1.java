class E1 {
    static void info(){
        System.out.println(this);
    }
}

// E1.java:3: error: non-static variable this cannot be referenced from a static context
//         System.out.println(this);
//                            ^
// 1 error

// conclusion : hum this keyword ko static block ke sath sath static method ke andar bhi nhi likh sakte hai