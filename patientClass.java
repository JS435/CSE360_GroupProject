public class patientClass 
{
	String patientFirstName;
	String patientLastName;
	String patientDateOfBirth;
	String patientPhoneNumber;
	String patientEmail;
	String patientAddress;
	String patientPharmacy;
	String patientInsurance;
	int patientPinCode;
	
	prescriptionClass[] prescriptionArray;
	physicalClass[] physicalArray;
	checkupClass[] checkupArray;
	messageClass[] messageArray;
	
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
		messageArray = new messageClass[10];
	}
	
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
	
	public void setPatientFirstName(String name) 
	{
		patientFirstName = name;
	}
	
	public void setPatientLastName(String name)
	{
		patientLastName = name;
	}
	
	public void setPatientDateOfBirth(String birthday)
	{
		patientDateOfBirth = birthday;
	}
	
	public void setPatientPhoneNumber(String number)
	{
		patientPhoneNumber = number;
	}
	
	public void setPatientEmail(String email)
	{
		patientEmail = email;
	}
	
	public void setPatientAddress(String address)
	{
		patientAddress = address;
	}
	
	public void setPatientPharmacy(String pharmacy)
	{
		patientPharmacy = pharmacy;
	}
	
	public void setPatientInsurance(String insurance)
	{
		patientInsurance = insurance;
	}
	
	public String getPatientFirstName()
	{
		return patientFirstName;
	}
	
	public String getPatientLastName()
	{
		return patientLastName;
	}
	
	public String getPatientDateOfBirth()
	{
		return patientDateOfBirth;
	}
	
	public String getPatientPhoneNumber()
	{
		return patientPhoneNumber;
	}
	
	public String getPatientEmail()
	{
		return patientEmail;
	}
	
	public String getPatientAddress()
	{
		return patientAddress;
	}
	
	public String getPatientPharmacy()
	{
		return patientPharmacy;
	}
	
	public String getPatientInsurance()
	{
		return patientInsurance;
	}
	
	public void addPatientPrescription(String name, int duration, int amount, boolean key, int num)
	{
		prescriptionArray[num] = new prescriptionClass(name, amount, duration, key);
	}
	
	public void addPatientPhysical(String name, String results, int num)
	{
		physicalArray[num] = new physicalClass(name, results);
	}
	
	public void addPatientCheckup(String date, String name, String dob, String height, int weight, double temp, String bp, String allergy, String other, int num)
	{
		checkupArray[num] = new checkupClass(date, name, dob, height, weight, temp, bp, allergy, other);
	}
	
	public void addSentMesaage(Boolean MessageSent)
	{
		MessageSent = 0
		if MessageSent = 1
		{	
			System.out.println("Message Sent Successfully");
		}
		else
		{
			System.out.println("Message Not Sent Please try again");
		}
	}
	public void addRecievedMessage(Boolean MessageReceived)
	{
		MessageReceived = 0
		if MessageReceived = 1
		{	
			System.out.println("Message Received");
		}
	}
}
