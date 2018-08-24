package currency;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Rates {
	@JsonProperty("EUR")
	private Double EUR;

	@JsonProperty("CAD")
	private Double CAD;

	public Rates() {

	}

	public Double getEUR() {
		return EUR;
	}

	public Double getCAD() {
		return CAD;
	}

	@Override
	public String toString() {
		return "Rates [EUR=" + EUR + ", CAD=" + CAD + "]";
	}

}
