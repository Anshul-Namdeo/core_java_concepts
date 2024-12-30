class D 
{
    static void pro(int... x)
    {
        System.out.println("-----");
        for(int a : x)
        {
        System.out.println(a);
        }
    }

    public static void main(String... args)
    {
        // pro();
        // pro(12);
        // pro(12,13);
        // pro(12,13,14);
        // pro(12,13,14,15,16,17,18,19,20,21,22,32,33,44,55,66,77,88,99,00);

        int[] arr = {12,13,14,15,16,17,18,19};
        pro(arr);
    }
}


// D:\javaprac\52_var_args>javac D.java

// D:\javaprac\52_var_args>java D
// -----
// 12
// 13
// 14
// 15
// 16
// 17
// 18
// 19
