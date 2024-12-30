public class W {
    
    public static void main(String[] args) {
        
        String x = "mohan is a good boy";

        String y = x.replace("good", "bad").toUpperCase().substring(5,15).trim();

        System.out.println(y);
    }
}


// D:\javaprac\27_string>javac W.java

// D:\javaprac\27_string>java W
// IS A BAD
