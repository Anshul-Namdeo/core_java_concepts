class M 
{
    public static void main(String[] args) {
        
        boolean flag = Thread.currentThread().isAlive();

        System.out.println(flag);
    }
}

// D:\javaprac\35_multi_threading>javac M.java

// D:\javaprac\35_multi_threading>java M
// true
