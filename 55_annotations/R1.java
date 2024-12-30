@interface Mno 
{
    String aaa() default "ram";
}

@Mno
class R1 
{

}

// hapily compile...