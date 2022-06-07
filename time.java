package MovieReservation;
import java.awt.*;
import java.net.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.*;
public class time extends JPanel
{
	static int a=0;
	int i=1;
	String sen=" ";
	int c=0;
	public void paintComponent(Graphics g)
	{
    	if (a==0)
    	{
        	try
        	{
            	a++;
            	super.paintComponent(g);
            	this.setBackground(Color.WHITE);
            	g.setColor(Color.BLACK);
            	g.setFont(new Font("TimesNewRoman",Font.PLAIN, 26));
            	g.drawString("Choose movie timings",180,40);
            	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            	FileReader fr=new FileReader("time.txt");
            	BufferedReader br1=new BufferedReader(fr);
            	while((sen=br1.readLine())!=null)
            	{
                	JButton button=new JButton(sen);
                	button.setSize(75, 25);
                	button.setLocation(300,(20+(i*50)));
                	button.addActionListener(new ActionListener()
                	{
                    	Bill ob=new Bill();
                    	String temp=sen;
                    	public void actionPerformed(ActionEvent e)
                    	{
                        	ob.time(temp);
                        	Frame3.close();
                        	if(c==0)
                        	Frame1.main();
                        	c++;
                    	}
                	});
                	add(button);
                	i++;
            	}
        	}
        	catch(Exception e)
        	{
            	e.printStackTrace();
        	}

    	}

	}
}
