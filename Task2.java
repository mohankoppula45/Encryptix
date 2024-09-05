import java.util.Scanner;

class StuGradCal{
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        
        int totalmarks=0; //Initializing totalmarks variable
        System.out.println("Enter no.of subjects:");
        int n=sc.nextInt();// Prompt user for the number of subjects5
        int marks[]=new int[n];
        for(int i=0;i<n;i++){

            System.out.println("Enter the marks of the each subject"+(i+1)+":");
            marks[i]=sc.nextInt();
            totalmarks+=marks[i];
        }
        double Avgpercentage=(double)totalmarks/n; //Avg Calculation
        char grade;
                            //Grade Calc
        if(Avgpercentage>=90){
            grade ='A';
        }else if(Avgpercentage>=80){
            grade='B';
        }
        else if(Avgpercentage>=70){
            grade='C';
        }else if(Avgpercentage>=60){
            grade='D';
        }else if(Avgpercentage>=50){
            grade='E';
        }else{
            grade='F';
        }

        System.out.println("Toatal marks: "+totalmarks);
        System.out.println("Average Percentage: "+ Avgpercentage);
        System.out.println("Grade: "+grade);


    }
}
