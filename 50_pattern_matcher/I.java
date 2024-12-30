import java.util.regex.Pattern;
import java.util.regex.Matcher;

class I 
{
    public static void main(String args[])
    {
        Pattern p = Pattern.compile("sohan");
        Matcher m = p.matcher("mohan is a good boy and mohan is my best frienf and mohan scored 90 out of 100");

        if(m.find())
        {
            System.out.println(m.group());
        }
    }
}

// Explantion : hum ne (regex string mai sohan pass kiya hai ) or targetString(mai mohan........) to jb find() method sohan ko targetString mai find karega to wo usa ko kahi par bhi nhi milega to find() method (false) return karegi . to hum if{} block ke ander hi nhi ja payenge or kuch bhi print nhi hoga or hi koi error or exception aa gya..


// happily compile and run..