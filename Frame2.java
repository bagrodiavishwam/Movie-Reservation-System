package MovieReservation;
import javax.swing.*;
import java.io.*;
import java.util.*;
public class Frame2
{
  static JFrame f=new JFrame(&quot;Reservation window&quot;);
  public static void main()
  {
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MButtons m=new MButtons();
          f.add(m);
          f.setSize(7000,50000);
          f.setVisible(true);
        }
      static void close()
      {
        f.dispose();//closes reservation window
      }
}
