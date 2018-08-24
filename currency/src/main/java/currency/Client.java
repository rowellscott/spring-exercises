package currency;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long accountNum;
	private String firstName;
	private String lastName;
	private double accountValue;
	
	protected Client() {
		
	}
	
	public Client(String firstName, String lastName, double accountValue) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountValue = accountValue;
	}

	public long getAccountNum() {
		return accountNum;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public double getAccountValue() {
		return accountValue;
	}
	
	public void setAccountValue(double newValue) {
		this.accountValue = newValue;
	}

	@Override
	public String toString() {
		return "Client [id=" + accountNum + ", firstName=" + firstName + ", lastName=" + lastName +
				", accountValue=" + accountValue + "]";
	}
}
