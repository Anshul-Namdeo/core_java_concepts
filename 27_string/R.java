public class R {
    
    public static void main(String[] args) {
        
        String [] names = {"goppal", "kamlesh", "rajeev","manoj","ritik","prateek"};

        // for( String i :names)
        // {
        //     System.out.print(i + " ");
        // }

        String  str = String.join(" and ", names);
        System.out.println(str);
    }
}


// D:\javaprac\27_string>javac R.java

// D:\javaprac\27_string>java R
// goppal and kamlesh and rajeev and manoj and ritik and prateek

