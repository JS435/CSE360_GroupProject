public class checkupClass 
{
	String checkupDate;
	String checkupPatientName;
	String checkupPatientDateOfBirth;
	String checkupPatientHeight;
	int checkupPatientWeight;
	double checkupPatientTemperature;
	String checkupPatientBloodPressure;
	String checkupPatientAllergy;
	String checkupPatientOther;
	
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
	
	public String getCheckupPatientName()
	{
		return checkupPatientName;
	}
	
	public String getCheckupDate()
	{
		return checkupDate;
	}
	
	public String getCheckupPatientDateOfBirth()
	{
		return checkupPatientDateOfBirth;
	}
	
	public String getCheckupPatientHeight()
	{
		return checkupPatientHeight;
	}
	
	public int getCheckupPatientWeight()
	{
		return checkupPatientWeight;
	}
	
	public double getCheckupPatientTemperature()
	{
		return checkupPatientTemperature;
	}
	
	public String getCheckupPatientBloodPressure()
	{
		return checkupPatientBloodPressure;
	}
	
	public String getCheckupPatientAllergy()
	{
		return checkupPatientAllergy;
	}
	
	public String getCheckupPatientOther()
	{
		return checkupPatientOther;
	}
	
	public void setCheckupPatientName(String name)
	{
		checkupPatientName = name;
	}
	
	public void setCheckupDate(String date)
	{
		checkupDate = date;
	}
	
	public void setCheckupPatientDateOfBirth(String dob)
	{
		checkupPatientDateOfBirth = dob;
	}
	
	public void setCheckupPatientHeight(String height)
	{
		checkupPatientHeight = height;
	}
	
	public void setCheckupPatientWeight(int weight)
	{
		checkupPatientWeight = weight;
	}
	
	public void setCheckupPatientTemperature(double temp)
	{
		checkupPatientTemperature = temp;
	}
	
	public void setCheckupPatientBloodPressure(String bp)
	{
		checkupPatientBloodPressure = bp;
	}
	
	public void setCheckupPatientAllergy(String allergy)
	{
		checkupPatientAllergy = allergy;
	}
	
	public void setCheckupPatientOther(String other)
	{
		checkupPatientOther = other;
	}
}
