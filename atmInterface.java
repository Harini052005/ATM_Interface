import java.util.*;
public class atmInterface{
    public static void main(String[] args){
        int pin = 4527;
        int balance = 1000;

        int creditAmount = 0;
        int debitAmount = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Pin Number");
        
       int password = sc.nextInt();

       //for code allign properly use shift+alt+f
       if(password==pin){
           System.out.println("Enter Your Name");
           String name = sc.next();
           System.out.println("Welcome "+ name + "..");
           
           while(true){
               System.out.println("Press 1 to check your BALANCE");
               System.out.println("Press 2 to CREDIT");
               System.out.println("Press 3 to DEBIT");
               System.out.println("Press 4 for TRANSACTION HISTORY");
               System.out.println("Press 5 to EXIT");

               //opt --> option to use by the user to enter any option
               int opt = sc.nextInt();
               switch(opt)
               {
                   case 1:
                        System.out.println("Your current Balance is "+ balance);
                        break;
                   case 2: 
                        System.out.println("Please enter the Amount to be Credit ");
                        creditAmount = sc.nextInt();
                        System.out.println("Your Amount has been Credited on your Account");
                        balance = creditAmount+balance;
                        break;
                  case 3:
                       System.out.println("Please enter the Amount to be Debit ");
                       debitAmount = sc.nextInt();
                       if(debitAmount > balance){
                           System.out.println("Sorry Your Balance is insufficent!");
                       }
                       else{
                           System.out.println("Your Amount has been Debited from your Account");
                           balance = balance - debitAmount;
                       }
                       break;
                 case 4:
                      System.out.println("Your Transaction History");
                      System.out.println("Available Balance: "+ balance);
                      System.out.println("Credited Amount: "+creditAmount);
                      System.out.println("Debited Amount: "+debitAmount);
                      System.out.println("Welcome!");
                      break;
                      default:
                      System.out.println("Thank You!");
                      break;
               }
              if(opt == 5){
                  System.out.println("Press the number below 5");
                  break;
              }

           }
       }
       else{
           System.out.println("Invalid Pin Number! Please enter correct Pin Number");
       }
    }
}