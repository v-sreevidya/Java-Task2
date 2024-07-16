import java.util.Scanner;
public class gradestask{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean continueMarkEntry = true;
        while(continueMarkEntry){
            System.out.print("Enter the marks obtained (out of 100): ");
            double marks= sc.nextDouble();
            char grade;
            if (marks>=90){
                grade ='A';
            }
            else if (marks >=80){
                grade= 'B';
            }
             else if (marks >=70){
                grade= 'C';
            }
             else if (marks >=60){
                grade= 'D';
            }
            else{
                grade = 'F';
            }
            System.out.println("Grade : "+grade);
            System.out.print("Do you want to enter another set of marks? (YES/NO): ");
            String response=sc.next();
            if(response.equalsIgnoreCase("no")){
                continueMarkEntry=false;
            }
        }
        sc.close();
        
    }
}