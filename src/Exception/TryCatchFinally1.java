package Exception;

public class TryCatchFinally1
{
	public String DivideTwoNumbers(int a,int b)
    {
        
            int value;
		String str = " ";
		
            try
            {
                    value = a / b;
		    str = ("The answer is :" +value);
            }
            catch (ArithmeticException ae)
            {
                    str = "Cannot divided by zero";
            }
            finally
            {
                    return(str+" Thanks for using the application);
            }
	    }		   
            public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a =  scn.nextInt();
        int b =  scn.nextInt();
        TryCatchFinally1 div = new TryCatchFinally1();
        System.out.print(div.DivideTwoNumbers(a,b));
}
}
   


