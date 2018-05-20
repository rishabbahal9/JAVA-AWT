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

    public static void main(String[] argmnts) throws IOException
    {
        System.out.println("I dont give a fuck to anyone.");
        MyFrame m=new MyFrame();
        m.setTitle("Rishab Bahal");
        m.setSize(300,320);
        m.setVisible(true);
    }
}
