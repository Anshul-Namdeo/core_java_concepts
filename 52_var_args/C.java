class C 
{
    static void pro(int... x)
    {
        System.out.println("-----");
        for(int a : x)
        {
        System.out.println(a);
        }
    }

    public static void main(String args[])
    {
        // pro();
        // pro(12);
        // pro(12,13);
        // pro(12,13,14);
        pro(12,13,14,15,16,17,18,19,20,21,22,32,33,44,55,66,77,88,99,00);
    }
}



// D:\javaprac\52_var_args>javac C.java

// D:\javaprac\52_var_args>java C
// -----

// D:\javaprac\52_var_args>javac C.java

// D:\javaprac\52_var_args>java C
// -----
// 12

// D:\javaprac\52_var_args>javac C.java

// D:\javaprac\52_var_args>java C
// -----
// 12
// 13

// D:\javaprac\52_var_args>javac C.java

// D:\javaprac\52_var_args>java C
// -----
// 12
// 13
// 14

// D:\javaprac\52_var_args>javac C.java

// D:\javaprac\52_var_args>java C
// -----
// 12
// 13
// 14
// 15
// 16
// 17
// 18
// 19
// 20
// 21
// 22
// 32
// 33
// 44
// 55
// 66
// 77
// 88
// 99
// 0