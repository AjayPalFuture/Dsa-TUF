import java.util.Scanner;

public class pattern{
    
    // PTTERN FIRST
    public static void patternFirst(){
        int i,j;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=input.nextInt();
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        patternFirst();
    }
}