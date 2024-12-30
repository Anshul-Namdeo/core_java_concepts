class Y2 
{
    public static void main(String[] args) {
        
        Thread t = new Thread("zxcvbnm");

        t.setPriority(9);


        System.out.println(t);
    }
}


// D:\javaprac\33_exception_handling>javac Y2.java

// D:\javaprac\33_exception_handling>java Y2
// Thread[zxcvbnm,9,main]
