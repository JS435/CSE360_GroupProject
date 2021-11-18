//physical class that holds all information regarding past physicals patients have had
public class physicalClass 
{
	//physical class variables 
	String physicalPatientName;
	String physicalResults;
	
	//physicalClass constructor
	physicalClass(String name, String info)
	{
		physicalPatientName = name;
		physicalResults = info;
	}
	
	//getter for results of a physical
	public String getPhysicalResults()
	{
		return physicalResults;
	}
	
	//getter for a patients name 
	public String getPatientName()
	{
		return physicalPatientName;
	}
	
	//setter for a patients physical results
	public void setPhysicalResults(String results)
	{
		physicalResults = results;
	}
	
	//setter for a patients name
	public void setPhysicalPatientName(String name)
	{
		physicalPatientName = name;
	}
}
