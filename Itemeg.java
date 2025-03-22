import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
public class Itemeg extends JFrame implements ItemListener
{ 
	JCheckBox checkBox1,checkBox2;
	JLabel label;
	Itemeg(){
		JFrame frame=new JFrame("CheckBoxExample");
		frame.setLayout(null);
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label= new JLabel();
		label.setBounds(100,200,200,50);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		frame.add(label);
		
		checkBox1=new JCheckBox("c++");
		checkBox1.setBounds(100,50,100,50);
		frame.add(checkBox1);
		checkBox2=new JCheckBox("Java");
		checkBox2.setBounds(100,100,100,50);
		frame.add(checkBox2);
		checkBox1.addItemListener(this);
		checkBox2.addItemListener(this);
		frame.setVisible(true);
	}
	@Override
	public void itemStateChanged(ItemEvent e)
	{
	 if(e.getSource()==checkBox1)
	 {
		 label.setText("c++ Checkbox : " +(e.getStateChange()==ItemEvent.SELECTED?"Checked" :"Unchecked"));
	 }
	 else if(e.getSource()==checkBox2)
	 {
		 label.setText("Java CheckBox: "+(e.getStateChange()==ItemEvent.SELECTED?"Checked" : "Unchecked"));
	 }
	}
		
	public static void main(String[] args) {
	new Itemeg();

	}

}
