class W1 {

        int y = 9;

        W1(){
            this();
            System.out.println(y);
        }

        public static void main(String args[]){

                W1  x = new W1();

                System.out.println(x.y);
        }
}

// D:\javaprac\20_constructor>javac W1.java
// W1.java:5: error: recursive constructor invocation
//         W1(){
//         ^
// 1 error
