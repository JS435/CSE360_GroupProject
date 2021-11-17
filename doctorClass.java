public class doctorClass 
{
	String doctorFirstName;
	String doctorLastName;
	int doctorPinCode;
	String doctorTitle;
	
	doctorClass(String fname, String lname, int pin, String title)
	{
		doctorFirstName = fname;
		doctorLastName = lname;
		doctorPinCode = pin;
		doctorTitle = title;
	}
	
	public String getDoctorFirstName()
	{
		return doctorFirstName;
	}
	
	public String getDoctorLastName()
	{
		return doctorLastName;
	}
	
	public int getDoctorPinCode()
	{
		return doctorPinCode;
	}
	
	public String getDoctorTitle()
	{
		return doctorTitle;
	}
	
	public void setDoctorFirstName(String name)
	{
		doctorFirstName = name;
	}
	
	public void setDoctorLastName(String name)
	{
		doctorLastName = name;
	}
	
	public void setDoctorPinCode(int code)
	{
		doctorPinCode = code;
	}
	
	public void setDoctorTitle(String title)
	{
		doctorTitle = title;
	}
}
