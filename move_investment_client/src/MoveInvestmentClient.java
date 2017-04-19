import java.util.*;
import move.*;

public class MoveInvestmentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard  = new Scanner(System.in);
		
		System.out.println( "Enter a currency to convert to : " );
		String toCurrency = keyboard.next();
		
		MoveInvestmentService mInvst= new MoveInvestmentService();
		MoveInvestment mPort= mInvst.getMoveInvestmentPort();
		
		System.out.println( mPort.investmentValue(toCurrency ));
		
		
	}

}
