
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alyso
 */
public class loans {
    
     final private int loan_id;
    final private String email, first_name, surname, phone_number,address;
    
    public Loans(int loan_id, String email, String first_name, String surname, String phone_number, String address){
        
        this.member_id = member_id;
        this.email = email;
        this.first_name = first_name;
        this.surname = surname;
        this.phone_number = phone_number;
        this.address = address;
    }
    
    public int getMemberID(){
        return member_id;
    }
    
    public String getEmail(){
        return email;
    }
      public String getFirstName(){
        return first_name;
    }
      
        public String getSurname(){
        return surname;
    }
        
        public String getPhoneNumber(){
        return phone_number;
    }
        public String getAddress(){
        return address;
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
                
                
                JTable memberTable 
            }
    
    }
}
    
}
