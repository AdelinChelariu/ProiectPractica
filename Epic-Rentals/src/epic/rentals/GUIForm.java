package epic.rentals;

import java.awt.CardLayout;

public class GUIForm extends javax.swing.JFrame {

    public GUIForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        loginEmailField = new javax.swing.JTextField();
        passwordIconLabel = new javax.swing.JLabel();
        loginPasswordField = new javax.swing.JPasswordField();
        emailIconLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        registerPanel = new javax.swing.JPanel();
        registerLabel = new javax.swing.JLabel();
        registerFirstNameField = new javax.swing.JTextField();
        registerLastNameField = new javax.swing.JTextField();
        registerEmailField = new javax.swing.JTextField();
        registerPhoneField = new javax.swing.JTextField();
        registerPasswordVerifyField = new javax.swing.JPasswordField();
        registerPasswordField = new javax.swing.JPasswordField();
        registerAddressField = new javax.swing.JTextField();
        registerConfirmButton = new javax.swing.JButton();
        registerBackButton = new javax.swing.JButton();
        userViewPanel = new javax.swing.JPanel();
        userViewSearchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        userViewUsernameLabel = new javax.swing.JLabel();
        yourRentalsLabel = new javax.swing.JLabel();
        rentalsPanel = new javax.swing.JPanel();
        rent1 = new javax.swing.JLabel();
        rent2 = new javax.swing.JLabel();
        rent3 = new javax.swing.JLabel();
        rent4 = new javax.swing.JLabel();
        rent5 = new javax.swing.JLabel();
        rent6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EpicRentals");
        setAlwaysOnTop(true);
        setResizable(false);
        setSize(new java.awt.Dimension(750, 500));

        jPanel1.setLayout(new java.awt.CardLayout());

        titleLabel.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        titleLabel.setText("Epic - Rentals");

        loginEmailField.setText("Email");

        passwordIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/key.png"))); // NOI18N

        loginPasswordField.setText("Password");

        emailIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/envelopes.png"))); // NOI18N

        loginButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        registerButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(registerButton))
                    .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(emailIconLabel)
                            .addComponent(passwordIconLabel))
                        .addGap(18, 18, 18)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(loginPasswordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                            .addComponent(loginEmailField, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(217, Short.MAX_VALUE))
        );

        loginPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {loginButton, registerButton});

        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(83, 83, 83)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailIconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(loginEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(loginPasswordField)
                    .addComponent(passwordIconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(registerButton))
                .addContainerGap(159, Short.MAX_VALUE))
        );

        jPanel1.add(loginPanel, "card2");

        registerLabel.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        registerLabel.setText("Register");

        registerFirstNameField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        registerFirstNameField.setText("First Name");

        registerLastNameField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        registerLastNameField.setText("Last Name");

        registerEmailField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        registerEmailField.setText("Email");

        registerPhoneField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        registerPhoneField.setText("Phone");

        registerPasswordVerifyField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        registerPasswordVerifyField.setText("Password");

        registerPasswordField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        registerPasswordField.setText("Password");

        registerAddressField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        registerAddressField.setText("Address");

        registerConfirmButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        registerConfirmButton.setText("Confirm");
        registerConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerConfirmButtonActionPerformed(evt);
            }
        });

        registerBackButton.setText("Go Back");
        registerBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(registerPanelLayout.createSequentialGroup()
                                .addGap(279, 279, 279)
                                .addComponent(registerLabel))
                            .addGroup(registerPanelLayout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(registerPanelLayout.createSequentialGroup()
                                        .addComponent(registerPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(registerEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(registerPanelLayout.createSequentialGroup()
                                        .addComponent(registerFirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(100, 100, 100)
                                        .addComponent(registerLastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                                        .addComponent(registerPasswordField)
                                        .addGap(100, 100, 100)
                                        .addComponent(registerPasswordVerifyField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(registerAddressField)))
                            .addGroup(registerPanelLayout.createSequentialGroup()
                                .addGap(314, 314, 314)
                                .addComponent(registerConfirmButton)))
                        .addGap(0, 119, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(registerBackButton)))
                .addContainerGap())
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registerLabel)
                .addGap(48, 48, 48)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerFirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerLastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerPasswordVerifyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(registerAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(registerConfirmButton)
                .addGap(27, 27, 27)
                .addComponent(registerBackButton)
                .addContainerGap())
        );

        jPanel1.add(registerPanel, "card3");

        userViewSearchField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        userViewSearchField.setText("Search...");
        userViewSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userViewSearchFieldActionPerformed(evt);
            }
        });

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/loupe.png"))); // NOI18N

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        yourRentalsLabel.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        yourRentalsLabel.setText("Your Rentals");

        rentalsPanel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        rent1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        rent2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        rent3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        rent4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        rent5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        rent6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        javax.swing.GroupLayout rentalsPanelLayout = new javax.swing.GroupLayout(rentalsPanel);
        rentalsPanel.setLayout(rentalsPanelLayout);
        rentalsPanelLayout.setHorizontalGroup(
            rentalsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rentalsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rentalsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rent1)
                    .addComponent(rent2)
                    .addComponent(rent3)
                    .addComponent(rent4)
                    .addComponent(rent5)
                    .addComponent(rent6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rentalsPanelLayout.setVerticalGroup(
            rentalsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rentalsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rent1)
                .addGap(18, 18, 18)
                .addComponent(rent2)
                .addGap(18, 18, 18)
                .addComponent(rent3)
                .addGap(18, 18, 18)
                .addComponent(rent4)
                .addGap(18, 18, 18)
                .addComponent(rent5)
                .addGap(18, 18, 18)
                .addComponent(rent6)
                .addContainerGap(282, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout userViewPanelLayout = new javax.swing.GroupLayout(userViewPanel);
        userViewPanel.setLayout(userViewPanelLayout);
        userViewPanelLayout.setHorizontalGroup(
            userViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(userViewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rentalsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(userViewPanelLayout.createSequentialGroup()
                        .addComponent(userViewSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 305, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userViewUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(userViewPanelLayout.createSequentialGroup()
                        .addComponent(yourRentalsLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        userViewPanelLayout.setVerticalGroup(
            userViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userViewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(userViewUsernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userViewSearchField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(yourRentalsLabel)
                .addGap(18, 18, 18)
                .addComponent(rentalsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(userViewPanel, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        CardLayout cl = (CardLayout) (jPanel1.getLayout());
        cl.show(jPanel1, "card4");
    }//GEN-LAST:event_loginButtonActionPerformed

    private void registerConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerConfirmButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerConfirmButtonActionPerformed

    private void userViewSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userViewSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userViewSearchFieldActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        CardLayout cl = (CardLayout) (jPanel1.getLayout());
        cl.show(jPanel1, "card3");
    }//GEN-LAST:event_registerButtonActionPerformed

    private void registerBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBackButtonActionPerformed
        CardLayout cl = (CardLayout) (jPanel1.getLayout());
        cl.show(jPanel1, "card2");
    }//GEN-LAST:event_registerBackButtonActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel emailIconLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField loginEmailField;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPasswordField loginPasswordField;
    private javax.swing.JLabel passwordIconLabel;
    private javax.swing.JTextField registerAddressField;
    private javax.swing.JButton registerBackButton;
    private javax.swing.JButton registerButton;
    private javax.swing.JButton registerConfirmButton;
    private javax.swing.JTextField registerEmailField;
    private javax.swing.JTextField registerFirstNameField;
    private javax.swing.JLabel registerLabel;
    private javax.swing.JTextField registerLastNameField;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JPasswordField registerPasswordField;
    private javax.swing.JPasswordField registerPasswordVerifyField;
    private javax.swing.JTextField registerPhoneField;
    private javax.swing.JLabel rent1;
    private javax.swing.JLabel rent2;
    private javax.swing.JLabel rent3;
    private javax.swing.JLabel rent4;
    private javax.swing.JLabel rent5;
    private javax.swing.JLabel rent6;
    private javax.swing.JPanel rentalsPanel;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel userViewPanel;
    private javax.swing.JTextField userViewSearchField;
    private javax.swing.JLabel userViewUsernameLabel;
    private javax.swing.JLabel yourRentalsLabel;
    // End of variables declaration//GEN-END:variables
}
