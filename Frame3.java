package MovieReservation;
import javax.swing.*;
import java.io.*;
import java.util.*;
 public class Frame3
 {
 	static JFrame f=new JFrame("Reservation window");
 	public static void main()
 	{
     	time m=new time();
     	f.add(m);
     	f.setSize(700,500);
     	f.setLocationRelativeTo(null);
     	f.setVisible(true);
    	}
    	static void close()
 	{
     	f.dispose();
    	}
}
