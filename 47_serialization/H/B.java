import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class B 
{
    public static void main(String args[])
    {
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"));
          Student st  =  (Student)  ois.readObject();

                System.out.println(st.name);
                System.out.println(st.age);
                System.out.println(st.marks);
                System.out.println(st.contact);

            ois.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}