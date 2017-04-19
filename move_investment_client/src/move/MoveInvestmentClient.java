import java.util.*;

public class MoveInvestmentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard  = new Scanner(System.in);
		
		System.out.println( "Enter a currency to convert to : " );
		int toCurrency = keyboard.nextInt();
		
		MoveInvestmentService mInvst= new MoveInvestmentService();
		MoveInvestment mPort= mInvst.getMoveInvestmentPort();
		
		System.out.println( mPort.investmentValue(toCurrency));
		
		
	}

}
