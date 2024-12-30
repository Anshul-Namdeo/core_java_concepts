public class R1 {
    
    public static void main(String[] args) {
        
        String [] names = {"goppal", "kamlesh", "rajeev","manoj","ritik","prateek"};

        // for( String i :names)
        // {
        //     System.out.print(i + " ");
        // }

        // String  str = String.join(" and ", names);
        // System.out.println(str);

        String  str = String.join(", ", names);
        System.out.println(str);


    }
}

// D:\javaprac\27_string>javac R1.java

// D:\javaprac\27_string>java R1
// goppal, kamlesh, rajeev, manoj, ritik, prateek
