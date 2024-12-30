public class X {
    
    public static void main(String[] args) {
        
        String[] x = {"My name is :", "%s", "and my age is :","%d"};

        String y = "My Info => ";

        String z = y.concat(String.format(String.join(" ",x), "om",12));

        System.out.println(z);
    }
}

// D:\javaprac\27_string>javac X.java

// D:\javaprac\27_string>java X
// My Info => My name is : om and my age is : 12
