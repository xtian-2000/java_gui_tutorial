import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gui_JFrame extends JFrame{
	private JLabel item1;
	
	// Added a constructor
	public Gui_JFrame() {
		super("Title Bar");											// Title bar of the window
		setLayout(new FlowLayout());								// Layout of the window
		
		item1 = new JLabel("Hello World!");
		item1.setToolTipText("Shows on hover");
		add(item1);
	}
}
