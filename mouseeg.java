import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class mouseeg  extends JFrame implements MouseListener
{
	JLabel label;
		mouseeg(){
			setTitle("Mouse Listener Example");
			setSize(400,400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(null);
			label=new JLabel();
			label.setBounds(50,150,300,50);
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setBorder(BorderFactory.createLineBorder(Color.black));
			add(label);
			addMouseListener(this);
			setVisible(true);
		}
	
	@Override
	public void mouseClicked(MouseEvent e) {
	label.setText("Mouse Clicked");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		label.setText("Mouse Pressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		label.setText("Mouse Released");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		label.setText("Mouse Entered");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		label.setText("Mouse Exited");
		
	}
	public static void main(String[] args) {
		new mouseeg();

	}
}

