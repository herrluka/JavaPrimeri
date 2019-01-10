package Stek;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class modLinija extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtPocKoordX;
	private JTextField txtPocKoordY;
	private JTextField txtKrKoordX;
	private JTextField txtKrKoordY;
	private boolean ok;
	

	public String getTxtPocKoordX() {
		return txtPocKoordX.getText();
	}

	public void setTxtPocKoordX(String txtPocKoordX) {
		this.txtPocKoordX.setText(txtPocKoordX);
	}

	public String getTxtPocKoordY() {
		return txtPocKoordY.getText();
	}

	public void setTxtPocKoordY(String txtPocKoordY) {
		this.txtPocKoordY.setText(txtPocKoordY);
	}

	public String getTxtKrKoordX() {
		return txtKrKoordX.getText();
	}

	public void setTxtKrKoordX(String txtKrKoordX) {
		this.txtKrKoordX.setText(txtKrKoordX);
	}

	public String getTxtKrKoordY() {
		return txtKrKoordY.getText();
	}

	public void setTxtKrKoordY(String txtKrKoordY) {
		this.txtKrKoordY.setText(txtKrKoordY);
	}

	public boolean isOk() {
		return ok;
	}

	public void setOk(boolean ok) {
		this.ok = ok;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			modLinija dialog = new modLinija();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public modLinija() {
		setBounds(100, 100, 551, 477);
		getContentPane().setLayout(new BorderLayout());
		setModal(true);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		JLabel lblPocetnaTacka = new JLabel("Po\u010Detna ta\u010Dka");
		lblPocetnaTacka.setFont(new Font("Tahoma", Font.PLAIN, 21));
		JLabel lblPocKoordX = new JLabel("Koordinata X");
		lblPocKoordX.setFont(new Font("Tahoma", Font.PLAIN, 20));
		JLabel lblPocKoordY = new JLabel("Koordinata Y");
		lblPocKoordY.setFont(new Font("Tahoma", Font.PLAIN, 20));
		JLabel lblKrajnjaTacka = new JLabel("Krajnja ta\u010Dka");
		lblKrajnjaTacka.setFont(new Font("Tahoma", Font.PLAIN, 21));
		JLabel lblKrKoordX = new JLabel("Koordinata X");
		lblKrKoordX.setFont(new Font("Tahoma", Font.PLAIN, 20));
		JLabel lblKrKoordY = new JLabel("Koordinata Y");
		lblKrKoordY.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPocKoordX = new JTextField();
		txtPocKoordX.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPocKoordX.setColumns(10);
		txtPocKoordY = new JTextField();
		txtPocKoordY.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPocKoordY.setColumns(10);
		txtKrKoordX = new JTextField();
		txtKrKoordX.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtKrKoordX.setColumns(10);
		txtKrKoordY = new JTextField();
		txtKrKoordY.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtKrKoordY.setColumns(10);
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(34)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPocetnaTacka)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lblPocKoordY, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblPocKoordX, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblKrKoordX, Alignment.LEADING)
								.addComponent(lblKrajnjaTacka, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
								.addComponent(lblKrKoordY, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(38)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(txtKrKoordY, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPocKoordY, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPocKoordX, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtKrKoordX, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(311))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblPocetnaTacka)
							.addGap(29)
							.addComponent(lblPocKoordX))
						.addComponent(txtPocKoordX, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblPocKoordY)
						.addComponent(txtPocKoordY, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblKrajnjaTacka, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblKrKoordX))
						.addComponent(txtKrKoordX, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblKrKoordY)
						.addComponent(txtKrKoordY, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(137, Short.MAX_VALUE))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						setOk(true);
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
