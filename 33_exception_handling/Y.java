class Y 
{
    public static void main(String[] args) {
        
        Thread t = new Thread("abc");

        t.setPriority(2);


        System.out.println(t);
    }
}


// D:\javaprac\33_exception_handling>javac Y.java

// D:\javaprac\33_exception_handling>java Y
// Thread[abc,2,main]
