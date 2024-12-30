class Y1 
{
    public static void main(String[] args) {
        
        Thread t = new Thread("pqr");

        t.setPriority(6);


        System.out.println(t);
    }
}


// D:\javaprac\33_exception_handling>javac Y1.java

// D:\javaprac\33_exception_handling>java Y1
// Thread[pqr,6,main]
