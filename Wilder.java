public class Wilder {

	private String firstname;
	private boolean aware;

	public Wilder(String firstname, boolean aware) {
		this.firstname = firstname;
		this.aware = aware;
	}

	public void setFirstname (String firstname)
	{
		this.firstname = firstname;
	}

	public String getFirstname()
	{
		return this.firstname;
	}

	public void setAware(boolean aware)
	{
		this.aware = aware;
	}

	public boolean isAware()
	{
		return this.aware;
	}

	public String whoAmI()
	{
		String isAware = this.isAware() == true? "suis" : "ne suis pas" ;
		return "Je m'appelle " + this.firstname + " et je " + isAware + " aware." ;
	}
}

