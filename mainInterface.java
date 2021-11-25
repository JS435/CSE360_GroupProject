//imported class libraries
import java.util.Scanner;

//main interface class
public class mainInterface
{
	public static void main(String[] args)
	{
		//scanner variables used to take inout from user/keyboard
		Scanner scan = new Scanner(System.in);
		
		//patient array with list of patients within healthcare system
		patientClass[] listOfPatients = new patientClass[3];
		listOfPatients[0] = new patientClass("Jaden", "Swensen", "June 2nd, 2001", "123-456-7890",
				"Jswensen@asu.edu", "ASU", "ASU pharmacy", "ASU Insurance", 2525);
		
		listOfPatients[1] = new patientClass("James", "Smith", "March 3rd, 1999", "111-222-3333",
				"Jamessmith@gmail.com", "123 West Road", "Walgreens", "State farm", 1234);
		
		listOfPatients[2] = new patientClass("Ron", "Jon", "December 20th, 1876", "123-123-1234",
				"Ronjon@yahoo.com", "789 Far Lane", "Walgreens", "Progressive", 5678);
		
		
		//Patient: Jaden Swensen Information
		listOfPatients[0].addPatientPrescription("Drug", 10, 500, false, 0);
		listOfPatients[0].addPatientPrescription("Drug 2", 5, 200, false, 1);
		listOfPatients[0].addPatientPrescription("Vaccine", 1, 100, true, 2);
		listOfPatients[0].addPatientPhysical("Jaden Swensen", "Patient looks healthy and all tests came back good. ", 0);
		listOfPatients[0].addPatientCheckup("10/31", "Jaden Swensen", "June 2nd, 2001", "5' 10", 140, 98.2, "90mm Hg", "No allegeries", "N/A", 0);
		
		//Patient: James Smith Information
		listOfPatients[1].addPatientPrescription("Drug 3", 3, 250, false, 0);
		listOfPatients[1].addPatientPhysical("James Smith", "Blood pressure was a bit higher than normal. Weight is slightly above healthy levels but, besides that everything looks good.", 0);
		
		//Patient: Ron Jon Information
		//No information for patient Ron Jon
		
		//Array of Doctors and Nurses
		doctorClass[] listOfDocs = new doctorClass[10];
		doctorClass[] listOfNurses = new doctorClass[10];
		
		//Placeholder variables for the arrys
		String doctorName = "Doctor";
		String nurseName = "Nurse";
		int doctorPinCode = 1000;
		int nursePinCode = 2000;
		String doctorTitle = "Doctor";
		String nurseTitle = "Nurse";
		
		//loop to fill doctor and nurse arrays
		for(int i = 0; i < 9; i++)
		{
			listOfDocs[i] = new doctorClass(doctorName, doctorName, doctorPinCode, doctorTitle);
			listOfNurses[i] = new doctorClass(nurseName, nurseName, nursePinCode, nurseTitle);
		}
		listOfNurses[9] = new doctorClass("Jaden", "Swensen", 2525, "Nurse");
		
		//
		System.out.println("Welcome to our Healthcare System. Please select your role.");
		System.out.println("1: Nurse");
		System.out.println("2: Doctor");
		System.out.println("3: Patient");
		System.out.println("0: Exit");
		int roleInput = scan.nextInt();
		scan.nextLine();
		
		if(roleInput == 0)
		{
			System.out.println("Exiting Healthcare System.");
			System.exit(0);
		}
		
		int loopCondition1 = 1;
		if(roleInput == 1)
		{
			System.out.println("Welcome to the Healthcare System - Nurse");
			while(loopCondition1 != 0)
			{
				System.out.println("Please Input your first name:");
				String nurseFName = scan.nextLine();
			
				System.out.println("Please input your last name:");
				String nurseLName = scan.next();
			
				System.out.println("Please input your 4-digit pin code");
				int nurseLoginCode = scan.nextInt();
				scan.nextLine();
			
				for(int i = 0; i < 10; i++)
				{
					if(listOfNurses[i].getDoctorFirstName().equals(nurseFName) && listOfNurses[i].getDoctorLastName().equals(nurseLName) && listOfNurses[i].getDoctorPinCode() == nurseLoginCode)
					{
						System.out.println("Nurse Login Successful! Welcome " + listOfNurses[i].getDoctorFirstName() + " " + listOfNurses[i].getDoctorLastName() + "\n");
						int nurseLocation = i;
						i = 11;
						loopCondition1 = 0;
					}
				}
				if(loopCondition1 != 0)
				{
					System.out.println("Nurse login not found. Please try again.\n");
				}
			}
			
			System.out.println("What action would you like to peform?");
			System.out.println("1: View Patients");
			System.out.println("2: Change Pin Code");
			System.out.println("0: Exit System");
			int nurseOption = scan.nextInt();
			
			if(nurseOption == 0)
			{
				System.out.println("Exiting Heathcare System.");
				System.exit(0);
			}
			else if(nurseOption == 1)
			{
				for(int i = 0; i < listOfPatients.length; i++)
				{
					System.out.println("Patient " + i + ":");
					System.out.println("First Name: " + listOfPatients[i].getPatientFirstName());
					System.out.println("Last Name: " + listOfPatients[i].getPatientLastName());
					System.out.print("\n");
				}
				System.out.println("Please select a patient:");
				int patientOption = scan.nextInt();
				scan.nextLine();
				
				if(patientOption == 0)
				{
					int loopCondition2 = 1;
					while(loopCondition2 != 0)
					{
						System.out.println("Please select what option to perform for Patient " + patientOption);
						System.out.println("1: View patient information");
						System.out.println("2: View patient prescriptions");
						System.out.println("3: View patient physicals");
						System.out.println("4: View patient checkups");
						System.out.println("5: Add a physical");
						System.out.println("6: Add a checkup");
						System.out.println("0: Exit System");
						int patientActionOption = scan.nextInt();
						scan.hasNextLine();
					
						if(patientActionOption == 1)
						{
							System.out.println("First Name: " + listOfPatients[patientOption].getPatientFirstName());
							System.out.println("Last Name: " + listOfPatients[patientOption].getPatientLastName());
							System.out.println("Date of Birth: " + listOfPatients[patientOption].getPatientDateOfBirth());
							System.out.println("Phone Number: " + listOfPatients[patientOption].getPatientPhoneNumber());
							System.out.println("Email: " + listOfPatients[patientOption].getPatientEmail());
							System.out.println("Address: " + listOfPatients[patientOption].getPatientAddress());
							System.out.println("Pharmacy: " + listOfPatients[patientOption].getPatientPharmacy());
							System.out.println("Insurance: " + listOfPatients[patientOption].getPatientInsurance());
							System.out.print("\n");
						}
						else if(patientActionOption == 2)
						{
							if(listOfPatients[patientOption].prescriptionArray.length == 0)
							{
								System.out.println("No prescriptions for this patient");
							}
							else
							{
								for(int i = 0; i < 3; i++)
								{
									System.out.println("Prescription " + (i + 1) + ":");
									System.out.println("Prescription Name: " + listOfPatients[patientOption].prescriptionArray[i].getPrescriptionName());
									System.out.println("Prescription Duration: " + listOfPatients[patientOption].prescriptionArray[i].getPrescriptionDuration() + " days");
									System.out.println("Prescription Amount: " + listOfPatients[patientOption].prescriptionArray[i].getPrescriptionAmount() + "mg");
									System.out.println("Prescription Vaccine: " + listOfPatients[patientOption].prescriptionArray[i].checkVaccine());
									System.out.print("\n");
								}
							}
						}
						else if(patientActionOption == 0)
						{
							System.out.println("Exiting Healthcare System");
							System.exit(0);
						}
					}
				}
				else if(patientOption == 1)
				{
					int loopCondition2 = 1;
					while(loopCondition2 != 0)
					{
						System.out.println("Please select what option to perform for Patient " + patientOption);
						System.out.println("1: View patient information");
						System.out.println("2: View patient prescriptions");
						System.out.println("3: View patient physicals");
						System.out.println("4: View patient checkups");
						System.out.println("5: Add a physical");
						System.out.println("6: Add a checkup");
						System.out.println("0: Exit System");
						int patientActionOption = scan.nextInt();
						scan.hasNextLine();
					
						if(patientActionOption == 1)
						{
							System.out.println("First Name: " + listOfPatients[patientOption].getPatientFirstName());
							System.out.println("Last Name: " + listOfPatients[patientOption].getPatientLastName());
							System.out.println("Date of Birth: " + listOfPatients[patientOption].getPatientDateOfBirth());
							System.out.println("Phone Number: " + listOfPatients[patientOption].getPatientPhoneNumber());
							System.out.println("Email: " + listOfPatients[patientOption].getPatientEmail());
							System.out.println("Address: " + listOfPatients[patientOption].getPatientAddress());
							System.out.println("Pharmacy: " + listOfPatients[patientOption].getPatientPharmacy());
							System.out.println("Insurance: " + listOfPatients[patientOption].getPatientInsurance());
							System.out.print("\n");
						}
						else if(patientActionOption == 2)
						{
								for(int i = 0; i < 1; i++)
								{
									System.out.println("Prescription " + (i + 1) + ":");
									System.out.println("Prescription Name: " + listOfPatients[patientOption].prescriptionArray[i].getPrescriptionName());
									System.out.println("Prescription Duration: " + listOfPatients[patientOption].prescriptionArray[i].getPrescriptionDuration() + " days");
									System.out.println("Prescription Amount: " + listOfPatients[patientOption].prescriptionArray[i].getPrescriptionAmount() + "mg");
									System.out.println("Prescription Vaccine: " + listOfPatients[patientOption].prescriptionArray[i].checkVaccine());
									System.out.print("\n");
								}
						}
						else if(patientActionOption == 0)
						{
							System.out.println("Exiting Healthcare System");
							System.exit(0);
						}
					}
				}
				else if(patientOption == 2)
				{
					int loopCondition2 = 1;
					while(loopCondition2 != 0)
					{
						System.out.println("Please select what option to perform for Patient " + patientOption);
						System.out.println("1: View patient information");
						System.out.println("2: View patient prescriptions");
						System.out.println("3: View patient physicals");
						System.out.println("4: View patient checkups");
						System.out.println("5: Add a physical");
						System.out.println("6: Add a checkup");
						System.out.println("0: Exit System");
						int patientActionOption = scan.nextInt();
						scan.hasNextLine();
					
						if(patientActionOption == 1)
						{
							System.out.println("First Name: " + listOfPatients[patientOption].getPatientFirstName());
							System.out.println("Last Name: " + listOfPatients[patientOption].getPatientLastName());
							System.out.println("Date of Birth: " + listOfPatients[patientOption].getPatientDateOfBirth());
							System.out.println("Phone Number: " + listOfPatients[patientOption].getPatientPhoneNumber());
							System.out.println("Email: " + listOfPatients[patientOption].getPatientEmail());
							System.out.println("Address: " + listOfPatients[patientOption].getPatientAddress());
							System.out.println("Pharmacy: " + listOfPatients[patientOption].getPatientPharmacy());
							System.out.println("Insurance: " + listOfPatients[patientOption].getPatientInsurance());
							System.out.print("\n");
						}
						else if(patientActionOption == 2)
						{
								System.out.println("No prescriptions for this patient\n");
								
						}
						else if(patientActionOption == 0)
						{
							System.out.println("Exiting Healthcare System");
							System.exit(0);
						}
					}
				}
			}
		}
	}
}
