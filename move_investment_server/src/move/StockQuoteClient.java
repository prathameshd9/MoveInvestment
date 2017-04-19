package move;

import net.webservicex.*;

public class StockQuoteClient {
	
	public String getQuote(String symbol)
	{
		try 
		{
			String companyQuote= "";
			
			StockQuote sc= new StockQuote();
			
			StockQuoteSoap scSoap= sc.getStockQuoteSoap();
			
			companyQuote = scSoap.getQuote(symbol);
			
			companyQuote= companyQuote.substring(companyQuote.indexOf("<Last>")+6, companyQuote.indexOf("</Last>"));

			return companyQuote;
		}
		catch(Exception e) 
		{
			return "Oops. WebService unvailable !!";
		}
		
	}

}
