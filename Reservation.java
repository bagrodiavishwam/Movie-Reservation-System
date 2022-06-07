package MovieReservation;
import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Reservation extends JPanel
{
	static ArrayList<String> s=new ArrayList<String>();
	static int a=0;
	public void file()
	{
    	s=arraylist.main();
	}
	public void paintComponent(Graphics g)
	{

    	if(a==0)
    	{

        	Scanner sc=new Scanner(System.in);
        	super.paintComponent(g);
        	this.setBackground(Color.WHITE);
        	g.setColor(Color.GREEN);
        	g.fillRect(25,25,25,25);
        	g.setColor(Color.RED);
        	g.fillRect(25,75,25,25);
        	g.setColor(Color.BLACK);
        	g.drawString("The seat is available",60,40);
        	g.drawString("The seat is not available",60,90);
        	boolean f=false;
        	for(int i=0;i<21;i++)
        	{
            	g.drawString(Integer.toString(i),(35+(i*50)),140);
        	}
        	for(int j=65;j<=75;j++)
        	{
            	g.drawString((""+(char)j),20,170+(((j-65)*50)));
        	}
        	for(int i=0;i<21;i++)
        	{
            	for(int j=65;j<=75;j++)
            	{
                	f=false;
                	boolean f1=false;
                	int temp1=j, temp2=i;
                	String r=(""+((char)temp1)+""+Integer.toString(temp2)+"");
                	for(String x: s)
                	{
                    	if(x.equalsIgnoreCase(r))
                    	f=true;
                    	else
                    	f1=false;
                	}
                	if(f==true)
                	{
                    	g.setColor(Color.RED);
                    	g.fillRect((30+(i*50)),(150+((j-65)*50)),25,25);
                	}
                	else
                	{
                    	JButton b=new JButton();
                    	b.setSize(25,25);
                    	b.setBackground(Color.lightGray);
                    	b.setLocation((30+(i*50)),(150+((j-65)*50)));
                    	b.addActionListener(new ActionListener()
                    	{
                        	Bill ob=new Bill();
                        	public void actionPerformed(ActionEvent e)
                        	{
                            	b.setBackground(Color.GREEN);
                            	if(s.contains(r)==false)
                            	{
                                	file.main((""+((char)temp1)+""+Integer.toString(temp2)+""));
                                	ob.number();
                                	ob.seat(temp1);
                            	}
                        	}
                    	});
                    	add(b);
                	}
                	if(f1==false)
                	{
                    	g.setColor(Color.WHITE);
                    	g.fillRect(290,400,275,100);
                    	g.setColor(Color.RED);
                    	g.setFont(new Font("TimesNewRoman",Font.BOLD, 50));
                    	g.drawString("SOLD OUT",300,450);
                	}
            	}
        	}
        	g.setColor(Color.BLACK);
        	g.fillRect(50,850,1000,50);
        	g.setFont(new Font("TimesNewRoman",Font.PLAIN, 50));
        	g.drawString("Screen This Way", 300,950);
        	JButton b=new JButton("Next");
        	b.setLocation(1000, 950);
        	b.setSize(105,55);
        	b.setBackground(Color.lightGray);
        	b.addActionListener(new ActionListener()
        	{
            	Bill ob=new Bill();
            	public void actionPerformed(ActionEvent e)
            	{
                	ob.print();
                	Frame1.close();
            	}
        	});
        	add(b);
    	}
    	a++;
	}
}
