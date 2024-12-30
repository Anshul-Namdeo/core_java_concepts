class V 
{
    public static void main(String args[])
    {
        try{

        }catch(Exception... x){

        }
    }
}

// Note : (var_args) only constructor or method ki parameter body mai likh sakte hai baki kahi per bhi nhi likh sakte hai..


// D:\javaprac\52_var_args>javac V.java
// V.java:7: error: <identifier> expected
//         }catch(Exception... x){
//                         ^
// V.java:7: error: not a statement
//         }catch(Exception... x){
//                             ^
// V.java:7: error: ';' expected
//         }catch(Exception... x){
//                              ^
// V.java:11: error: reached end of file while parsing
// }
//  ^
// 4 errors