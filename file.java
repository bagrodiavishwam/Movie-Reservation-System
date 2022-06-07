package MovieReservation;
import java.io.*;
class file extends Bill
{
	static String str="Reservation"+movie;
	static int i=0, c=0;
	public static void main(String a)
	{
    	while(time.charAt(i)!=':'&&c==0)
    	{
        	str=str+time.charAt(i);
        	i++;
    	}
    	c=-1;
    	try
    	{
        	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        	FileWriter fw=new FileWriter((str+".txt"), true);
        	BufferedWriter bw=new BufferedWriter(fw);
        	PrintWriter pw=new PrintWriter(bw);
        	pw.println(a);
        	pw.close();
        	bw.close();
        	fw.close();
    	}
    	catch(Exception e)
    	{
        	System.out.print("");
    	}
   }
}
