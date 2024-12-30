public class U {
    
    public static void main(String[] args) {
        
        String y = "manojawam";

        char[] x = {'m','a','n','o','j','a','w','a','m'};

        String str = String.valueOf(x); // a new String object in non-pool  memory will be created

        System.out.println(str == y);
    }
}

// D:\javaprac\27_string>javac U.java

// D:\javaprac\27_string>java U
// false
