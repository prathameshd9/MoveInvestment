package move;

import net.webservicex.*;

import java.util.*;


@javax.jws.WebService
public class MoveInvestment {
	
	
	//Get the current stock quote
	public Double getQuote(String symbol)
	{
		
		StockQuoteClient sqClient= new StockQuoteClient();
		
		return Double.parseDouble(sqClient.getQuote(symbol));
	}
	
	

	
	//move the investments of list of companies from one currency to another
	@javax.jws.WebMethod
	  public String investmentValue( String toCurrency)
    {
            String message= null;
            double quotes= 0.00;
            double finalAmount= 0.00;

            ArrayList<String> companyList= new ArrayList<String>();
            companyList.add("AAPL");
            companyList.add("BA");
            companyList.add("IBM");
            companyList.add("KO");
            companyList.add("HD");

            CurrencyConvertorClient cConvertor= new CurrencyConvertorClient();
            Double rate= cConvertor.getConversionRate("USD", toCurrency);

            StockQuoteClient sqClient= new StockQuoteClient();

             Iterator<String> itr=companyList.iterator();
             while(itr.hasNext()){
            	 	String value=sqClient.getQuote(itr.next());
            	 	if(value.equalsIgnoreCase("Oops. WebService unvailable !!"))
            	 	{
            	 		return "Oops. WebService unvailable !!";
            	 	}
            	 	quotes += Double.parseDouble(value) * 1000.00;
             }


            finalAmount= quotes * rate;

            if(finalAmount>0)
            {
                    message= "" + "Converted company stock price is: " + finalAmount;
            }

            else
            {
                    message= "Error !! Unable to claculate net worth.";
            }
            return message;

    }
}
