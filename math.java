import java.util.Scanner;
public class math {

    //Count Digit
    public static void countDigit(int num){
       
        int cont=0;
        while(num>0){
          int  lastDigit=num%10;                                          //  TC=O(log10(n))
          cont++;
          num=num/10;
        }
        System.out.println(cont);                          
    } 




             //REVERSE NUMBER


    public static void reverseNumber(int num){
        int revnum=0;
         while(num>0){
            int lastDigit=num%10;
            num=num/10;
            revnum=lastDigit+(revnum*10);
         }
         System.out.println(revnum);
    }  
    
    



    //Palindrom or not
    public static void palindromOrNot(int num){
        int reversenum=0;
        int dup=num;
        while(num>0){
            int lastDigit=num%10;
            num=num/10;
            reversenum=lastDigit+(reversenum*10);
        }
        if(reversenum==dup){
            System.out.println("The given number is palindrom");
        }
        else{
            System.out.println("Its not a palilndrom");
        }
    }




    //Armstrong Number
    public static void armstrongNumber(int num){
      int  number=num;
      int armNum=0;
      while(num>0){
        int lastDigit=num%10;
        armNum=armNum+(lastDigit*lastDigit*lastDigit);
        num=num/10;
      }
      if(armNum==number){
        System.out.println("its a armstrong number");
      }
      else{
        System.out.println("its not a armstrong number");
      }
    }

    
    
    //print All Division


    // public static void printAllDivision(int num){
    //     for(int i=1;i<=num;i++){
    //         if(num%i==0){
    //             System.out.println(i);                     // TC =O(n)
    //         }
    //     }
    // }




    public static void printAllDivision(int num){
        for(int i=1;i<=Math.sqrt(num);i++){
            if(num%i==0){
                System.out.println(i); 
                if(num/i!=1) 
                System.out.println(num/i);                   // TC =O(n)
            }
        }
    }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=input.nextInt();
       // countDigit(num);
      //  reverseNumber(num);
       // palindromOrNot(num);
        // armstrongNumber(num);
        printAllDivision(num);
    }




 
}
