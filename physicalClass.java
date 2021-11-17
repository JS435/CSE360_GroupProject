public class physicalClass 
{
	String physicalPatientName;
	String physicalResults;
	
	physicalClass(String name, String info)
	{
		physicalPatientName = name;
		physicalResults = info;
	}
	
	public String getPhysicalResults()
	{
		return physicalResults;
	}
	
	public String getPatientName()
	{
		return physicalPatientName;
	}
	
	public void setPhysicalResults(String results)
	{
		physicalResults = results;
	}
	
	public void setPhysicalPatientName(String name)
	{
		physicalPatientName = name;
	}
}
