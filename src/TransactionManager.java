/**
 *
 * @author SteveWoerpel
 */

import javax.swing.*;
public class TransactionManager extends javax.swing.JFrame {

   
   /**
    * Creates new form TransactionManager
    */
   public TransactionManager() {
      initComponents();
   }

   /**
    * This method is called from within the constructor to initialize the
    * form. WARNING: Do NOT modify this code. The content of this method
    * is always regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jRadioButton4 = new javax.swing.JRadioButton();
      jTextField1 = new javax.swing.JTextField();
      accountTypeGroup = new javax.swing.ButtonGroup();
      jPanel1 = new javax.swing.JPanel();
      jLabel2 = new javax.swing.JLabel();
      phoneNumberField = new javax.swing.JTextField();
      nameField = new javax.swing.JTextField();
      jLabel1 = new javax.swing.JLabel();
      jPanel2 = new javax.swing.JPanel();
      openAccount = new javax.swing.JButton();
      closeAccount = new javax.swing.JButton();
      jToggleButton1 = new javax.swing.JToggleButton();
      jButton2 = new javax.swing.JButton();
      jScrollPane1 = new javax.swing.JScrollPane();
      jTextArea1 = new javax.swing.JTextArea();
      showAccounts = new javax.swing.JButton();
      runMonthlyInterestAndFees = new javax.swing.JButton();
      savings = new javax.swing.JRadioButton();
      specialSavingsAccount = new javax.swing.JCheckBox();
      directDeposit = new javax.swing.JCheckBox();
      jPanel3 = new javax.swing.JPanel();
      jLabel4 = new javax.swing.JLabel();
      jTextField2 = new javax.swing.JTextField();
      jLabel5 = new javax.swing.JLabel();
      jTextField3 = new javax.swing.JTextField();
      jLabel6 = new javax.swing.JLabel();
      jTextField4 = new javax.swing.JTextField();
      jLabel7 = new javax.swing.JLabel();
      jTextField5 = new javax.swing.JTextField();
      checking = new javax.swing.JRadioButton();
      moneyMarket = new javax.swing.JRadioButton();

      jRadioButton4.setText("Checking");

      jTextField1.setText("jTextField1");

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      jLabel2.setText("Phone Number");

      phoneNumberField.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            phoneNumberFieldActionPerformed(evt);
         }
      });

      nameField.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            nameFieldActionPerformed(evt);
         }
      });

      jLabel1.setText("Name");

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                  .addComponent(jLabel2)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(jLabel1)
                  .addGap(53, 53, 53)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
               .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
               .addComponent(phoneNumberField))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel1)
               .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel2)
               .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      openAccount.setText("Open New Account");
      openAccount.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            openAccountActionPerformed(evt);
         }
      });

      closeAccount.setText("Close Account");
      closeAccount.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            closeAccountActionPerformed(evt);
         }
      });

      jToggleButton1.setText("Deposit");

      jButton2.setText("Withdraw");

      jTextArea1.setColumns(20);
      jTextArea1.setRows(5);
      jScrollPane1.setViewportView(jTextArea1);

      showAccounts.setText("Show All Accounts");
      showAccounts.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            showAccountsActionPerformed(evt);
         }
      });

      runMonthlyInterestAndFees.setText("Run Monthly Interest and Fees");

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPane1)
               .addGroup(jPanel2Layout.createSequentialGroup()
                  .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(openAccount)
                        .addGap(18, 18, 18)
                        .addComponent(closeAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                     .addComponent(showAccounts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                  .addGap(18, 18, 18)
                  .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addComponent(runMonthlyInterestAndFees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addContainerGap())
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(openAccount)
               .addComponent(closeAccount)
               .addComponent(jToggleButton1)
               .addComponent(jButton2))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(showAccounts)
               .addComponent(runMonthlyInterestAndFees))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
            .addContainerGap())
      );

      accountTypeGroup.add(savings);
      savings.setText("Savings");

      specialSavingsAccount.setText("Special Savings Account");

      directDeposit.setText("Direct Deposit");

      jLabel4.setText("Account Number");

      jTextField2.setEditable(false);

      jLabel5.setText("Date Opened");

      jTextField3.setEditable(false);

      jLabel6.setText("Balance");

      jTextField4.setEditable(false);

      javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
      jPanel3.setLayout(jPanel3Layout);
      jPanel3Layout.setHorizontalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addGroup(jPanel3Layout.createSequentialGroup()
                  .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel4)
                     .addComponent(jLabel5))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addComponent(jTextField2)
                     .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)))
               .addGroup(jPanel3Layout.createSequentialGroup()
                  .addComponent(jLabel6)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(jTextField4)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      jPanel3Layout.setVerticalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel4)
               .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel5)
               .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel6)
               .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      jLabel7.setText("Withdrawals");

      jTextField5.setEditable(false);

      accountTypeGroup.add(checking);
      checking.setText("Checking");

      accountTypeGroup.add(moneyMarket);
      moneyMarket.setText("Money Market");

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(savings)
                           .addComponent(checking)
                           .addComponent(moneyMarket))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(specialSavingsAccount)
                           .addComponent(directDeposit)
                           .addGroup(layout.createSequentialGroup()
                              .addComponent(jLabel7)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                              .addComponent(jTextField5)))))
                  .addGap(8, 8, 8)
                  .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(44, 44, 44)))
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addGroup(layout.createSequentialGroup()
                  .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(directDeposit)
                     .addComponent(checking))
                  .addGap(4, 4, 4)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(savings)
                     .addComponent(specialSavingsAccount))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel7)
                     .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(moneyMarket)))
               .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(65, 65, 65))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   BankDataBase data = new BankDataBase();

   private void phoneNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberFieldActionPerformed
      
   }//GEN-LAST:event_phoneNumberFieldActionPerformed

   private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed

   }//GEN-LAST:event_nameFieldActionPerformed

   private void openAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openAccountActionPerformed

      if(nameField.isValid() && phoneNumberField.isValid())
      {
         if(checking.isSelected())
         {
            if(directDeposit.isSelected())
               data.add(new Checking(nameField.toString(),phoneNumberField.toString(), true));
            else
               data.add(new Checking(nameField.toString(),phoneNumberField.toString(), false));
         }
         else if(savings.isSelected())
         {
            if(specialSavingsAccount.isSelected())
               data.add(new Savings(nameField.toString(),phoneNumberField.toString(), true));
            else
               data.add(new Savings(nameField.toString(),phoneNumberField.toString(), false));
         }
         else if(moneyMarket.isSelected())
            data.add(new MoneyMarket(nameField.toString(),phoneNumberField.toString()));
      }

   }//GEN-LAST:event_openAccountActionPerformed

   private void closeAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeAccountActionPerformed
      if(checking.isSelected())
      {
         Checking temp = new Checking(nameField.toString(),phoneNumberField.toString(),false);
         data.remove(temp);
      }
      else if(savings.isSelected())
      {
         Savings temp = new Savings(nameField.toString(),phoneNumberField.toString(),false);
         data.remove(temp);
      }
      else
      {
         MoneyMarket temp = new MoneyMarket(nameField.toString(),phoneNumberField.toString());
         data.remove(temp);
      }
      
     
   }//GEN-LAST:event_closeAccountActionPerformed

   private void showAccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAccountsActionPerformed

      
   }//GEN-LAST:event_showAccountsActionPerformed

   public void main()
   {
      
      accountTypeGroup.add(checking);
      accountTypeGroup.add(savings);
      accountTypeGroup.add(moneyMarket);
      checking.setSelected(true);
      directDeposit.setSelected(false);
      specialSavingsAccount.setSelected(false);
   }
   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new TransactionManager().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.ButtonGroup accountTypeGroup;
   private javax.swing.JRadioButton checking;
   private javax.swing.JButton closeAccount;
   private javax.swing.JCheckBox directDeposit;
   private javax.swing.JButton jButton2;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JPanel jPanel3;
   private javax.swing.JRadioButton jRadioButton4;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTextArea jTextArea1;
   private javax.swing.JTextField jTextField1;
   private javax.swing.JTextField jTextField2;
   private javax.swing.JTextField jTextField3;
   private javax.swing.JTextField jTextField4;
   private javax.swing.JTextField jTextField5;
   private javax.swing.JToggleButton jToggleButton1;
   private javax.swing.JRadioButton moneyMarket;
   private javax.swing.JTextField nameField;
   private javax.swing.JButton openAccount;
   private javax.swing.JTextField phoneNumberField;
   private javax.swing.JButton runMonthlyInterestAndFees;
   private javax.swing.JRadioButton savings;
   private javax.swing.JButton showAccounts;
   private javax.swing.JCheckBox specialSavingsAccount;
   // End of variables declaration//GEN-END:variables
}
