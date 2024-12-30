import java.util.regex.Pattern;
import java.util.regex.Matcher;

class E1 
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("mohan");

        Matcher m = p.matcher("mohan is a good boy and mohan is my best friend and mohan scored 90 out of 100");

        System.out.println(p);  
        System.out.println(m);
    }
}

// D:\javaprac\50_pattern_matcher>javac E1.java

// D:\javaprac\50_pattern_matcher>java E1
// mohan
// java.util.regex.Matcher[pattern=mohan region=0,78 lastmatch=]

// Note : region(0-78)  wo hai jis hum ne jo matcher ki parameter body (" ") mai jo string likhi hai usa string ki lemgth ka size hai 78. to wo region bata raha hai.