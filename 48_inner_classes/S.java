class S 
{
    class J 
    {
        void info()
        {
            System.out.println("hi");
        }
    }

    public static void main(String args[])
    {
        S x = new S();
        J y = x.new J();

        x.info();
    }
}

// D:\javaprac\48_inner_classes>javac S.java
// S.java:16: error: cannot find symbol
//         x.info();
//          ^
//   symbol:   method info()
//   location: variable x of type S
// 1 error


// Note : outer class ke "(--Reference_variable--)" ke throw hum innner class ke "(member)" ko access nhi kar sakte hai.