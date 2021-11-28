package greatlearning.model;

public class Employee {
	String firstName;
	String lastName;
	public Employee (String firstName , String lastName)
	{	
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	public String getFirstName ()
	{
		return firstName;
	}
	public void setFirstName (String changedName)
	{
		firstName = changedName;
	}
	public String getLastName ()
	{
		return lastName;
	}
	public void setlastName (String changedName)
	{
		lastName = changedName;
	}

}
