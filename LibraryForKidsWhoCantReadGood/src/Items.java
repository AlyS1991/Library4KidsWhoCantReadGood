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
}

   
