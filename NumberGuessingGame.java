import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int score=0;
       int ch=0;
       int totalscore=0;
       int round=0;
       System.out.println("----WELCOME TO NUMBER GAME----");
       System.out.println("maximum number of attempts allowed are 10");
       do { 
        int attempts=10;
        Random random=new Random();
        int Secretnumber=random.nextInt(1, 100);
        //System.out.println(Secretnumber);
        System.out.println("guess a number.....");
        int guessbyuser=sc.nextInt();
           while(attempts>0)
           {
    
            if (guessbyuser==Secretnumber) {
                score=attempts;
                System.out.println("you guessed it correct....");
                System.out.println("your score is "+score+" in "+(11-attempts)+" attempts ");
                break;
            }
            else if (guessbyuser<Secretnumber) {
                attempts--;
                System.out.println(" number tooo lowwww.....");
                System.out.println("number of attempts left are "+attempts);
                System.out.println("guess another number.....");
                guessbyuser=sc.nextInt();

                
            }
            else{
                attempts--;
                System.out.println("number tooo high.....");
                System.out.println("number of attempts left are "+attempts);
                System.out.println("guess another number.....");
                guessbyuser=sc.nextInt();

            }
           }
           round=round+1;
           totalscore=totalscore+score;
           System.out.println("THE SECRET NUMBER WAS :  "+ Secretnumber);
           System.out.print("do you want to play the next round---1.YES/0.NO.---  ");
           ch=sc.nextInt();
   
               
        } while( ch!=0);
    if(totalscore==0)
        {
        System.out.println("OH NO!,YOU LOST........");
        
        System.out.println("your total score is  " +totalscore+" in "+round+" round ");
        }
    else{
        System.out.println("Congratulationssss!!!......");
        System.out.println("your total score is  " +totalscore+" in "+round+" round ");
        }
    }
}
