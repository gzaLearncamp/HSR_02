
public class PersonAdresse extends Person {

	/**
	 * @param args
	 * 
	 */
	private String mOrt;
	private String mStrasse;
	private String mPLZ;
	private Double dPLZ;
	private String mStrassennummer;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void setStrassennummer(String sStrassennummer)
	{
		mStrassennummer = sStrassennummer;
		
	}
	public String getStrassennummer()
	{
		return mStrassennummer;
		
	}
	
	public void setOrt(String paOrt
			)
	{
		mOrt=paOrt;
	}
	
	public String getOrt()
	{
		return mOrt;
	}
	
	public void setStrasse(String paStrasse)
	{
		mStrasse = paStrasse;
	}
	
	public String getStrasse ()
	{
		return mStrasse;
	}
	
	public void setPLZ(String paPLZ)
	{
		mPLZ=paPLZ;
	}
	public String getPLZ()
	{
		return mPLZ;
	}
	
	public void setiPLZ(Double paiPLZ)
	
	{
		dPLZ = paiPLZ;
	}
	
	public Double getdPLZ()
	{
		return dPLZ;
	}
	
	
}

