package components;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

import model.Model_User_Account;
import swing.ActiveStatus;

public class Item_people extends javax.swing.JPanel {

	private ActiveStatus activeStatus;
	private swing.ImageAvatar imageAvatar1;
	private JLabel lb;
	private JLabel lbStatus;

	public Model_User_Account getUser() {
		return user;
	}

	private Model_User_Account user;

	public Item_people(Model_User_Account user) {
		this.user = user;
		initComponents();
		lb.setText(user.getUserName());
		activeStatus.setActive(user.isStatus());
		init();
	}

	public void updateStatus() {
		activeStatus.setActive(user.isStatus());
	}

	private void init() {
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent me) {
				setBackground(new Color(230, 230, 230));
			}

			@Override
			public void mouseExited(MouseEvent me) {
				setBackground(new Color(242, 242, 242));
			}
		});
	}

	private void initComponents() {

		imageAvatar1 = new swing.ImageAvatar();
		lb = new javax.swing.JLabel();
		lbStatus = new javax.swing.JLabel();
		activeStatus = new swing.ActiveStatus();

		setBackground(new java.awt.Color(242, 242, 242));

		imageAvatar1.setBorderSize(0);
		imageAvatar1.setImage(new javax.swing.ImageIcon(getClass().getResource("../icon/user.png"))); // NOI18N

		lb.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
		lb.setText("Name");

		lbStatus.setFont(new java.awt.Font("sansserif", 2, 12)); // NOI18N
		lbStatus.setForeground(new java.awt.Color(117, 117, 117));
		lbStatus.setText("Name");

		activeStatus.setActive(true);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(lb, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
						.addGroup(layout.createSequentialGroup().addComponent(lbStatus).addGap(3, 3, 3)
								.addComponent(activeStatus, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE)))
				.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGap(3, 3, 3)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addComponent(lb).addGap(6, 6, 6)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(activeStatus, javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lbStatus, javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
								.addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(3, 3, 3)));
	}
}