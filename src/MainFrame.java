import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame {

	private TextPanel textPanel;
	private ToolBar toolBar;
	private FormPanel formPanel;

	public MainFrame() {
		super("Hello World");

		setLayout(new BorderLayout());

		toolBar = new ToolBar();
		textPanel = new TextPanel();
		formPanel = new FormPanel();

		toolBar.setStringListener(new StringListener() {
			public void textEmitted(String text) {
				textPanel.appendText(text);
			}
		});

		formPanel.setFormListener(new FormListener() {
			public void formEventOccurred(FormEvent e) {
				String name = e.getName();
				String occupation = e.getOccupation();

				textPanel.appendText(name + ":" + occupation + "\n");
			}
		});
		add(formPanel, BorderLayout.WEST);
		add(toolBar, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);

		setSize(600, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
