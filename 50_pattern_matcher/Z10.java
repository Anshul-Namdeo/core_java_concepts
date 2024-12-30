import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Z10 
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("[0-9]{10}");
        Matcher m = p.matcher("0000000000");

        if(m.matches())
        {
            System.out.println("match: " + m.group()  + " start: " + m.start() + " end: " + m.end());
        }else{
            System.out.println("No match");
        }
    }
}


// D:\javaprac\50_pattern_matcher>javac Z10.java

// D:\javaprac\50_pattern_matcher>java Z10
// match: 0000000000 start: 0 end: 10


// NOTE : 0000000000 eaisa to koi no. hota nhi hai jitne bhi no. hai wo may be(6,7,8,9) se start hote hai to usa ke liye hame ek logic likh na padhega.
