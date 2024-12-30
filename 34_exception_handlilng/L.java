class X9
{
    void pro() throws ArrayIndexOutOfBoundsException {

        System.out.println("hello");
    }
}

class Y9 extends X9 
{
    // always legal method overriding - uncheaked exception

    void pro() throws IndexOutOfBoundsException {

        System.out.println("hello");

    }
}