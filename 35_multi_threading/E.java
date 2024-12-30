class E 
{
    public static void main(String[] args) {
        
        Thread  x = Thread.currentThread();

        System.out.println("-----Dafault Thread Details-----");
        System.out.println("Thread Name -" + x.getName());
        System.out.println("Thread Id -"+ x.getId());
        System.out.println("Thread Priority -" + x.getPriority());
    }
}


// D:\javaprac\35_multi_threading>javac E.java

// D:\javaprac\35_multi_threading>java E
// -----Dafault Thread Details-----
// Thread Name -main
// Thread Id -1
// Thread Priority -5