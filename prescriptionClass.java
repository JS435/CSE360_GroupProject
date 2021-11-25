//prescription class used to store prescriptions given to patients within our healthcare system
public class prescriptionClass 
{
	//prescription class variables
	String prescriptionName;
	int prescriptionAmount;
	int prescriptionDuration;
	boolean vaccineKey;
	
	//constructor of the prescription class
	prescriptionClass(String name, int amount, int duration, boolean vaccine)
	{
		prescriptionName = name;
		prescriptionAmount = amount;
		prescriptionDuration = duration;
		vaccineKey = vaccine;
	}
	
	//getter for prescription name
	public String getPrescriptionName()
	{
		return prescriptionName;
	}
	
	//getter for the amount that is prescribed
	public int getPrescriptionAmount()
	{
		return prescriptionAmount;
	}
	
	//getter for the duration that the prescription is prescribed
	public int getPrescriptionDuration()
	{
		return prescriptionDuration;
	}
	
	//function used to check if a prescription is a vaccine
	public boolean checkVaccine()
	{
		return vaccineKey;
	}
	
	//setter for the prescription name
	public void setPrescriptionName(String name)
	{
		prescriptionName = name;
	}
	
	//setter for the prescription duration
	public void setPrescriptionDuration(int duration)
	{
		prescriptionDuration = duration;
	}
	
	//setter for the prescription amount
	public void setPrescriptionAmount(int amount)
	{
		prescriptionAmount = amount;
	}
	
	//setter for if the prescription is a vaccine
	public void setPrescriptionVaccine(boolean key)
	{
		vaccineKey = key;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
