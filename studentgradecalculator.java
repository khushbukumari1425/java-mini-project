import java.util.Scanner;
public class studentgradecalculator{
    public static void main(String[] args){
        System.out.println("-------------------Student grade Calculator------------------");
        System.out.println("Enter the number of subjects out of 100 :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();    // n is the number of subjects
        int totalmarks=0;
        System.out.println("Enter the marks obtained in "+n+" subjects respectively: ");
        for(int i=0;i<n;i++){
            int marks=sc.nextInt();
            totalmarks=totalmarks+marks;
        }
         double AveragePercentage=(double)totalmarks/n;
         String Grade;
         if (AveragePercentage>=90){
           Grade="O"; 
         }
         else if(AveragePercentage>=80){
            Grade="A+";
         }
         else if(AveragePercentage>=70){
            Grade="A";
         }
         else if(AveragePercentage>=60){
            Grade="B";
         }
         else if(AveragePercentage>=50){
            Grade="C";
         }
         else if(AveragePercentage>=40){
            Grade="D";
         }
         else if (AveragePercentage>=30) {
            Grade="E";
         }
         else{
            Grade="Fail(F)";
         }
         System.out.println("Total marks = "+totalmarks);
         System.out.println("Avreage Percentage= "+AveragePercentage+" %");
         System.out.println("Grade is : "+Grade);

    }
}