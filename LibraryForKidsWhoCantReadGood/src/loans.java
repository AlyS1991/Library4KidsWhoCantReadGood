

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alyso
 */
public class loans {
    
     final private int loan_id, member_id;
    final private String loan_date,return_date;
    
    public loans(int loan_id, int member_id, String loan_date,String return_date){
        this.loan_id = loan_id;
        this.member_id = member_id;
        this.loan_date = loan_date;
        this.return_date = return_date;
       
    }
    
    public int getLoanID(){
        return loan_id;
    }
    
    public int getMemberID(){
        return member_id;
    }
    
    public String getLoanDate(){
        return loan_date;
    }
      public String getReturnDate(){
        return return_date;
      }        
    
}
