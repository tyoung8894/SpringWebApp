package young.tyler.SpringBootWebAppExample;

public class Contact {
	private String name;
	private String email;
	private String country;
	
	
	public Contact() {
		this("Tyler", "tyoung12@elon.edu", "USA");	
	}
	
	public Contact(String name, String email, String country) {
		super();
		this.name = name;
		this.email = email;
		this.setCountry(country);	
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

}
