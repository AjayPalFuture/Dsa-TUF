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




        // PTTERN SECOND
        public static void patternTwo(){
            int i,j;
            Scanner input=new Scanner(System.in);
            System.out.print("Enter the number: ");
            int n=input.nextInt();
            for(i=0;i<n;i++){
                for(j=0;j<i+1;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
    
        }



            // PTTERN THREE
    public static void patternThree(){
        int i,j;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=input.nextInt();
        for(i=1;i<n;i++){
            for(j=1;j<i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }




        // PTTERN FOUR
        public static void patternFour(){
            int i,j;
            Scanner input=new Scanner(System.in);
            System.out.print("Enter the number: ");
            int n=input.nextInt();
            for(i=1;i<n;i++){
                for(j=1;j<i+1;j++){
                    System.out.print(i);
                }
                System.out.println();
            }
    
        }




            // PTTERN FIVE
    public static void patternFive(){
        int i,j;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=input.nextInt();
        for(i=0;i<n;i++){
            for(j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }





        // PTTERN SIX
        public static void patternSix(){
            int i,j;
            Scanner input=new Scanner(System.in);
            System.out.print("Enter the number: ");
            int n=input.nextInt();
            for(i=0;i<=n;i++){
                for(j=1;j<=n-i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
    
        }






            // PTTERN FIRST
    public static void patternSeven(){
        int i,j;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=input.nextInt();
        for(i=0;i<n;i++){
            for(j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(j=0;j<n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }






                // PTTERN FIRST
                public static void patternEight(){
                    int i,j;
                    Scanner input=new Scanner(System.in);
                    System.out.print("Enter the number: ");
                    int n=input.nextInt();
                    for(i=0;i<=n;i++){
                        for(j=0;j<i*1;j++){
                            System.out.print(" ");
                        }
                        for(j=0;j<2*(n-i)+1;j++){
                            System.out.print("*");
                        }
                        for(j=0;j<=i*1;j++){
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
            
                }

    

    
            // PTTERN FIRST
            public static void patternNine(){
                int i,j;
                Scanner input=new Scanner(System.in);
                System.out.print("Enter the number: ");
                int n=input.nextInt();
                for(i=0;i<n;i++){
                    for(j=0;j<n-i;j++){
                        System.out.print(" ");
                    }
                    for(j=0;j<2*i+1;j++){
                        System.out.print("*");
                    }
                    for(j=0;j<n-i;j++){
                        System.out.print(" ");
                    }
                    System.out.println();
                }
                
                for(i=0;i<=n;i++){
                    for(j=0;j<i*1;j++){
                        System.out.print(" ");
                    }
                    for(j=0;j<2*(n-i)+1;j++){
                        System.out.print("*");
                    }
                    for(j=0;j<=i*1;j++){
                        System.out.print(" ");
                    }
                    System.out.println();
                }
        
            }





            // PATTERN  TEN

            public static void patternTen(){
                int i,j;
                Scanner input=new Scanner(System.in);
                System.out.print("Enter the number: ");
                int n=input.nextInt();
                for(i=0;i<n;i++){
                    for(j=0;j<i+1;j++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
        
                    for(i=1;i<n;i++){
                        for(j=0;j<n-i;j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
            
                }
        
            

    


    public static void main(String[] args) {
        // patternFirst();
        // patternTwo();
        // patternThree();
        // patternFour();
        // patternFive();
        // patternSix();
        // patternSeven();
        // patternEight();
        // patternNine();
        patternTen();
    }

}