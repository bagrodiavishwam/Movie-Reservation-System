package MovieReservation;
class Bill
{
	static int a=0;
	static int p=0;
	static int g=0;
	static int s=0;
	public static String movie="";
	public static String time="";
	public static void number()//this executes second
	{
    	a=a+1;
	}
	public static void print()
	{

    	System.out.println("   Movie: "+movie);
    	System.out.println("   Time:  "+time);
    	System.out.println("Number of seats booked:"+a);
    	if(p!=0)
    	System.out.println(p+" premium seat(s) booked");
    	if(g!=0)
    	System.out.println(g+" gold seat(s) booked");
    	if(s!=0)
    	System.out.println(s+" silver seat(s) booked");
    	double amt=(p*200+g*150+s*100);
    	System.out.println("Total Amount:"+amt);
    	System.out.println("Tax:     	"+(15*amt/100));
    	System.out.println("Net Amount  :"+(amt*(115/100)));
    	System.out.println("*********************************");
    	System.out.println("Thank you for choosing Project12 \nto enjoy your movie. We wish you\n   a great movie experience");
	}
	public static void movie(String n)//this executes first
	{
    	movie=n;

	}
	public static void seat(int n)
	{
    	if(n==65)
    	p++;
    	else if(n>=66&&n<=72)
    	g++;
    	else if(n>=73)
    	s++;
	}
	public static void time(String t)
	{
    	time=t;

	}
}
