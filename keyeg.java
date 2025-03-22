import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.*;


public class keyeg extends JFrame implements KeyListener
{
	JLabel label;
	JTextArea textArea;
	keyeg()
	{
		label=new JLabel();
		label.setBounds(20,50,200,20);
		textArea=new JTextArea();
		textArea.setBounds(20,80,300,300);
		textArea.addKeyListener(this);
		add(label);
		add(textArea);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e) 
			{
				System.exit(0);
			}
		});		
	}

	
	@Override
	public void keyTyped(KeyEvent e) {
	 label.setText("Key Typed : "+e.getKeyChar());
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		 label.setText("Key Pressed : "+e.getKeyChar());
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		 label.setText("Key Released : "+e.getKeyChar());
		
	}
	public static void main(String[] args) {
new keyeg();

	}

}
