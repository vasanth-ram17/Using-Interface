/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet;
import java.util.Scanner;
/**
 *
 * @author Vasanth
 */
public class CarDetails {
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    PrivateVehicles A = new PrivateVehicles("","","","","");
    TransportVehicles B = new TransportVehicles("","","","","","");
    System.out.println("For private vehicles press number 1");
    System.out.println("For transport vehicles press  number 2");
    System.out.print("Enter the number[1 or 2] : ");
    int a = input.nextInt();
    if(a==1){
        System.out.println("OWNER NAME : "+ A.OwnerName);
        System.out.println("OWNER ADDRESS : "+ A.OwnerAddress);
        System.out.println("REGISTER NUMBER : "+ A.RegNo);
        System.out.println("MODEL NAME : "+ A.ModelName);
        System.out.println("REGISTERED DATE : "+ A.RegDate);}
        
    else if(a==2){    
         System.out.println("VALIDITY NUMBER : " + B.ValidityNo);
          System.out.println("STARTING DATE : " + B.StartDate);
          System.out.println("PERIOD OF TIME : " + B.Period);
          System.out.println("REGISTER NUMBER : "+ B.RegNo);
          System.out.println("MODEL NAME : "+ B.ModelName);
          System.out.println("REGISTERED DATE : "+ B.RegDate);}
    else{
      System.out.println("INVALID OPTION");
    }
    
    }
  
    
   
} 
 

abstract class Car{
    String RegNo = "19CSE128";
    String ModelName = "Hyundai Elantra" ;
    String RegDate = "17/11/2019";
    
    
    }


class PrivateVehicles extends Car {

  String OwnerName,OwnerAddress;
  public PrivateVehicles(String OwnerName,String OwnerAddress, String RegNo,String ModelName,String RegDate){
 
  
  OwnerName = "VasanthRam";
  OwnerAddress = "221B Baker's Street";
  this.OwnerName = OwnerName;
  this.OwnerAddress = OwnerAddress;
  
  
  }

   
}
class TransportVehicles extends Car{
    String ValidityNo;  String StartDate ;String Period;
     public TransportVehicles(String ValidityNo,  String StartDate ,String Period, String RegNo,String ModelName,String RegDate){
     ValidityNo = "AVBS45134";
     StartDate  = "18/11/2019";
     Period = "7 days";
     this.ValidityNo = ValidityNo;
     this.StartDate = StartDate;
     this.Period = Period;
    
    
     
     }
     
      
}
