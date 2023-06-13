/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 450143
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JFrame;


public class LibraryMenu extends javax.swing.JFrame {

   

    /**
     * Creates new form SampleJFrame
     */
    public LibraryMenu() {
        initComponents();
        
    }
    
    public ArrayList<Members>  membersList(){
        ArrayList<Members> membersList = new ArrayList<>();
           try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String url = "jdbc:ucanaccess://D:/LibraryForKidsWhoCantReadGood/src/librarydb.accdb;sysSchema=true";
            Connection con =  (Connection) DriverManager.getConnection(url);
            String membersQuery="SELECT * FROM members";
            Statement stmt = con.createStatement();
            ResultSet memberResults = stmt.executeQuery(membersQuery);
            Members members;
            
            while(memberResults.next()){
                members = new Members(memberResults.getInt("member_id"),memberResults.getString("email"),memberResults.getString("first_name"),memberResults.getString("surname"),memberResults.getString("phone_number"),memberResults.getString("address"));
                membersList.add(members);
            }
            
         }
         
         catch (Exception e){
             System.out.println("Can't connect");
         }
           return membersList;
    }
    public void show_members(){
        ArrayList<Members> list = membersList();
        DefaultTableModel model = (DefaultTableModel)memberTable.getModel();
        Object[] row = new Object[6];
            for(int i =0; i<list.size(); i++)
            {
                row[0] = list.get(i).getMemberID();
                row[1] = list.get(i).getEmail();
                row[2] = list.get(i).getFirstName();
                row[3] = list.get(i).getSurname();
                row[4] = list.get(i).getPhoneNumber();
                row[5] = list.get(i).getAddress();
                
            }
    
    }
    
    
    
      
    public ArrayList<Items>  itemsList(){
        ArrayList<Items> itemsList = new ArrayList<>();
           try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String url = "jdbc:ucanaccess://D:/LibraryForKidsWhoCantReadGood/src/librarydb.accdb;sysSchema=true";
            Connection con =  (Connection) DriverManager.getConnection(url);
            String itemsQuery="SELECT * FROM items";
            Statement stmt = con.createStatement();
            ResultSet itemResults = stmt.executeQuery(itemsQuery);
            Items items;
            
            while(itemResults.next()){
                items = new Items(itemResults.getInt("item_id"),itemResults.getString("title"),itemResults.getString("author"),itemResults.getString("yearPublished"),itemResults.getString("genre"), itemResults.getString("isbn_no"));
                itemsList.add(items);
            }
            
         }
         
         catch (Exception e){
             System.out.println("Can't connect");
         }
           return itemsList;
    }
    
    public void show_items(){
        ArrayList<Items> list = itemsList();
        DefaultTableModel model = (DefaultTableModel)memberTable.getModel();
        Object[] row = new Object[6];
            for(int i =0; i<list.size(); i++)
            {
                row[0] = list.get(i).getItemID();
                row[1] = list.get(i).getTitle();
                row[2] = list.get(i).getGenre();
                row[3] = list.get(i).getSurname();
                row[4] = list.get(i).getPhoneNumber();
                row[5] = list.get(i).getAddress();
                
            }
    
    }
             

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        mainMenu = new javax.swing.JPanel();
        viewButton = new javax.swing.JButton();
        manageButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jFrame2 = new javax.swing.JFrame();
        members = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        memberTable = new javax.swing.JTable();
        viewMenu = new javax.swing.JPanel();
        viewMembers = new javax.swing.JButton();
        viewBooks = new javax.swing.JButton();
        viewItemsOnLoan = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        viewButton.setText("View");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        manageButton.setText("Manage");
        manageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageButtonActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Welcome to South Dublin Library");

        javax.swing.GroupLayout mainMenuLayout = new javax.swing.GroupLayout(mainMenu);
        mainMenu.setLayout(mainMenuLayout);
        mainMenuLayout.setHorizontalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(viewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addComponent(manageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(232, 232, 232))
        );
        mainMenuLayout.setVerticalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(manageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(177, 177, 177))
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 888, Short.MAX_VALUE)
            .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jFrame1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
            .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jFrame1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        memberTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Member ID", "Email", "First Name", "Surname", "Phone Number", "Address"
            }
        ));
        jScrollPane1.setViewportView(memberTable);

        javax.swing.GroupLayout membersLayout = new javax.swing.GroupLayout(members);
        members.setLayout(membersLayout);
        membersLayout.setHorizontalGroup(
            membersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(membersLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
        membersLayout.setVerticalGroup(
            membersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, membersLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(members, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(members, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        viewMembers.setText("View Members");
        viewMembers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMembersActionPerformed(evt);
            }
        });

        viewBooks.setText("View Books");
        viewBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBooksActionPerformed(evt);
            }
        });

        viewItemsOnLoan.setText("View Items On Loan");
        viewItemsOnLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewItemsOnLoanActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("View Menu");

        javax.swing.GroupLayout viewMenuLayout = new javax.swing.GroupLayout(viewMenu);
        viewMenu.setLayout(viewMenuLayout);
        viewMenuLayout.setHorizontalGroup(
            viewMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewMenuLayout.createSequentialGroup()
                .addGap(378, 378, 378)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewMenuLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(viewMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(viewBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(338, 338, 338))
            .addGroup(viewMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewMenuLayout.createSequentialGroup()
                    .addContainerGap(643, Short.MAX_VALUE)
                    .addComponent(viewItemsOnLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(39, 39, 39)))
        );
        viewMenuLayout.setVerticalGroup(
            viewMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewMenuLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addGroup(viewMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(viewMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewMenuLayout.createSequentialGroup()
                    .addContainerGap(241, Short.MAX_VALUE)
                    .addComponent(viewItemsOnLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(113, 113, 113)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 894, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(viewMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(viewMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
       
        

    }//GEN-LAST:event_viewButtonActionPerformed

    private void manageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manageButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addButtonActionPerformed

    private void viewMembersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMembersActionPerformed
        // TODO add your handling code here:
         JFrame jFrame2 = new JFrame();
        jFrame2.setContentPane(members);
      
    }//GEN-LAST:event_viewMembersActionPerformed

    private void viewBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBooksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewBooksActionPerformed

    private void viewItemsOnLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewItemsOnLoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewItemsOnLoanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibraryMenu().setVisible(true);
             //  new login().setVisible(true);
            }
        });
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JButton manageButton;
    private javax.swing.JTable memberTable;
    private javax.swing.JPanel members;
    private javax.swing.JButton viewBooks;
    private javax.swing.JButton viewButton;
    private javax.swing.JButton viewItemsOnLoan;
    private javax.swing.JButton viewMembers;
    private javax.swing.JPanel viewMenu;
    // End of variables declaration//GEN-END:variables


}
