import java.util.Scanner;
  public class Simple_ATM {
      public static void main(String[]args){
          Scanner enter = new Scanner (System.in);

           System.out.println("===welcome to ATM===");
System.out.println("");
        System.out.println("enter 4 digit  pin");
        int pin = enter.nextInt();
      
          if (pin==1234){
          int balance = 4000;
          int choice,amount;

          int checkcount=0;
          int totaldeposit=0;
          int totalwithdraws=0;
          int failedattempts=0;

          while (true){
            System.out.println("");
          System.out.println("Enter the number to choose the operation");
          System.out.println("1) check balance");
          System.out.println("2) deposit amount ");
          System.out.println("3) withdraw");
          System.out.println("4) exit");
          
          
          choice =enter.nextInt();
          if (choice==1){
          System.out.print("your balance = "+ balance);
          System.out.println("");
          checkcount++;

    }
          else if (choice==2){
          System.out.print("enter the amount to deposit");
          System.out.println("");
          int newamount = enter.nextInt();
          int depositamount = newamount+ balance;
          balance = depositamount;
          totaldeposit   +=newamount;
          System.out.println("your new balance =" + depositamount);
          System.out.println("");
  }
    else if ( choice==3 ) {
          System.out.println("enter the amount to withdraw");
          System.out.println("");
          int withdraw = enter.nextInt();
          if (withdraw<=balance){
              balance = balance-withdraw;
              System.out.println("your new balance is = "+ balance);
              System.out.println("");
              totalwithdraws +=withdraw;
          }
          else{
      System.out.println("not enough balance");
      System.out.println("");
      failedattempts++;
    } 
  }
    else if (choice==4){
      System.out.println("-------");
      System.out.println("thank you");
      System.out.println("--------");
      break;
    }
    else 
    {
      System.out.println("invalid choice "); 
    }
  }
  System.out.println("===RECIEPT==="); 
  System.out.println("");
  System.out.println("Balance check counts = " + checkcount );
  System.out.println("Deposited Amount = "+ totaldeposit);
  System.out.println("Amount Withdrawn = "+ totalwithdraws);
  System.out.println("Attempts="+ failedattempts);
  System.out.println("New Balance = "+balance);
}
else 
{
  System.out.println("invalid pin");
}
      enter.close();
}
      }
