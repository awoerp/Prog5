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
      directDeposit.setEnabled(true);
      specialSavingsAccount.setEnabled(false);
      checking.setSelected(true);
      
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
      statisticsArea = new javax.swing.JTextArea();
      showAccounts = new javax.swing.JButton();
      runMonthlyInterestAndFees = new javax.swing.JButton();
      savings = new javax.swing.JRadioButton();
      specialSavingsAccount = new javax.swing.JCheckBox();
      directDeposit = new javax.swing.JCheckBox();
      jPanel3 = new javax.swing.JPanel();
      jLabel4 = new javax.swing.JLabel();
      accountNumberField = new javax.swing.JTextField();
      jLabel5 = new javax.swing.JLabel();
      dateOpenedField = new javax.swing.JTextField();
      jLabel6 = new javax.swing.JLabel();
      balanceField = new javax.swing.JTextField();
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

      statisticsArea.setColumns(20);
      statisticsArea.setRows(5);
      jScrollPane1.setViewportView(statisticsArea);

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
      savings.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            savingsActionPerformed(evt);
         }
      });

      specialSavingsAccount.setText("Special Savings Account");

      directDeposit.setText("Direct Deposit");

      jLabel4.setText("Account Number");

      accountNumberField.setEditable(false);
      accountNumberField.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            accountNumberFieldActionPerformed(evt);
         }
      });

      jLabel5.setText("Date Opened");

      dateOpenedField.setEditable(false);
      dateOpenedField.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            dateOpenedFieldActionPerformed(evt);
         }
      });

      jLabel6.setText("Balance");

      balanceField.setEditable(false);

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
                     .addComponent(accountNumberField)
                     .addComponent(dateOpenedField, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)))
               .addGroup(jPanel3Layout.createSequentialGroup()
                  .addComponent(jLabel6)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(balanceField)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      jPanel3Layout.setVerticalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel4)
               .addComponent(accountNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel5)
               .addComponent(dateOpenedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel6)
               .addComponent(balanceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      jLabel7.setText("Withdrawals");

      jTextField5.setEditable(false);

      accountTypeGroup.add(checking);
      checking.setText("Checking");
      checking.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            checkingActionPerformed(evt);
         }
      });

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

      String nameFieldText = nameField.getText();
      String phoneNumberFieldText = phoneNumberField.getText();
      boolean added = false;

      statisticsArea.setText(null);
      if(isValid(nameFieldText,phoneNumberFieldText,true))
      {
         if(checking.isSelected())
         {
            if(directDeposit.isSelected())
               added = data.add(new Checking(nameFieldText,phoneNumberFieldText, true));
            else
               added = data.add(new Checking(nameFieldText,phoneNumberFieldText, false));
         }
         else if(savings.isSelected())
         {
            if(specialSavingsAccount.isSelected())
               added = data.add(new Savings(nameFieldText,phoneNumberFieldText, true));
            else
               added = data.add(new Savings(nameFieldText,phoneNumberFieldText, false));
         }
         else if(moneyMarket.isSelected())
            added = data.add(new MoneyMarket(nameFieldText,phoneNumberFieldText));
         if(added)
         {
            printAddedSuccessfully(data.peek());
            dateOpenedField.setText(data.printDateMostRecent());
            accountNumberField.setText(Integer.toString(data.recentAccNum()));
         }
      }
   }//GEN-LAST:event_openAccountActionPerformed

   private void closeAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeAccountActionPerformed
      String nameFieldText = nameField.getText();
      String phoneNumberFieldText = phoneNumberField.getText();
      boolean removed = false;
      dateOpenedField.setText(null);
      accountNumberField.setText(null);
      Object temp = data.find(nameFieldText, phoneNumberFieldText);
      if(isValid(nameFieldText,phoneNumberFieldText,false))
      {
         if(checking.isSelected())
         { 
            if(temp instanceof Checking)
            {
               removed = data.remove((Checking) temp);
            }
         }
         else if(savings.isSelected())
         {
            if(temp instanceof Savings)
            {
               removed = data.remove((Savings) temp);
            }
         }
         else if(moneyMarket.isSelected())
         {
            if(temp instanceof MoneyMarket)
            {
               removed = data.remove((MoneyMarket) temp);
            }
         }

         if(removed)
         {
            printRemovedSuccessfully((Account) temp);
         }
         else
         {
            JOptionPane.showMessageDialog(new JFrame(),
                                       "Account Not Found",
                                       "Dialog",
                                       JOptionPane.ERROR_MESSAGE);    
         }
         

      }
   }//GEN-LAST:event_closeAccountActionPerformed

   
   private void printRemovedSuccessfully(Account temp)
   {
      statisticsArea.append("Account: " + temp.getAccountNum() + " Has been closed.\n");
   }
   
   private void printAddedSuccessfully(Account temp)
   {
      statisticsArea.append("Account: " + temp.getAccountNum() + " Has been opened.\n");
   }
   
   private boolean isValid(String n, String p, boolean add)
   {
      if(nameIsValid(n))
      {
         if(phoneIsValid(p))
         {
            if(add)
            {
               if(!data.contains(data.find(n, p)))
               {
                  return true;
               }
               else if(accountTypeCheck(n,p))
               {
                  return true;
               }
               else
               {
                  JOptionPane.showMessageDialog(new JFrame(),
                                            "Account Already Exists",
                                            "Dialog",
                                            JOptionPane.ERROR_MESSAGE);  
               }
            }
            else
               return true;
         }
         else
         {
            JOptionPane.showMessageDialog(new JFrame(),
                                          "Invalid Phone Number Entered",
                                          "Dialog",
                                          JOptionPane.ERROR_MESSAGE);    
         }
      }
      else
      {
        JOptionPane.showMessageDialog(new JFrame(),
                                       "Invalid Name Entered",
                                       "Dialog",
                                       JOptionPane.ERROR_MESSAGE); 
      }
      return false;
   }
   
   
   private boolean accountTypeCheck(String n, String p)
   {
      if(data.find(n,p) instanceof Checking && checking.isSelected())
         return false;
      if(data.find(n,p) instanceof Savings && savings.isSelected())
         return false;
      if(data.find(n,p) instanceof MoneyMarket && moneyMarket.isSelected())
         return false;
      return true;
   }
   private void showAccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAccountsActionPerformed

      accountNumberField.setText(null);
      statisticsArea.setText(null);
      dateOpenedField.setText(null);
      statisticsArea.append(data.toString());
      
      
   }//GEN-LAST:event_showAccountsActionPerformed

   private void checkingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkingActionPerformed
      directDeposit.setEnabled(true);
      specialSavingsAccount.setEnabled(false);
      specialSavingsAccount.setSelected(false);
      
   }//GEN-LAST:event_checkingActionPerformed

   private void savingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savingsActionPerformed
      specialSavingsAccount.setEnabled(true);
      directDeposit.setEnabled(false);
      directDeposit.setSelected(false);
   }//GEN-LAST:event_savingsActionPerformed

   private void accountNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountNumberFieldActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_accountNumberFieldActionPerformed

   private void dateOpenedFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateOpenedFieldActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_dateOpenedFieldActionPerformed

   public void main()
   {
      accountTypeGroup.add(checking);
      accountTypeGroup.add(savings);
      accountTypeGroup.add(moneyMarket);
      checking.setSelected(true);
      directDeposit.setSelected(false);
      directDeposit.setEnabled(false);
      specialSavingsAccount.setSelected(false);
      specialSavingsAccount.setEnabled(false);
      
   }
   
   private boolean nameIsValid(String name)
   {
      boolean result = name.matches("[a-zA-z]+ [a-zA-Z]+");
      return result;
   }
   
   private boolean phoneIsValid(String phone)
   {
      // Regular expression that matches if phone is
      // 10 characters long and contains only numbers
      return phone.matches("[0-9]{10}");
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
   private javax.swing.JTextField accountNumberField;
   private javax.swing.ButtonGroup accountTypeGroup;
   private javax.swing.JTextField balanceField;
   private javax.swing.JRadioButton checking;
   private javax.swing.JButton closeAccount;
   private javax.swing.JTextField dateOpenedField;
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
   private javax.swing.JTextField jTextField1;
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
   private javax.swing.JTextArea statisticsArea;
   // End of variables declaration//GEN-END:variables
}
