package Exception;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class CheckedException 
{
public static void main(String[] args) throws FileNotFoundException
{
FileInputStream DOC = null;
try
{
DOC = new FileInputStream("C:\\test\\a.txt");
}
catch (FileNotFoundException e)
{
System .out.println("File does not exits");
}
}
}




	


