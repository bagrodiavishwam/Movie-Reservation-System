package MovieReservation;
import javax.swing.*;
import java.io.*;
import java.util.*;
 public class Frame1
 {
 	static JFrame f=new JFrame("Reservation window");
 	public static void main()
 	{

     	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     	Reservation r=new Reservation();
     	r.file();
     	f.add(r);
     	f.setSize(7000,50000);
     	f.setVisible(true);
    	}
 	static void close()
 	{
     	f.dispose();
    	}
}
