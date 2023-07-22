
import com.sun.jdi.connect.spi.Connection;
import java.util.ArrayList;
import java.sql.DriverManager;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException; 
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JPanel;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alyso
 */
public class Items {
    
    final private int item_id;
    final private String title, author, yearPublished,genre, isbn_no;
    
    public Items(int item_id,String title, String author, String yearPublished, String genre, String isbn_no){
        
        this.item_id = item_id;
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.genre = genre;
        this.isbn_no = isbn_no;
    }
    
    public int getItemID(){
        return item_id;
    }
    
    public String getTitle(){
        return title;
    }
      public String getAuthor(){
        return author;
    }
      
        public String getPublishedYear(){
        return yearPublished;
    }
        
        public String getGenre(){
        return genre;
    }
        public String getISBN(){
        return isbn_no;
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
}



   
