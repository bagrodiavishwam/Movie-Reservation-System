package MovieReservation;
import java.io.*;
import java.util.*;
class arraylist extends Bill
{
	static String str="Reservation"+movie;
	static int i=0, c=0;
	public static ArrayList<String> main()
	{
     	ArrayList<String> s=new ArrayList<String>();
     	while(time.charAt(i)!=':'&&c==0)
     	{
         	str=str+time.charAt(i);
         	i++;
        	}
     	try(BufferedReader br1=new BufferedReader(new FileReader(str+".txt")))
     	{
         	while(br1.ready())
         	{
             	s.add(br1.readLine());
            	}
     	}
     	catch(IOException e)
     	{
         	System.out.print("");
        	}
     	return(s);
    	}
}
