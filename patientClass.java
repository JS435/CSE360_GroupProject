//patient class that holds all information regarding a patient within our healthcare system
public class patientClass 
{
	//all variables that pertain to the patient class
	String patientFirstName;
	String patientLastName;
	String patientDateOfBirth;
	String patientPhoneNumber;
	String patientEmail;
	String patientAddress;
	String patientPharmacy;
	String patientInsurance;
	int patientPinCode;
	
	//class arrays that hold a patients prescription, checkup, and physical history
	prescriptionClass[] prescriptionArray;
	physicalClass[] physicalArray;
	checkupClass[] checkupArray;
	
	//constructor for the patient class
	patientClass(String fname, String lname, String dob, String num, String mail, String addr, String phar, String insur, int code)
	{
		patientFirstName = fname;
		patientLastName = lname;
		patientDateOfBirth = dob;
		patientPhoneNumber = num;
		patientAddress = addr;
		patientEmail = mail;
		patientPharmacy = phar;
		patientInsurance = insur;
		patientPinCode = code;
		prescriptionArray = new prescriptionClass[10];
		physicalArray = new physicalClass[10];
		checkupArray = new checkupClass[10];
	}
	
	//method used to change the pin code of a patient
	public void patientChangePinCode(int oldPinCode, int newCode)
	{
		if(patientPinCode == oldPinCode)
		{
			patientPinCode = newCode;
			System.out.println("Pin Code successfully changed");
		}
		else
		{
			System.out.println("Current pin code inputted is incorrect. Please try again");
		}
	}
	
	//setter for patients first name
	public void setPatientFirstName(String name) 
	{
		patientFirstName = name;
	}
	
	//setter for patients last name
	public void setPatientLastName(String name)
	{
		patientLastName = name;
	}
	
	//setter for patients date of birth
	public void setPatientDateOfBirth(String birthday)
	{
		patientDateOfBirth = birthday;
	}
	
	//setter for patients phone number
	public void setPatientPhoneNumber(String number)
	{
		patientPhoneNumber = number;
	}
	
	//setter for patients email
	public void setPatientEmail(String email)
	{
		patientEmail = email;
	}
	
	//setter for patients address
	public void setPatientAddress(String address)
	{
		patientAddress = address;
	}
	
	//setter for patients pharmacy
	public void setPatientPharmacy(String pharmacy)
	{
		patientPharmacy = pharmacy;
	}
	
	//setter for patients insurance
	public void setPatientInsurance(String insurance)
	{
		patientInsurance = insurance;
	}
	
	//getter for patients first name
	public String getPatientFirstName()
	{
		return patientFirstName;
	}
	
	//getter for patients last name
	public String getPatientLastName()
	{
		return patientLastName;
	}
	
	//getter for patients date of birth
	public String getPatientDateOfBirth()
	{
		return patientDateOfBirth;
	}
	
	//getter for patients phone number
	public String getPatientPhoneNumber()
	{
		return patientPhoneNumber;
	}
	
	//getter for patients email
	public String getPatientEmail()
	{
		return patientEmail;
	}
	
	//getter for patients address
	public String getPatientAddress()
	{
		return patientAddress;
	}
	
	//getter for patients pharmacy
	public String getPatientPharmacy()
	{
		return patientPharmacy;
	}
	
	//getter method for patients insurance
	public String getPatientInsurance()
	{
		return patientInsurance;
	}
	
	//Function used to add a prescription to the list of prescriptions for a patient
	public void addPatientPrescription(String name, int duration, int amount, boolean key, int num)
	{
		prescriptionArray[num] = new prescriptionClass(name, amount, duration, key);
	}
	
	//Function used to add a physical to the list of physical for a patient
	public void addPatientPhysical(String name, String results, int num)
	{
		physicalArray[num] = new physicalClass(name, results);
	}
	
	//Function used to add a checkup to the list of checkups for a patient
	public void addPatientCheckup(String date, String name, String dob, String height, int weight, double temp, String bp, String allergy, String other, int num)
	{
		checkupArray[num] = new checkupClass(date, name, dob, height, weight, temp, bp, allergy, other);
	}
	
	//public void addSentMesaage()
	//public void addRecievedMessage()
}
