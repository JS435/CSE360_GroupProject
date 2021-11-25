//doctor class
public class doctorClass 
{
	//variables of the doctor class
	String doctorFirstName;
	String doctorLastName;
	int doctorPinCode;
	String doctorTitle;
	
	//constructor for the doctor class
	doctorClass(String fname, String lname, int pin, String title)
	{
		doctorFirstName = fname;
		doctorLastName = lname;
		doctorPinCode = pin;
		doctorTitle = title;
	}
	
	//getter for the doctor's first name
	public String getDoctorFirstName()
	{
		return doctorFirstName;
	}
	
	//getter for the doctors last name
	public String getDoctorLastName()
	{
		return doctorLastName;
	}
	
	//getter for the doctors pin code
	public int getDoctorPinCode()
	{
		return doctorPinCode;
	}
	
	//getter for the doctors title
	public String getDoctorTitle()
	{
		return doctorTitle;
	}
	
	//setter for doctors first name
	public void setDoctorFirstName(String name)
	{
		doctorFirstName = name;
	}
	
	//setter for the doctors last name
	public void setDoctorLastName(String name)
	{
		doctorLastName = name;
	}
	
	//setter for the doctors pin code
	public void setDoctorPinCode(int code)
	{
		doctorPinCode = code;
	}
	
	//setter for the doctors title
	public void setDoctorTitle(String title)
	{
		doctorTitle = title;
	}
}
