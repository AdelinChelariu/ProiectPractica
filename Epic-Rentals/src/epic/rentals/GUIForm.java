package epic.rentals;

import java.awt.*;
import epic.rentals.JDBC;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.*;

public class GUIForm extends JFrame {

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
        userLogoutButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        userViewUsernameLabel = new javax.swing.JLabel();
        yourRentalsLabel = new javax.swing.JLabel();
        rentalsPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userRentalsTable = new javax.swing.JTable();
        adminViewPanel = new javax.swing.JPanel();
        adminUsersScrollPane = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        adminItemsScrollPane = new javax.swing.JScrollPane();
        itemsTable = new javax.swing.JTable();
        adminUsersLabel = new javax.swing.JLabel();
        adminItemsLabel = new javax.swing.JLabel();
        adminLogoutButton = new javax.swing.JButton();
        adminAddUsersButton = new javax.swing.JButton();
        adminAddItemsButton = new javax.swing.JButton();
        adminDeleteUsersButton = new javax.swing.JButton();
        adminDeleteItemsButton = new javax.swing.JButton();
        userAddPanel = new javax.swing.JPanel();
        addFirstNameField = new javax.swing.JTextField();
        addLastNameField = new javax.swing.JTextField();
        addEmailField = new javax.swing.JTextField();
        addPhoneField = new javax.swing.JTextField();
        addPasswordField = new javax.swing.JPasswordField();
        addAddressField = new javax.swing.JTextField();
        addConfirmButton = new javax.swing.JButton();
        addBackButton = new javax.swing.JButton();
        addRoleField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        itemAddPanel = new javax.swing.JPanel();
        itemAddTitleField = new javax.swing.JTextField();
        itemAddCategoryField = new javax.swing.JTextField();
        itemAddTypeField = new javax.swing.JTextField();
        itemAddYearField = new javax.swing.JTextField();
        itemAddRatingField = new javax.swing.JTextField();
        itemAddTitleLabel = new javax.swing.JLabel();
        itemAddCategoryLabel = new javax.swing.JLabel();
        itemAddTypeLabel = new javax.swing.JLabel();
        itemAddYearLabel = new javax.swing.JLabel();
        itemsAddRatingLabel = new javax.swing.JLabel();
        itemAddConfirmButton = new javax.swing.JButton();
        itemAddBackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EpicRentals");
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
                .addContainerGap(223, Short.MAX_VALUE))
        );

        loginPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {loginButton, registerButton});

        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(83, 83, 83)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailIconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(loginEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(loginPasswordField)
                    .addComponent(passwordIconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(registerButton))
                .addContainerGap(189, Short.MAX_VALUE))
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

        registerBackButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
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
                        .addGap(0, 125, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
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

        userViewPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                userViewPanelComponentShown(evt);
            }
        });

        userLogoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/logout16.png"))); // NOI18N
        userLogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userLogoutButtonActionPerformed(evt);
            }
        });

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/loupe.png"))); // NOI18N
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        yourRentalsLabel.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        yourRentalsLabel.setText("Your Rentals");

        rentalsPanel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        userRentalsTable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        userRentalsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(userRentalsTable);

        javax.swing.GroupLayout rentalsPanelLayout = new javax.swing.GroupLayout(rentalsPanel);
        rentalsPanel.setLayout(rentalsPanelLayout);
        rentalsPanelLayout.setHorizontalGroup(
            rentalsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rentalsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                .addContainerGap())
        );
        rentalsPanelLayout.setVerticalGroup(
            rentalsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rentalsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
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
                        .addComponent(searchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userViewUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userLogoutButton))
                    .addGroup(userViewPanelLayout.createSequentialGroup()
                        .addComponent(yourRentalsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        userViewPanelLayout.setVerticalGroup(
            userViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userViewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(userViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator2)
                        .addComponent(userViewUsernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(userLogoutButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(yourRentalsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rentalsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(userViewPanel, "card4");

        adminViewPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                adminViewPanelComponentShown(evt);
            }
        });

        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        adminUsersScrollPane.setViewportView(usersTable);

        itemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        adminItemsScrollPane.setViewportView(itemsTable);

        adminUsersLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        adminUsersLabel.setText("Users");

        adminItemsLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        adminItemsLabel.setText("Items");

        adminLogoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/logout.png"))); // NOI18N
        adminLogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLogoutButtonActionPerformed(evt);
            }
        });

        adminAddUsersButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/add.png"))); // NOI18N
        adminAddUsersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminAddUsersButtonActionPerformed(evt);
            }
        });

        adminAddItemsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/add.png"))); // NOI18N
        adminAddItemsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminAddItemsButtonActionPerformed(evt);
            }
        });

        adminDeleteUsersButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/minus.png"))); // NOI18N
        adminDeleteUsersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminDeleteUsersButtonActionPerformed(evt);
            }
        });

        adminDeleteItemsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/minus.png"))); // NOI18N
        adminDeleteItemsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminDeleteItemsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminViewPanelLayout = new javax.swing.GroupLayout(adminViewPanel);
        adminViewPanel.setLayout(adminViewPanelLayout);
        adminViewPanelLayout.setHorizontalGroup(
            adminViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminViewPanelLayout.createSequentialGroup()
                .addGroup(adminViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminViewPanelLayout.createSequentialGroup()
                        .addGroup(adminViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(adminViewPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(adminUsersScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(adminViewPanelLayout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(adminUsersLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(adminDeleteUsersButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adminAddUsersButton)))
                        .addGroup(adminViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adminItemsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                            .addGroup(adminViewPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(adminItemsLabel)
                                .addGap(79, 79, 79)
                                .addComponent(adminDeleteItemsButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(adminAddItemsButton))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminViewPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(adminLogoutButton)))
                .addContainerGap())
        );
        adminViewPanelLayout.setVerticalGroup(
            adminViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminViewPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminLogoutButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(adminViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(adminUsersLabel)
                        .addComponent(adminAddUsersButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(adminItemsLabel)
                        .addComponent(adminDeleteUsersButton))
                    .addComponent(adminAddItemsButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adminDeleteItemsButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(4, 4, 4)
                .addGroup(adminViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminItemsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminUsersScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        adminViewPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {adminItemsScrollPane, adminUsersScrollPane});

        jPanel1.add(adminViewPanel, "card5");

        addFirstNameField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        addFirstNameField.setText("First Name");

        addLastNameField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        addLastNameField.setText("Last Name");

        addEmailField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        addEmailField.setText("Email");

        addPhoneField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        addPhoneField.setText("Phone");

        addPasswordField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        addPasswordField.setText("Password");

        addAddressField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        addAddressField.setText("Address");

        addConfirmButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        addConfirmButton.setText("Confirm");
        addConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addConfirmButtonActionPerformed(evt);
            }
        });

        addBackButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        addBackButton.setText("Go Back");
        addBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBackButtonActionPerformed(evt);
            }
        });

        addRoleField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        addRoleField.setText("Role Char");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setText("Add User");

        javax.swing.GroupLayout userAddPanelLayout = new javax.swing.GroupLayout(userAddPanel);
        userAddPanel.setLayout(userAddPanelLayout);
        userAddPanelLayout.setHorizontalGroup(
            userAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userAddPanelLayout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addGroup(userAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userAddPanelLayout.createSequentialGroup()
                        .addGroup(userAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(userAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(userAddPanelLayout.createSequentialGroup()
                                    .addComponent(addFirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(100, 100, 100)
                                    .addComponent(addLastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(addAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userAddPanelLayout.createSequentialGroup()
                                    .addGroup(userAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(userAddPanelLayout.createSequentialGroup()
                                            .addComponent(addPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(userAddPanelLayout.createSequentialGroup()
                                            .addComponent(addPasswordField)
                                            .addGap(100, 100, 100)))
                                    .addGroup(userAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(addEmailField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(addRoleField))))
                            .addGroup(userAddPanelLayout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addComponent(addConfirmButton)))
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userAddPanelLayout.createSequentialGroup()
                        .addComponent(addBackButton)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userAddPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(269, 269, 269))))
        );
        userAddPanelLayout.setVerticalGroup(
            userAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userAddPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(67, 67, 67)
                .addGroup(userAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addFirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addLastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(userAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(userAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addPasswordField)
                    .addComponent(addRoleField))
                .addGap(36, 36, 36)
                .addComponent(addAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(addConfirmButton)
                .addGap(48, 48, 48)
                .addComponent(addBackButton)
                .addContainerGap())
        );

        jPanel1.add(userAddPanel, "card6");

        itemAddTitleField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        itemAddCategoryField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        itemAddTypeField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        itemAddYearField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        itemAddRatingField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        itemAddTitleLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        itemAddTitleLabel.setText("Title");

        itemAddCategoryLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        itemAddCategoryLabel.setText("Category ID");

        itemAddTypeLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        itemAddTypeLabel.setText("Type");

        itemAddYearLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        itemAddYearLabel.setText("Release Year");

        itemsAddRatingLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        itemsAddRatingLabel.setText("Age Rating");

        itemAddConfirmButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        itemAddConfirmButton.setText("Confirm");
        itemAddConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAddConfirmButtonActionPerformed(evt);
            }
        });

        itemAddBackButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        itemAddBackButton.setText("Go Back");
        itemAddBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAddBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout itemAddPanelLayout = new javax.swing.GroupLayout(itemAddPanel);
        itemAddPanel.setLayout(itemAddPanelLayout);
        itemAddPanelLayout.setHorizontalGroup(
            itemAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemAddPanelLayout.createSequentialGroup()
                .addGap(328, 328, 328)
                .addComponent(itemAddConfirmButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemAddPanelLayout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addGroup(itemAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemAddPanelLayout.createSequentialGroup()
                        .addGroup(itemAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemAddTitleLabel)
                            .addComponent(itemAddCategoryLabel)
                            .addComponent(itemAddTypeLabel)
                            .addComponent(itemAddYearLabel)
                            .addComponent(itemsAddRatingLabel))
                        .addGap(105, 105, 105)
                        .addGroup(itemAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemAddRatingField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemAddYearField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemAddTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemAddCategoryField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemAddTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(171, 171, 171))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemAddPanelLayout.createSequentialGroup()
                        .addComponent(itemAddBackButton)
                        .addContainerGap())))
        );
        itemAddPanelLayout.setVerticalGroup(
            itemAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemAddPanelLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(itemAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemAddTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemAddTitleLabel))
                .addGap(18, 18, 18)
                .addGroup(itemAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemAddCategoryLabel)
                    .addComponent(itemAddCategoryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(itemAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemAddTypeLabel)
                    .addComponent(itemAddTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(itemAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemAddYearLabel)
                    .addComponent(itemAddYearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(itemAddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemsAddRatingLabel)
                    .addComponent(itemAddRatingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addComponent(itemAddConfirmButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(itemAddBackButton)
                .addContainerGap())
        );

        jPanel1.add(itemAddPanel, "card7");

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

    private static String userEmail;
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String email = loginEmailField.getText();
        String pass = new String(loginPasswordField.getPassword());
        userEmail=email;
        char logged = JDBC.emailCheck(email, pass);
        
        if(logged == 'u'){
            CardLayout cl = (CardLayout) (jPanel1.getLayout());
            cl.show(jPanel1, "card4");
        }
        else if(logged == 'a'){
            CardLayout cl = (CardLayout) (jPanel1.getLayout());
            cl.show(jPanel1, "card5");
        }
        else{
            JOptionPane.showMessageDialog(this, "Invalid username or password.");
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void registerConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerConfirmButtonActionPerformed
        String firstName = registerFirstNameField.getText();
        String lastName = registerLastNameField.getText();
        String phone = registerPhoneField.getText();
        String email = registerEmailField.getText();
        String password =  new String(registerPasswordField.getPassword());
        String passwordCheck =  new String(registerPasswordVerifyField.getPassword());
        String address =  registerAddressField.getText();
        
        if(password.equals(passwordCheck)){
            JDBC.registerUser(firstName, lastName, email, phone, address, password);
            JOptionPane.showMessageDialog(this, "Registration Successful!");
            CardLayout cl = (CardLayout) (jPanel1.getLayout());
            cl.show(jPanel1, "card2");
        }
        else{
            JOptionPane.showMessageDialog(this, "Passwords don't match.");
        }
    }//GEN-LAST:event_registerConfirmButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        CardLayout cl = (CardLayout) (jPanel1.getLayout());
        cl.show(jPanel1, "card3");
    }//GEN-LAST:event_registerButtonActionPerformed

    private void registerBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBackButtonActionPerformed
        CardLayout cl = (CardLayout) (jPanel1.getLayout());
        cl.show(jPanel1, "card2");
    }//GEN-LAST:event_registerBackButtonActionPerformed

    private void adminLogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLogoutButtonActionPerformed
        CardLayout cl = (CardLayout) (jPanel1.getLayout());
        cl.show(jPanel1, "card2");
    }//GEN-LAST:event_adminLogoutButtonActionPerformed

    private void userLogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userLogoutButtonActionPerformed
        CardLayout cl = (CardLayout) (jPanel1.getLayout());
        cl.show(jPanel1, "card2");
    }//GEN-LAST:event_userLogoutButtonActionPerformed

    private void addBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBackButtonActionPerformed
        CardLayout cl = (CardLayout) (jPanel1.getLayout());
            cl.show(jPanel1, "card5");
    }//GEN-LAST:event_addBackButtonActionPerformed

    private void adminAddUsersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminAddUsersButtonActionPerformed
        CardLayout cl = (CardLayout) (jPanel1.getLayout());
            cl.show(jPanel1, "card6");
    }//GEN-LAST:event_adminAddUsersButtonActionPerformed

    private void addConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addConfirmButtonActionPerformed
        String firstName = addFirstNameField.getText();
        String lastName = addLastNameField.getText();
        String phone = addPhoneField.getText();
        String email = addEmailField.getText();
        String password =  new String(addPasswordField.getPassword());
        String address =  addAddressField.getText();
        String roleStr = addRoleField.getText();
        char role = roleStr.charAt(0);
        
        if(role == 'u' || role == 'a'){
            JDBC.addUser(firstName, lastName, email, phone, address, role, password);
            JOptionPane.showMessageDialog(this, "User Added Successfully!");
            CardLayout cl = (CardLayout) (jPanel1.getLayout());
            cl.show(jPanel1, "card5");
        }
    }//GEN-LAST:event_addConfirmButtonActionPerformed

    private void adminViewPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_adminViewPanelComponentShown
        Connection conn = JDBC.getConnection();
        if (conn != null) {
            PreparedStatement stmt = null;
            ResultSet rs = null;
            try {
                String query = "SELECT FirstName, LastName, Email FROM users";
                stmt = conn.prepareStatement(query);
                rs = stmt.executeQuery();

                // Obține metadatele pentru a obține numele coloanelor
                ResultSetMetaData rsmd = rs.getMetaData();
                int columnCount = rsmd.getColumnCount();
                String[] columnNames = new String[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    columnNames[i - 1] = rsmd.getColumnName(i);
                }

                // Adaugă datele în modelul de tabel
                DefaultTableModel model = new DefaultTableModel(columnNames, 0);
                while (rs.next()) {
                    Object[] row = new Object[columnCount];
                    for (int i = 1; i <= columnCount; i++) {
                        row[i - 1] = rs.getObject(i);
                    }
                    model.addRow(row);
                }

                // Setează modelul în JTable
                usersTable.setModel(model);

            } catch (SQLException e) {
                e.printStackTrace();
            }
            
            rs = null;
            stmt = null;
            try {
                String query = "SELECT Title, CategoryName, Type, ReleaseYear, AgeRating FROM items , categories "
                        + "WHERE items.CategoryID = categories.CategoryID";
                stmt = conn.prepareStatement(query);
                rs = stmt.executeQuery();

                // Obține metadatele pentru a obține numele coloanelor
                ResultSetMetaData rsmd = rs.getMetaData();
                int columnCount = rsmd.getColumnCount();
                String[] columnNames = new String[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    columnNames[i - 1] = rsmd.getColumnName(i);
                }

                // Adaugă datele în modelul de tabel
                DefaultTableModel model = new DefaultTableModel(columnNames, 0);
                while (rs.next()) {
                    Object[] row = new Object[columnCount];
                    for (int i = 1; i <= columnCount; i++) {
                        row[i - 1] = rs.getObject(i);
                    }
                    model.addRow(row);
                }

                // Setează modelul în JTable
                itemsTable.setModel(model);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_adminViewPanelComponentShown

    private void itemAddBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAddBackButtonActionPerformed
        CardLayout cl = (CardLayout) (jPanel1.getLayout());
            cl.show(jPanel1, "card5");
    }//GEN-LAST:event_itemAddBackButtonActionPerformed

    private void itemAddConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAddConfirmButtonActionPerformed
        String title = itemAddTitleField.getText();
        int category = Integer.parseInt(itemAddCategoryField.getText());
        String type = itemAddTypeField.getText();
        int year = Integer.parseInt(itemAddYearField.getText());
        String rating = itemAddRatingField.getText();
        
        JDBC.addItem(title, category, type, year, rating);
        JOptionPane.showMessageDialog(this, "Item Added Successfully!");
        CardLayout cl = (CardLayout) (jPanel1.getLayout());
        cl.show(jPanel1, "card5");
    }//GEN-LAST:event_itemAddConfirmButtonActionPerformed

    private void adminAddItemsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminAddItemsButtonActionPerformed
        CardLayout cl = (CardLayout) (jPanel1.getLayout());
            cl.show(jPanel1, "card7");
    }//GEN-LAST:event_adminAddItemsButtonActionPerformed

    private void userViewPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_userViewPanelComponentShown
        Connection conn = JDBC.getConnection();
        if (conn != null) {
            PreparedStatement stmt = null;
            ResultSet rs = null;
            try {
                String query =  "SELECT Title, RentalDate AS \"Rented on\", ReturnDate AS \"Due on\" FROM Items, Rentals, Users\n" +
                                "WHERE email = '" + userEmail + "' AND users.userid = rentals.userid AND items.itemid = rentals.itemid;";
                stmt = conn.prepareStatement(query);
                rs = stmt.executeQuery();

                // Obține metadatele pentru a obține numele coloanelor
                ResultSetMetaData rsmd = rs.getMetaData();
                int columnCount = rsmd.getColumnCount();
                String[] columnNames = new String[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    columnNames[i-1] = rsmd.getColumnName(i);
                }

                // Adaugă datele în modelul de tabel
                DefaultTableModel model = new DefaultTableModel(columnNames, 0);
                while (rs.next()) {
                    Object[] row = new Object[columnCount];
                    for (int i = 1; i <= columnCount; i++) {
                        row[i-1] = rs.getObject(i);
                    }
                    model.addRow(row);
                }

                // Setează modelul în JTable
                userRentalsTable.setModel(model);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_userViewPanelComponentShown

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        SearchWindow newWindow = new SearchWindow();
        newWindow.setVisible(true);
    }//GEN-LAST:event_searchButtonActionPerformed

    private void adminDeleteUsersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminDeleteUsersButtonActionPerformed
        int selectedRow = usersTable.getSelectedRow();
        if (selectedRow != -1) {
            String email = (String)usersTable.getValueAt(selectedRow, 2);
            if(email.equals(userEmail)){
                JOptionPane.showMessageDialog(this, "You Can't Erase Yourself!");
                return;
            }
            Connection conn = JDBC.getConnection();
            if (conn != null) {
                
                try{
                    String query =  "DELETE FROM Users WHERE Email LIKE '" + email + "';";
                    Statement stmt = conn.createStatement();
                    stmt.executeUpdate(query);
                    JOptionPane.showMessageDialog(this, "User Erased Successfully!");
                }catch(SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_adminDeleteUsersButtonActionPerformed

    private void adminDeleteItemsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminDeleteItemsButtonActionPerformed
        int selectedRow = itemsTable.getSelectedRow();
        if (selectedRow != -1) {
            String title = (String)itemsTable.getValueAt(selectedRow, 0);
            
            Connection conn = JDBC.getConnection();
            if (conn != null) {
                try{
                    String query =  "DELETE FROM Items WHERE Title LIKE '" + title + "';";
                    Statement stmt = conn.createStatement();
                    stmt.executeUpdate(query);
                    JOptionPane.showMessageDialog(this, "Item Erased Successfully!");
                }catch(SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_adminDeleteItemsButtonActionPerformed

    public static void main(String args[]) {
        JDBC.getConnection();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addAddressField;
    private javax.swing.JButton addBackButton;
    private javax.swing.JButton addConfirmButton;
    private javax.swing.JTextField addEmailField;
    private javax.swing.JTextField addFirstNameField;
    private javax.swing.JTextField addLastNameField;
    private javax.swing.JPasswordField addPasswordField;
    private javax.swing.JTextField addPhoneField;
    private javax.swing.JTextField addRoleField;
    private javax.swing.JButton adminAddItemsButton;
    private javax.swing.JButton adminAddUsersButton;
    private javax.swing.JButton adminDeleteItemsButton;
    private javax.swing.JButton adminDeleteUsersButton;
    private javax.swing.JLabel adminItemsLabel;
    private javax.swing.JScrollPane adminItemsScrollPane;
    private javax.swing.JButton adminLogoutButton;
    private javax.swing.JLabel adminUsersLabel;
    private javax.swing.JScrollPane adminUsersScrollPane;
    private javax.swing.JPanel adminViewPanel;
    private javax.swing.JLabel emailIconLabel;
    private javax.swing.JButton itemAddBackButton;
    private javax.swing.JTextField itemAddCategoryField;
    private javax.swing.JLabel itemAddCategoryLabel;
    private javax.swing.JButton itemAddConfirmButton;
    private javax.swing.JPanel itemAddPanel;
    private javax.swing.JTextField itemAddRatingField;
    private javax.swing.JTextField itemAddTitleField;
    private javax.swing.JLabel itemAddTitleLabel;
    private javax.swing.JTextField itemAddTypeField;
    private javax.swing.JLabel itemAddTypeLabel;
    private javax.swing.JTextField itemAddYearField;
    private javax.swing.JLabel itemAddYearLabel;
    private javax.swing.JLabel itemsAddRatingLabel;
    private javax.swing.JTable itemsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JPanel rentalsPanel;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel userAddPanel;
    private javax.swing.JButton userLogoutButton;
    private javax.swing.JTable userRentalsTable;
    private javax.swing.JPanel userViewPanel;
    private javax.swing.JLabel userViewUsernameLabel;
    private javax.swing.JTable usersTable;
    private javax.swing.JLabel yourRentalsLabel;
    // End of variables declaration//GEN-END:variables
}
