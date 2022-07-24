import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ToolBar extends JPanel implements ActionListener{
	
	private JButton fileButton;
	private JButton editButton;
	
	private StringListener textListener;
	
	public ToolBar() {
		
		setBorder(BorderFactory.createEtchedBorder());
		
		fileButton = new JButton("File");
		editButton = new JButton("Edit");
		
		fileButton.addActionListener(this);
		editButton.addActionListener(this);
		
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(fileButton);
		add(editButton);
	}
	
	public void setStringListener(StringListener listener) {
		this.textListener = listener;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton)e.getSource();
		
		if (clicked ==fileButton) {
			if (textListener != null) {
			textListener.textEmitted("File Button\n");
	}
}
else if (clicked.equals(editButton)) {
			if (textListener != null) {
			textListener.textEmitted("Edit Button\n");
				}
			}
		}
	}
