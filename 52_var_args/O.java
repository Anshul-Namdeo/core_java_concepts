class O 
{
    static void pro(String[] x)  // ye method bhi String arr get kar rahi hai..
    {
        for(String next : x)
        {
            System.out.println(next + " ----- ");
        }
    }

    static void pro(String... x)   // ye (var_args)method bhi String arr get kar rahi hai..
    {
        for(String next : x)
        {
            System.out.println(next + " ##### ");
        }
    }

    public static void main(String args[])
    {
        String[] arr = { "om", "jay", "ram" };
        pro(arr);
    }
}

// Note : agar dono method String arr ko get kar rahi hai to hum ek sath dono mai method ko declear nhi kar sakte hai bec.. duplicate methods are not allowed



// D:\javaprac\52_var_args>javac O.java
// O.java:11: error: cannot declare both pro(String...) and pro(String[]) in O
//     static void pro(String... x) // ye (var_args)method bhi String arr get kar rahi hai..
//                 ^
// 1 error
