package currency;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;   


@JsonIgnoreProperties(ignoreUnknown = true) 
public class CurrencyBase {
	String base;
	String date;
	Rates rates;
	
	public CurrencyBase() {}

	public String getBase() {
		return base;
	}

	public String getDate() {
		return date;
	}

	public Rates getRates() {
		return rates;
	}

	@Override
	public String toString() {
		return "CurrencyBase [base=" + base + ", date=" + date + ", rates=" + rates + "]";
	}
	
	
}
