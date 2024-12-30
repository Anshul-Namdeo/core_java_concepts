class J 
{
    public static void main(String[] args) {
        
        String x = new String("ganesh");
        String y = new String("ramesh");
        String z = new String("ramesh");

        System.out.println(y.compareTo(x));
        System.out.println(x.compareTo(y));
        System.out.println(z.compareTo(y));
    }
}

// D:\javaprac\39_collections>javac J.java

// D:\javaprac\39_collections>java J
// 11
// -11
// 0