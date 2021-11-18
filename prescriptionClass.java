public class prescriptionClass 
{
	String prescriptionName;
	int prescriptionAmount;
	int prescriptionDuration;
	boolean vaccineKey;
	
	prescriptionClass(String name, int amount, int duration, boolean vaccine)
	{
		prescriptionName = name;
		prescriptionAmount = amount;
		prescriptionDuration = duration;
		vaccineKey = vaccine;
	}
	
	public String getPrescriptionName()
	{
		return prescriptionName;
	}
	
	public int getPrescriptionAmount()
	{
		return prescriptionAmount;
	}
	
	public int getPrescriptionDuration()
	{
		return prescriptionDuration;
	}
	
	public boolean checkVaccine()
	{
		return vaccineKey;
	}
	
	public void setPrescriptionName(String name)
	{
		prescriptionName = name;
	}
	
	public void setPrescriptionDuration(int duration)
	{
		prescriptionDuration = duration;
	}
	
	public void setPrescriptionAmount(int amount)
	{
		prescriptionAmount = amount;
	}
	
	public void setPrescriptionVaccine(boolean key)
	{
		vaccineKey = key;
	}
	
	public void sendPrescriptionToPharmacy(){
	 System.out.println("Prescription sent!");
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
