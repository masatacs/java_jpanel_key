import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class Main
{
  public static void main( String args[] )
  {
    Frame f = new Frame( "KEYTEST", 500, 400 );
    f.setVisible( true );
  }
}

class Frame extends JFrame
{
  public Frame( String title, int width, int height )
  {
    setTitle( title );
    setSize( width, height );
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    
    Panel panel = new Panel();
    
    Container ct = getContentPane();
    ct.add( panel );
  }
}

class Panel extends JPanel
{
  public Panel()
  {
    setFocusable( true );
    enableEvents( AWTEvents.KEY_EVENT_MASK );
  }
  
  protected void processKeyEvent( KeyEvent e )
  {
    System.out.println( "キーが押されたよ" );
  }
}
