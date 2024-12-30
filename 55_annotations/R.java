@interface Efg 
{
    String xyz();
}

@Efg
class R 
{

}

// D:\javaprac\55_annotations>javac R.java
// R.java:6: error: annotation @Efg is missing a default value for the element 'xyz'
// @Efg
// ^
// 1 error
