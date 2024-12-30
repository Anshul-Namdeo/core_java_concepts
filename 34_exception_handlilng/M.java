class X10
{
    void pro() throws ArrayIndexOutOfBoundsException {

        System.out.println("hello");
    }
}

class Y10 extends X10 
{
    // always legal method overriding - uncheaked exception

    void pro() throws ArithmeticException {

        System.out.println("hello");

    }
}