package move;

import net.webservicex.*;


public class CurrencyConvertorClient {
	
	public Double getConversionRate(String fromCurrency, String toCurrency)
	{
		CurrencyConvertor curService= new CurrencyConvertor();
		CurrencyConvertorSoap curSoap= curService.getCurrencyConvertorSoap();
		
		return curSoap.conversionRate(Currency.fromValue(fromCurrency),
			      Currency.fromValue(toCurrency));
	}
}
