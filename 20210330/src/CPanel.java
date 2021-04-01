import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

public class CPanel extends JPanel{
	public CPanel() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(46, 84, 57, 15);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(295, 108, 57, 15);
		add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(82, 159, 97, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(295, 159, 97, 23);
		add(btnNewButton_1);
	}
}
