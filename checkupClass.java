//checkup class
public class checkupClass 
{
	//variables of the checkup class
	String checkupDate;
	String checkupPatientName;
	String checkupPatientDateOfBirth;
	String checkupPatientHeight;
	int checkupPatientWeight;
	double checkupPatientTemperature;
	String checkupPatientBloodPressure;
	String checkupPatientAllergy;
	String checkupPatientOther;
	
	//constructor of the checkup class
	checkupClass(String date, String name, String birthday, String height, int weight, double temp, String bp, String allergy, String misc)
	{
		checkupDate = date;
		checkupPatientName = name;
		checkupPatientDateOfBirth = birthday;
		checkupPatientHeight = height;
		checkupPatientWeight = weight;
		checkupPatientTemperature = temp;
		checkupPatientBloodPressure = bp;
		checkupPatientAllergy = allergy;
		checkupPatientOther = misc;
	}
	
	//getter for the checkup patients name
	public String getCheckupPatientName()
	{
		return checkupPatientName;
	}
	
	//getter for the date of the checkup
	public String getCheckupDate()
	{
		return checkupDate;
	}
	
	//getter for the checkup patients date of birth
	public String getCheckupPatientDateOfBirth()
	{
		return checkupPatientDateOfBirth;
	}
	
	//getter for the checkup patients height
	public String getCheckupPatientHeight()
	{
		return checkupPatientHeight;
	}
	
	//getter for the checkup patients weight
	public int getCheckupPatientWeight()
	{
		return checkupPatientWeight;
	}
	
	//getter for the checkup patients temperature
	public double getCheckupPatientTemperature()
	{
		return checkupPatientTemperature;
	}
	
	//getter for the checkup patients blood pressure
	public String getCheckupPatientBloodPressure()
	{
		return checkupPatientBloodPressure;
	}
	
	//getter for the checkup patient allergies
	public String getCheckupPatientAllergy()
	{
		return checkupPatientAllergy;
	}
	
	//getter for the checkup patients other information
	public String getCheckupPatientOther()
	{
		return checkupPatientOther;
	}
	
	//setter for checkup patients name
	public void setCheckupPatientName(String name)
	{
		checkupPatientName = name;
	}
	
	//setter for checkup date
	public void setCheckupDate(String date)
	{
		checkupDate = date;
	}
	
	//setter for checkup patient date of birth
	public void setCheckupPatientDateOfBirth(String dob)
	{
		checkupPatientDateOfBirth = dob;
	}
	
	//setter for checkup patient height
	public void setCheckupPatientHeight(String height)
	{
		checkupPatientHeight = height;
	}
	
	//setter for checkup patient weight
	public void setCheckupPatientWeight(int weight)
	{
		checkupPatientWeight = weight;
	}
	
	//setter for checkup patient temperature
	public void setCheckupPatientTemperature(double temp)
	{
		checkupPatientTemperature = temp;
	}
	
	//setter for checkup patient blood pressure
	public void setCheckupPatientBloodPressure(String bp)
	{
		checkupPatientBloodPressure = bp;
	}
	
	//setter for checkup patient allergies
	public void setCheckupPatientAllergy(String allergy)
	{
		checkupPatientAllergy = allergy;
	}
	
	//setter for checkup patient other information
	public void setCheckupPatientOther(String other)
	{
		checkupPatientOther = other;
	}
}
