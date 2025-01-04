import java.util.Scanner;
class Banking{
public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
	int deposit,withdraw,loanDetails;
	float checkBalance=14000.0f;
	char exist='y';
	int options;
	while(exist=='y' || exist=='Y'){
	System.out.println("1.deposit");
	System.out.println("2.withdraw");
	System.out.println("3.loanDetails");
	System.out.println("4.exist");
	options=scanner.nextInt();
	switch(options){
		case 1:
			System.out.println("Enter your deposit amount");
			deposit=scanner.nextInt();
			checkBalance+=deposit;
			System.out.println("Your Total balance"+ checkBalance);
			break;
		case 2:
			System.out.println("Enter your withdraw amount");
			withdraw=scanner.nextInt();
			checkBalance-=withdraw;
			System.out.println("You Remaining balance"+ checkBalance);
			break;
		case 3:
			System.out.println("1.Land Loan");
			System.out.println("2.Home Loan");
			System.out.println("3.Gold Loan");
			System.out.println("4.Job Loan");
			loanDetails=scanner.nextInt();
			switch(loanDetails){
				case 1:
					System.out.println("Thank you for choosing Land loan our team will contact you");
					break;
				case 2:
					System.out.println("Thank you for choosing Home loan our team will contact you");
					break;
				case 3:
					System.out.println("Thank you for choosing Gold loan our team will contact you");
					break;
				case 4:
					System.out.println("Thank you for choosing Job loan our team will contact you");
					break;    }
			break;
		case 4:
			exist='n';
			break;
			}
		}
	
	}
}	
