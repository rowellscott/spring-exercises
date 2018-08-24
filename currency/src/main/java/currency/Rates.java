package currency;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;  


@JsonIgnoreProperties(ignoreUnknown = true)
public class Rates {
	@JsonProperty("EUR")
	private Double EUR;
	
	@JsonProperty("CAD")
	private Double CAD;

	
	//	private Double GBP;
//	private Double CHF;
//	private Double SEK;
	
	public Rates(){
		
	}

	public Double getEUR() {
		return EUR;
	}

	public Double getCAD() {
		return CAD;
	}
//
//	public Double getGBP() {
//		return GBP;
//	}
//
//	public Double getCHF() {
//		return CHF;
//	}
//
//	public Double getSEK() {
//		return SEK;
//	}

//	public void setEUR(Double eUR) {
//		EUR = eUR;
//	}
//
//	public void setCAD(Double cAD) {
//		CAD = cAD;
//	}
//
//	public void setGBP(Double gBP) {
//		GBP = gBP;
//	}
//
//	public void setCHF(Double cHF) {
//		CHF = cHF;
//	}
//
//	public void setSEK(Double sEK) {
//		SEK = sEK;
//	}

	@Override
	public String toString() {
		return "Rates [EUR=" + EUR + ", CAD=" + CAD + "]";
	}
	
	
}
