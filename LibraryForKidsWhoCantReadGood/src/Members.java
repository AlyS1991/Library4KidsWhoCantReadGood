/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alyso
 */
public class Members {
   final private int member_id;
    final private String email, first_name, surname, phone_number,address;
    
    public Members(int member_id, String email, String first_name, String surname, String phone_number, String address){
        
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
}
