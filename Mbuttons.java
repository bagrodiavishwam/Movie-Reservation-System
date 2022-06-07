/** CHANGE PATH ACCORDING TO SYSTEM. WRITTEN PROGRAM HAS WINDOWS PATH. BEWARE!!!
*/

package MovieReservation;
import java.awt.*;
import java.net.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
public class MButtons extends JPanel
{
	static int a=0;
	int i=0;
	String movie="";
	//String p1="C:\\Users\\Admin\\desktop\\Movie Reservation\\";
  String p1="/Users/vishwambagrodia/desktop/Movie Reservation/";
	int m=0;
	public void paintComponent(Graphics g)
	{
    	if(a==0)
    	{

    	try
    	{
        	super.paintComponent(g);
        	this.setBackground(Color.WHITE);
        	g.setColor(Color.BLACK);
        	g.setFont(new Font("TimesNewRoman",Font.PLAIN, 50));
        	g.drawString("Choose a movie",800,40);
        	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        	FileReader fr=new FileReader("Buttons.txt");
        	BufferedReader br1=new BufferedReader(fr);
        	String path=p1;
        	int c=0, j=0, c1=0;
        	int check=count();
        	while(check>c1)
        	{
            	movie=br1.readLine();
            	c1++;
            	c++;
            	path=p1+movie+".jpg";
            	JButton button=new JButton(movie ,new ImageIcon(path));
            	button.setSize(225,425);
            	if(c>7)
            	{
                	c=0;
                	i=0;
                	j++;
            	}
            	button.setLocation((50+(i*250)),80+(j*450));
            	button.setHorizontalTextPosition(SwingConstants.CENTER);
            	button.setVerticalTextPosition(SwingConstants.BOTTOM);
            	button.addActionListener(new ActionListener()
            	{
                	String temp=movie;
                	public void actionPerformed(ActionEvent e)
                	{
                    	Bill.movie(temp);

                    	if(m==0)
                    	Frame3.main();
                    	Frame2.close();
                    	m++;
                	}
            	});
            	add(button);
            	i++;
        	}
        	br1.close();
    	}
    	catch(Exception e)
    	{
        	e.printStackTrace();
    	}
    	a++;
	}
    	}
	int count()
	{
    	String str; int n=0;
    	try
    	{

        	FileReader fr=new FileReader("Buttons.txt");
        	BufferedReader br1=new BufferedReader(fr);
        	while((str=br1.readLine())!=null)
        	{
            	n++;
        	}

    	}
    	catch(Exception e)
    	{
        	e.printStackTrace();
    	}
    	return(n);
	}
}
