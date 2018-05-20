import java.lang.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends Frame
{
    //Constructor
    MyFrame()
    {
        //For closing Window
        addWindowListener(new WindowAdapter()
                            {
                                @Override
                                public void windowClosing(WindowEvent e) {
                                    System.exit(0);
                                }

                            }
        );
        //End closing Window
    }
    //End Constructor MyFrame()

    public void paint(Graphics g)
    {
        this.setBackground(new Color(163,163,163));
        g.setColor(new Color(0,0,0));
        g.drawString("Hi! I am Rishab Bahal.",20,60);
        g.drawString("Hi! I am Rishab Bahal.",20,80);

    }
    public static void main(String[] argmnts) throws IOException
    {
        System.out.println("I dont give a fuck to anyone.");
        MyFrame m=new MyFrame();
        m.setTitle("Rishab Bahal");
        m.setSize(300,320);
        m.setVisible(true);
    }

}
