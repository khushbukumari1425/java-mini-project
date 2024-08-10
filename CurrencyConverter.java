
import java.util.Scanner;

public class CurrencyConverter {
    public double USDtoRupee(double USD)
    {
        return USD*83.47;
    }
    public double RupeetoUSD(double Rupee)
    {
        return Rupee/83.47;
    }
    public double EurotoRupee(double Euro)
    {
        return  Euro*89.10;
    }
    public double RupeetoEuro(double Rupee)
    {
        return Rupee/89.10;
    }
  public static void main(String[] args) {
    
    CurrencyConverter cc=new CurrencyConverter();
    int c=0;
    Scanner sc=new Scanner(System.in);
    do { 
    System.out.println("----------CURRENCY CONVERTER----------");
    System.out.println("1. USD to Rupee");
    System.out.println("2. Rupee to USD ");
    System.out.println("3. Euro to Rupee ");
    System.out.println("4. Rupee to Euro ");
    System.out.println("Enter your choice :");
    int ch=sc.nextInt();
        
   
    if(ch==1){
            System.out.println("Enter the amount in USD : ");
            double USD=sc.nextDouble();
            double Rupee=cc.USDtoRupee(USD);
            System.out.println("Converted amount in Rupee is : "+Rupee);
    }   
    else if (ch==2) {
        
    
            System.out.println("Enter the amount in Rupee :");
            double Rupee=sc.nextDouble();
            double USD=cc.RupeetoUSD(Rupee);
            System.out.println("Converted amount in USD is :"+USD);
    }
    else if(ch==3){
        System.out.println("Enter the amount in Euro :");
        double Euro=sc.nextDouble();
        double Rupee=cc.EurotoRupee(Euro);
        System.out.println("Converted amount in Rupee is : "+Rupee);
        
    }
    else if(ch==4){
        System.out.println("Enter the amount in Rupee :");
        double Rupee=sc.nextDouble();
        double Euro=cc.RupeetoEuro(Rupee);
        System.out.println("Converted amount in Rupee is : "+Rupee);
    }
    
    System.out.println("do you want to continue : (1-->YES/0-->NO) ");
    c=sc.nextInt();

} while(c!=0);
    
    }

    
     

  }

