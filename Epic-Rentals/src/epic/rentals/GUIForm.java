package epic.rentals;

public class GUIForm extends javax.swing.JFrame {

    public GUIForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        loginEmailField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        loginPasswordField = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        registerPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        registerFirstNameField = new javax.swing.JTextField();
        registerLastNameField = new javax.swing.JTextField();
        registerEmailField = new javax.swing.JTextField();
        registerPhoneField = new javax.swing.JTextField();
        registerPasswordVerifyField = new javax.swing.JPasswordField();
        registerPasswordField = new javax.swing.JPasswordField();
        registerAddressField = new javax.swing.JTextField();
        registerConfirmButton = new javax.swing.JButton();
        userViewPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EpicRentals");
        setAlwaysOnTop(true);
        setResizable(false);
        setSize(new java.awt.Dimension(750, 500));

        jPanel1.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setText("Epic - Rentals");

        loginEmailField.setText("Email");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/key.png"))); // NOI18N

        loginPasswordField.setText("Password");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/envelopes.png"))); // NOI18N

        loginButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        registerButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        registerButton.setText("Register");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(registerButton))
                    .addComponent(loginPasswordField)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginEmailField, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(217, Short.MAX_VALUE))
        );

        loginPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {loginButton, registerButton});

        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(83, 83, 83)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(loginEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(loginPasswordField)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(registerButton))
                .addContainerGap(168, Short.MAX_VALUE))
        );

        jPanel1.add(loginPanel, "card2");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel4.setText("Register");

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

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(jLabel4))
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
                .addContainerGap(125, Short.MAX_VALUE))
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(48, 48, 48)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerFirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerLastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
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
                .addGap(56, 56, 56))
        );

        jPanel1.add(registerPanel, "card3");

        javax.swing.GroupLayout userViewPanelLayout = new javax.swing.GroupLayout(userViewPanel);
        userViewPanel.setLayout(userViewPanelLayout);
        userViewPanelLayout.setHorizontalGroup(
            userViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        userViewPanelLayout.setVerticalGroup(
            userViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 517, Short.MAX_VALUE)
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
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButtonActionPerformed

    private void registerConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerConfirmButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerConfirmButtonActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField loginEmailField;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPasswordField loginPasswordField;
    private javax.swing.JTextField registerAddressField;
    private javax.swing.JButton registerButton;
    private javax.swing.JButton registerConfirmButton;
    private javax.swing.JTextField registerEmailField;
    private javax.swing.JTextField registerFirstNameField;
    private javax.swing.JTextField registerLastNameField;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JPasswordField registerPasswordField;
    private javax.swing.JPasswordField registerPasswordVerifyField;
    private javax.swing.JTextField registerPhoneField;
    private javax.swing.JPanel userViewPanel;
    // End of variables declaration//GEN-END:variables
}
