
package oop_2.haftaodevi.Account;
import java.util.Date;


public class Account {
    
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;
    
    
    
    public Account(){
        this.id = 0;
        this.balance = 0.0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
        
        
    }
 
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
        
    }
        
        public int getid(){
           return this.id;
        }
        
        public void setid(int yeniid){
            this.id = yeniid;
            
        }
        
        public double getbalance(){
            return this.balance;
        }
        
       public  void setbalance(double yenibalance){
            this.balance = yenibalance;
        }
        
        public double getannualInterestRate(){
            return this.annualInterestRate;
        }
        
       public  void setannualInterestRate(double yenisetannualInterestRate){
            this.annualInterestRate = yenisetannualInterestRate;
        }
        
        public Date dateCreated(){
            return this.dateCreated;
        }
        
        public double getMonthlyInterestRate(){
            return (this.annualInterestRate/100)/12;
        }
        
        public double getMonthlyInterest(){
            return this.getMonthlyInterestRate()* this.balance;
            
        }
            
            public void withdraw(double amount){
                this.balance = this.balance - amount;
            }
            
            public void deposit(double amount){
                this.balance = this.balance + amount;
            }
        
    }


class TestAccount{
    
    public static void main(String[] args) {
     
    Account account1 = new Account(1000,3200);
    
    account1.setannualInterestRate(4.5);
    System.out.println("bakiye:" + account1.getbalance() );
    System.out.println("Aylik faiz tutari :" + account1.getMonthlyInterest());
    System.out.println(" Hesabin oluşturulma tarihi: " + account1.dateCreated());
    
    
    }

}



    
