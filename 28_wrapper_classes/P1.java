class P1 
{
    public static void main(String[] args) {
        
        long k = 9223372036854775807l;

        Float f = Float.valueOf(k);

        float e = 9.22337036854775807e28f;

        System.out.println(f);
        System.out.println(e);
    }
}

// D:\javaprac\28_wrapper_classes>javac P1.java

// D:\javaprac\28_wrapper_classes>java P1
// 9.223372E18
// 9.22337E28