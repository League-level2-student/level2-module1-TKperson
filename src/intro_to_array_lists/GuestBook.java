package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	JFrame window;
	JPanel panel;
	
	JButton[] buttons;
	
	ArrayList<String> names = new ArrayList<String>();
	
	public static void main(String args[]) {
		new GuestBook().setUp();
	}
	
	public void setUp() {
		window = new JFrame("Stuff");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buttons = new JButton[2];
		
		buttons[0] = new JButton();
		buttons[1] = new JButton();
		
		buttons[0].setText("Add Name");
		buttons[1].setText("View Names");
		
		buttons[0].addActionListener(this);
		buttons[1].addActionListener(this);
		
		names.add("Bob Banders");
		names.add("Sandy Summers");
		names.add("Greg Ganders");
		names.add("Donny Doners");
		
		
		panel.add(buttons[0]);
		panel.add(buttons[1]);
		
		window.add(panel);
		
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		window.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton)e.getSource();
		
		if(clicked == buttons[0]) { //add name
			String newname = JOptionPane.showInputDialog("Type names: "); 
			names.add(newname);
		} else if(clicked == buttons[1]) { //view names
			
			//build list
			String listofnames = "";
			int i = 1;
			for(String name : names) {
				listofnames += i + ". " + name + "\n";
				i++;
			}
			
			//output list
			JOptionPane.showMessageDialog(null, listofnames);
		}
	}
	
}
