/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m.pesa.program;

/**
 *
 * @author mulinge
 */
import java.util.Scanner;
public class MPESAPROGRAM {

    /**
     * @param args the command line arguments
     */
    int kimuli;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float amount;
        int choice,number,pin,period;
     String enter,name,kimuli,henry;
        
        System.out.println(" press 1 for MPESA MENU");
        choice=input.nextInt();
        if(choice==1){
        switch(choice)
        {
            case 1:
                 System.out.println("press 1  to send money");
                 System.out.println("press 2 to withdraw cash");
                 System.out.println("press 3 for buy airtime");
                 System.out.println("press 4 for loans and saving");
                 System.out.println("press 5 for lipa na m-pesa services");
                 System.out.println("press 6 for my account");
                choice =input.nextInt();
        }
        switch(choice)
        {
            case 1:
               System.out.println("press 1 to search sim contact,press 2 to enter phone number");
                choice=input.nextInt();
                if(choice==1){
                   System.out.println("enter name");
                       System.out.println("press 1 to choose kimuli,press 2 to choose henry"); 
                       choice=input.nextInt();
                        if(choice==1) {
                             System.out.println("0710986955");
                     System.out.println("press 1 to confirm number");
                     choice=input.nextInt();
                     System.out.println("enter amount");
                      amount=input.nextFloat();
                      System.out.println("enter m-pesa pin");
                      pin=input.nextInt();
                      System.out.println("sent wait for m-pesa to confirm");
                      break;
                        }
                      else if(choice==2){
                     System.out.println("0727667135");
                     System.out.println("press 1 to confirm number");
                     choice=input.nextInt();
                     System.out.println("enter amount");
                      amount=input.nextFloat();
                      System.out.println("enter m-pesa pin");
                      pin=input.nextInt();
                      System.out.println("sent wait for m-pesa to reply");
                  System.out.println("KLJ3GDFY Confirmed.Ksh1000.00 sent to HENRY ONYANGO on 4/4/2017 New M-PESA balance is Ksh2000.00.Transaction cost 0");
                      break;
                      }
                }
                    
                
                     else if(choice==2){
                     System.out.println("enter phone number");
                     number=input.nextInt();
                    System.out.println("enter amount");
                  amount=input.nextFloat();
                            System.out.println("enter pin");     
                            pin=input.nextInt();
                             }
                break;
            case 2:
                 System.out.println("1-->from agent,2-->from atm");
               choice=input.nextInt(); 
        switch (choice){
        case 1:
                if(choice==1){
                     System.out.println("enter agent number");
                     number=input.nextInt();
                      System.out.println("enter amount");
                     amount=input.nextFloat();
                      System.out.println("enter m-pesa pin");
                      pin=input.nextInt(); }
              System.out.println("sent wait for m-pesa to reply");
            break;
        case 2:
        
             System.out.println("enter agent number");
                     number=input.nextInt();
                 System.out.println("enter m-pesa pin");
                pin=input.nextInt();
                 System.out.println("apply voucher from ATM xxx,press 1 to cancel,press 2 for ok");
                choice=input.nextInt();
                if (choice==1){
                 System.out.println("cancelled");
                }
                else if(choice==2){
                 System.out.println("send wait for m-pesa to reply");
                }
                }
        
            break;
            case 3:
                System.out.println("press 1 for my number,press 2 for other number");
                  choice=input.nextInt();
                 switch (choice){
                 case 1:
                        
                     System.out.println("enter amount");
                      amount=input.nextFloat();
                      System.out.println("enter m-pesa pin");
                      pin=input.nextInt();
                      System.out.println("sent wait for m-pesa to confirm");
                             break;
                 case 2:
                     System.out.println("press 1 to search,press 2 to enter number");
                     choice=input.nextInt();
                     if(choice==1){
                         System.out.println("enter name");
                   name=input.next();
                    System.out.println("0797895114");
                     System.out.println("press 1 to confirm");
                     choice=input.nextInt();
                     switch(choice){
                         case 1:
                              
                        
                     System.out.println("enter amount");
                      amount=input.nextFloat();
                      System.out.println("enter m-pesa pin");
                      pin=input.nextInt();
                      System.out.println("sent wait for m-pesa to confirm");
                             break;
                         case 2:
                      System.out.println("please try again"); 
                     }
                     }
                   else if(choice==2){
                     System.out.println("enter phone number");
                     number=input.nextInt();
                    System.out.println("enter amount");
                  amount=input.nextFloat();
                            System.out.println("enter pin");     
                            pin=input.nextInt();
                              System.out.println("sent wait for m-pesa to reply");
                                }  
                     
                 }
                                break;
                 case 4:
            System.out.println("press 1 for M-SHWARI,press 2 for KCB M-PESA");
               choice=input.nextInt();
                     if(choice==1){
                 System.out.println("press 1  to send to M-SHWARI");
                 System.out.println("press 2 to withdraw from M-SHWARI");
                 System.out.println("press 3 for lock savings account");
                 System.out.println("press 4 for loan");
                 System.out.println("press 5 to check balance");
                 System.out.println("press 6 for ministatement");
                choice =input.nextInt();
                switch(choice){
                    case 1:
                         System.out.println("enter amount");
                          amount=input.nextFloat();
                            System.out.println("enter pin");     
                            pin=input.nextInt();
                              System.out.println("sent wait for m-pesa to reply");
                        break;
                    case 2:
                         System.out.println("enter amount");
                           amount=input.nextFloat();
                            System.out.println("enter pin");     
                            pin=input.nextInt();
                              System.out.println("sent wait for m-pesa to reply");
                              break; 
                    case 3:
                  System.out.println("press 1  to open account");
                 System.out.println("press 2 to save");
                 System.out.println("press 3 for withdraw");
                 System.out.println("press 4 to check balance");
                 System.out.println("press 5 for ministatement");
                        choice=input.nextInt();
                        switch (choice){
                            case 1:
                   System.out.println("enter amount");
                  amount=input.nextFloat();
                            System.out.println("enter pin");     
                            pin=input.nextInt();
                              System.out.println("sent wait for m-pesa to reply");
                              break;
                            case 2:
                            System.out.println("enter amount");
                           amount=input.nextFloat();
                            System.out.println("enter pin");
                            
                            pin=input.nextInt();
                              System.out.println("sent wait for m-pesa to reply");
                              break; 
                            case 3:
                   System.out.println("press 1  to open account");
                 System.out.println("press 2 to save");
                 System.out.println("press 3 for withdraw");
                 System.out.println("press 4 to check balance");
                 System.out.println("press 5 for ministatement");
                        choice=input.nextInt();
                     if(choice==1){
                           System.out.println("press 1 to open account from M-PEAS,press 2 to open from M-SHWARI");
                           choice=input.nextInt();
                            switch(choice){
                                case 1:
                           System.out.println("enter target amount");
                           amount=input.nextFloat();
                            System.out.println("period");     
                            period=input.nextInt();
                              System.out.println("enter amount");
                          amount=input.nextFloat();
                            System.out.println("enter pin");     
                            pin=input.nextInt();
                              System.out.println("sent wait for m-pesa to reply");
                            }
                     }
                     else if(choice==2)   
                     {
                             System.out.println("press 1 to open account from M-PEAS,press 2 to open from M-SHWARI");
                           choice=input.nextInt();
                            switch(choice){
                                case 1:
                                     System.out.println("enter amount");
                          amount=input.nextFloat();
                            System.out.println("enter pin");     
                            pin=input.nextInt();
                                    System.out.println("sent wait for m-pesa to reply");
                                    break;
                                case 2:
                            System.out.println("enter amount");
                           amount=input.nextFloat();
                            System.out.println("enter pin");     
                            pin=input.nextInt();
                              System.out.println("sent wait for m-pesa to reply");
                     }
                }
                     else if(choice==3){
                           System.out.println("enter amount");
                           amount=input.nextFloat();
                            System.out.println("enter pin");     
                            pin=input.nextInt();
                              System.out.println("sent wait for m-pesa to reply");
                     }
                     else if(choice==4){
                          System.out.println("enter pin");     
                            pin=input.nextInt();
                              System.out.println("sent wait for m-pesa to reply");
                     }
                      else
                           System.out.println("press 1 for loan,press 2 for deposit account");
                                 choice=input.nextInt();
                            switch(choice){
                                case 1:
                               System.out.println("enter pin");     
                            pin=input.nextInt();     
                           System.out.println("sent wait for m-pesa to reply");
                           break;
                                case 2:
                              System.out.println("enter pin");     
                                   pin=input.nextInt();  
                                  System.out.println("sent wait for m-pesa to reply");
                            }
                                  break;
                                case 4:
                               System.out.println("press 1 to request loan,press 2 to pay loan,prsee 3 to check loan limit");
                                     choice=input.nextInt();
                            
                                if(choice==1){
                     System.out.println("enter agent number");
                     number=input.nextInt();
                      System.out.println("enter amount");
                     amount=input.nextFloat();
                      System.out.println("enter m-pesa pin");
                      pin=input.nextInt(); 
              System.out.println("sent wait for m-pesa to reply");
            break;
                                }
                        else  if(choice==2){
                           System.out.println("press 1  to pay from M-PEAS,press 2 to pay from M-SHWARI");
                           choice=input.nextInt();
                                 if(choice==1){
                      System.out.println("enter amount");
                     amount=input.nextFloat();
                      System.out.println("enter m-pesa pin");
                      pin=input.nextInt(); }
              System.out.println("sent wait for m-pesa to reply");
            break;
             }
                    
                        else if(choice==2){
                                    System.out.println("enter amount");
                     amount=input.nextFloat();
                      System.out.println("enter m-pesa pin");
                      pin=input.nextInt(); 
              System.out.println("sent wait for m-pesa to reply");
            break;
                                }                
                else
                  System.out.println("enter m-pesa pin");
                      pin=input.nextInt(); 
              System.out.println("sent wait for m-pesa to reply");
          break;
           case 5:
                System.out.println("enter m-pesa pin");
                      pin=input.nextInt(); 
              System.out.println("sent wait for m-pesa to reply");
          break;
          case 6:
            System.out.println("press 1 for loan,2 for deposit account");
              choice=input.nextInt();
              if(choice==1){
                    System.out.println("enter m-pesa pin");
                      pin=input.nextInt(); 
              System.out.println("sent wait for m-pesa to reply");
              break;
              }
              else if(choice==2){
                  System.out.println("enter m-pesa pin");
                      pin=input.nextInt(); 
              System.out.println("sent wait for m-pesa to reply");
              break;
              }
                        }
                }
                     }
                else if(choice==2) {
                    System.out.println("press 1  to deposit from M-PESA,press 2 to withdraw to M-PESA,press 3 for loan,press 4 for my account");
                    choice=input.nextInt();
                    switch(choice){
                        case 1:
                              System.out.println("enter amount");
                     amount=input.nextFloat();
                      System.out.println("enter m-pesa pin");
                      pin=input.nextInt(); 
              System.out.println("sent wait for m-pesa to reply");
            break;
                    case 2:
                          System.out.println("enter amount");
                     amount=input.nextFloat();
                      System.out.println("enter m-pesa pin");
                      pin=input.nextInt(); 
              System.out.println("sent wait for m-pesa to reply");
            break;
                    case 3:
                        System.out.println("press 1  to request loan,press 2 to pay loan,press 3 to check loan limit");
                    choice=input.nextInt();
                        switch (choice){
                            case 1:
                   System.out.println("enter amount");
                     amount=input.nextFloat();
                      System.out.println("enter period");
                     period=input.nextInt();
                      System.out.println("enter m-pesa pin");
                      pin=input.nextInt(); 
              System.out.println("sent wait for m-pesa to reply");
                                break;
                            case 2:
                               System.out.println("press 1  to pay from M-PESA,press 2 to pay from KCB-M-PESA");
                    choice=input.nextInt();
                        switch (choice){
                            case 1:  
                   System.out.println("enter amount");
                     amount=input.nextFloat();
                      System.out.println("enter m-pesa pin");
                      pin=input.nextInt(); 
              System.out.println("sent wait for m-pesa to reply");
            break;
                            case 2:
                      System.out.println("enter amount");
                     amount=input.nextFloat();
                      System.out.println("enter m-pesa pin");
                      pin=input.nextInt(); 
              System.out.println("sent wait for m-pesa to reply");
            break;
                            case 3:
                             System.out.println("enter m-pesa pin");
                      pin=input.nextInt(); 
              System.out.println("sent wait for m-pesa to reply");   
                        }
                        }
                    break;
                    case 4:
                           System.out.println("press 1  to pay from M-PESA,press 2 to pay from KCB-M-PESA");
                    choice=input.nextInt();
                        switch (choice){
                            case 1:  
                                   System.out.println("enter m-pesa pin");
                      pin=input.nextInt(); 
              System.out.println("sent wait for m-pesa to reply");   
                                break;
                            case 2:
                                   System.out.println("enter m-pesa pin");
                      pin=input.nextInt(); 
              System.out.println("sent wait for m-pesa to reply");   
                        } 
                    }
                }
                     break;
                 case 5:
                      System.out.println("press 1  to pay from M-PESA,press 2 to pay from KCB-M-PESA");
                    choice=input.nextInt();
                        switch (choice){
                            case 1:  
                                 System.out.println("press 1  to search sim contact,press 2 to enter business number");
                    choice=input.nextInt();
                    if(choice==1)  {
                        System.out.println("enter phone number");
                        number=input.nextInt();
                        break;
                    }  
                    else if(choice==2) {
                          System.out.println("enter business number");
                     number=input.nextInt();
                      System.out.println("enter account number");
                      number=input.nextInt(); 
                        System.out.println("enter amount");
                     amount=input.nextFloat();
                      System.out.println("enter m-pesa pin");
                      pin=input.nextInt(); 
                    }
                            break;
                            case 2:
                     System.out.println("enter till number");
                     number=input.nextInt();
                       System.out.println("enter amount");
                     amount=input.nextFloat();
                      System.out.println("enter m-pesa pin");
                      pin=input.nextInt();
                      System.out.println("sent wait for M-PESA to reply");
                        }
            break;
                 case 6:
                       System.out.println(" press 1  for ministatement  press 2 to check balance, press 3 to change pin n press 4 to change language");
    choice=input.nextInt();
                        switch (choice){
                            case 1:  
                                System.out.println("enter m-pesa pin");
                      pin=input.nextInt();
                      System.out.println("sent wait for M-PESA to reply");
                                break;
                            case 2:
                                System.out.println("enter m-pesa pin");
                      pin=input.nextInt();
                      System.out.println("sent wait for M-PESA to reply");
                                break;
                            case 3:
                                System.out.println("enter old pin");
                      pin=input.nextInt();
                     System.out.println("enter new pin");
                      pin=input.nextInt();
                     System.out.println("confirm pin");
                      pin=input.nextInt();
                      System.out.println("pin changed succssesfuly");
                      break ;
                            case 4:
                                  System.out.println("press 1 for english,press 2 for kishwahili");
                                choice=input.nextInt();
                                if(choice==1){
                                     System.out.println("enter m-pesa pin");
                      pin=input.nextInt();
                       System.out.println("sent wait for M-PESA to reply");
                                break;
                                }
                                else if(choice==2) {
                                     System.out.println("enter m-pesa pin");
                      pin=input.nextInt();
                       System.out.println("sent wait for M-PESA to reply");
                       System.out.println("language changed sucsesfuly");
                                break; 
                                }
                            case 5:
                                  System.out.println("enter m-pesa pin");
                      pin=input.nextInt();
                       System.out.println("language changed sucsesfuly");
                        }
                 default :
                     System.out.println("INVALID CHOICE PLEASE TRTY AGAIN");
                     
        }
    }
        
            
    }     
}

