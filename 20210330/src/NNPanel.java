import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;

public class NNPanel extends JPanel {
	public NNPanel() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(287, 23, 97, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(287, 87, 97, 23);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(287, 158, 97, 23);
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(287, 221, 97, 23);
		add(btnNewButton_3);
		
		JPanel panel = new JPanel();
		panel.setBounds(48, 34, 196, 245);
		add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton_5 = new JButton("New button");
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_4 = new JButton("New button");
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton("New button");
		panel.add(btnNewButton_6);
	}

}