/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import static Project.Border.changeFunction;
import SQL.DBHelper;
import Table.TableModel.MenuItemTable;
import net.proteanit.sql.DbUtils;
import java.sql.ResultSet;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Nirmith Akash
 */
public class KitchenInterfacePanel extends javax.swing.JPanel {

    /**
     * Creates new form KitchenInterfacePanel
     */
    public KitchenInterfacePanel() {
        initComponents();
        //Filling tables
        fillCustomertable();
        fillOrderTable();
    }
    
    //Filling Tables
    //Creating a Method to fill the Menu item table
    public  void fillCustomertable()
    {
        //Creating a Database Helper object
        DBHelper dbhelper = new DBHelper();
        //Calling method 
        ResultSet rs = dbhelper.SelectCustomerDetails();
        //set the table view
        UserTable.setModel(DbUtils.resultSetToTableModel(rs));
    }
    
    //Creating method and calling to fill the Order table.
    public  void fillOrderTable()
    {
        //Creating a Database Helper object
        DBHelper dbhelper = new DBHelper();
        //Calling method 
        ResultSet rs = dbhelper.SelectOrderDetails();
        //set the table view
        OrderTable.setModel(DbUtils.resultSetToTableModel(rs));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        menu = new javax.swing.JComboBox<>();
        quantity = new javax.swing.JTextField();
        status = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        rid = new javax.swing.JTextField();
        cid = new javax.swing.JTextField();
        AddingOrderDetails = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        UserTable = new javax.swing.JTable();
        UserTableSearch = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        OrderTable = new javax.swing.JTable();
        OrderTableSearch = new javax.swing.JTextField();
        date = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Home = new javax.swing.JButton();
        Home1 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1260, 590));
        setMinimumSize(new java.awt.Dimension(1260, 590));
        setPreferredSize(new java.awt.Dimension(1260, 590));

        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel3.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Enter Order Details ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 198, -1));

        menu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Menu1", "Menu2", "Menu3" }));
        jPanel3.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 82, 250, 34));

        quantity.setText("Quantity");
        jPanel3.add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 122, 250, 32));

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pending" }));
        jPanel3.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 160, 250, 34));

        description.setColumns(20);
        description.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        description.setRows(5);
        description.setText("description");
        jScrollPane1.setViewportView(description);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 200, 250, 58));

        rid.setText("Room_ID");
        jPanel3.add(rid, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 302, 250, 32));

        cid.setText("CID");
        jPanel3.add(cid, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 264, 250, 32));

        AddingOrderDetails.setText("add");
        AddingOrderDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddingOrderDetailsMouseClicked(evt);
            }
        });
        jPanel3.add(AddingOrderDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 374, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Username");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 198, -1));

        UserTable.setModel(new javax.swing.table.DefaultTableModel(
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
        UserTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(UserTable);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 110, 524, 258));

        UserTableSearch.setText("search");
        UserTableSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UserTableSearchKeyReleased(evt);
            }
        });
        jPanel3.add(UserTableSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 70, 229, 30));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 408, 1171, 10));

        OrderTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(OrderTable);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 466, 1046, 110));

        OrderTableSearch.setText("search");
        OrderTableSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderTableSearchActionPerformed(evt);
            }
        });
        OrderTableSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                OrderTableSearchKeyReleased(evt);
            }
        });
        jPanel3.add(OrderTableSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(855, 419, 201, 29));

        date.setDateFormatString("yyyy-MM-dd");
        jPanel3.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 340, 250, 28));

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel1.setText("Kitchen Service Request Panel ");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 550, 50));

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(195, 750));

        Home.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        Home.setText("Kitchen Home ");
        Home.setActionCommand("Kitchen Interface");
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });

        Home1.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        Home1.setText("Home");
        Home1.setActionCommand("Kitchen Interface");
        Home1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home1MouseClicked(evt);
            }
        });
        Home1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Home1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Home1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Home1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(642, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddingOrderDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddingOrderDetailsMouseClicked
        //Adding Order details to the database
        //Getting information
        String Menu = menu.getSelectedItem().toString();
        String Quantity = quantity.getText();
        int quan = Integer.parseInt(Quantity);
        String Status = status.getSelectedItem().toString();
        String Description = description.getText();
        String username = cid.getText();
        String bookingID = rid.getText();
        int booking_id = Integer.parseInt(bookingID);
        java.sql.Date DOB = new java.sql.Date(date.getDate().getTime());
        String Modified_date = DOB.toString();
        //Date datevalue = date.getDate();
        System.out.println(DOB.toString());

        //Formating the date - Quick
        //String string_date = DateFormat.getDateInstance().format(datevalue);
        //System.out.println(string_date);
        //Formatting the date - Hardway
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //String date_modified = sdf.format(date.getSelectedDate().getTime());
        //jLabel1.setText(date);

        //Calling the DB method to insert the values
        DBHelper dbhelper = new DBHelper();
        try {
            boolean status_insert = dbhelper.insertOrder(Menu, quan, Status,Description, Modified_date, booking_id,username);
        } catch (java.lang.NumberFormatException e) {
            //Displaying an Error Dialog box
            JOptionPane.showMessageDialog(this,"Error in inserting Orders!","Error",JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

    }//GEN-LAST:event_AddingOrderDetailsMouseClicked

    private void UserTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserTableMouseClicked
        //Getting values to the textfields when clicking on the table
        //Creating a object from the table
        DefaultTableModel tableModel = (DefaultTableModel) UserTable.getModel();

        //Fetching information from the rows
        String bookingID = tableModel.getValueAt(UserTable.getSelectedRow(),0).toString();
        String name = tableModel.getValueAt(UserTable.getSelectedRow(),2).toString();

        //Set the values to the textFields
        cid.setText(name);
        rid.setText(bookingID); //Storing value is String
    }//GEN-LAST:event_UserTableMouseClicked

    private void UserTableSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserTableSearchKeyReleased
        //User table search functions
        DefaultTableModel table = (DefaultTableModel)UserTable.getModel();
        String search = UserTableSearch.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        UserTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_UserTableSearchKeyReleased

    private void OrderTableSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderTableSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderTableSearchActionPerformed

    private void OrderTableSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_OrderTableSearchKeyReleased
        //Order table searching function
        DefaultTableModel table = (DefaultTableModel)OrderTable.getModel();
        String search = OrderTableSearch.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        OrderTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_OrderTableSearchKeyReleased

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        changeFunction("Kitchen");
    }//GEN-LAST:event_HomeMouseClicked

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeActionPerformed

    private void Home1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home1MouseClicked
        changeFunction("Home");
    }//GEN-LAST:event_Home1MouseClicked

    private void Home1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Home1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Home1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddingOrderDetails;
    private javax.swing.JButton Home;
    private javax.swing.JButton Home1;
    private javax.swing.JTable OrderTable;
    private javax.swing.JTextField OrderTableSearch;
    private javax.swing.JTable UserTable;
    private javax.swing.JTextField UserTableSearch;
    private javax.swing.JTextField cid;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JTextArea description;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> menu;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField rid;
    private javax.swing.JComboBox<String> status;
    // End of variables declaration//GEN-END:variables
}
