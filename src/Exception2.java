import java.util.Scanner;

public class Exception2 {
	 public static void main(String args[])
	    {
	        Exception2 opr=new Exception2();
	        Scanner sc=new Scanner(System.in);
	        String op=sc.next();
	        double d;
	        try
	        {
	        if(!(op.matches("[+-/*]")))
	        {
	           throw new ExceptionHandler("Unsupported Operator Exception");
	           
	        }
	        }
	        catch(ExceptionHandler e)
	        {
	            System.out.println(e);
	            System.exit(3);
	        }
	        String od1s=sc.next();
	        String od2s=sc.next();
	        d=opr.opearation(op,od1s,od2s);
	        System.out.println(d);
	    }
	    public double opearation(String op, String od1 , String od2)
	    {
	        double res=0;
	        double d1=0;
	        double d2=0;
	        try
	        {
	            d1=Double.parseDouble(od1);                
	        }
	        catch(NumberFormatException e)
	        {
	            System.out.println("Exception in "+op+" this data is not compatible " +od1);
	            System.exit(1);
	        }
	        try
	        {
	            d2=Double.parseDouble(od2);           
	        }
	        catch(NumberFormatException e)
	        {
	            System.out.println("Exception in "+op+" this data is not compatible " +od2);
	            System.exit(2);
	        }
	        try {
	                if(op.equals("+"))
	                    res=d1+d2;
	                else if(op.equals("-"))
	                    res=d1-d2;
	                else if(op.equals("*"))
	                    res=d1*d2;
	                else
	                    res=d1/d2;            
	        } 
	        catch(NullPointerException e)
	        {
	            System.out.println(e);
	        }
	        catch (ArithmeticException e) {
	            System.out.println(e);
	        }
	            return res;
	      }

}
