import java.util.Scanner;
class Test{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Student Name");
		String name =sc.nextLine();
		
		System.out.println("Enter the Subject 1 marks");
		int Sub1=sc.nextInt();
		
		System.out.println("Enter the subject 2 marks");
		int Sub2= sc.nextInt();
		
		System.out.println("Enter the subject 3 marks");
		int Sub3=sc.nextInt();
		
		double Percentage=(Sub1+Sub2+Sub3)/3.0;
		
		System.out.println("\n-------Result--------");
		System.out.println(" Name : " + name);
		System.out.println(" Percentage : "+ Percentage);
		
		if(Percentage>=90){
			System.out.println("A garde");
		}
		else if(Percentage>=80){
			System.out.println("B garde");
		}
		else if(Percentage>=70){
			System.out.println("C garde");
		}
		else if(Percentage>=50){
			System.out.println("D garde");
		}
		else{
			System.out.println("Fail");
		}
		 sc.close();
		
	}
	
}