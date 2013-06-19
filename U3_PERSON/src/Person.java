
public class Person {
	/* wir lernen an der HSR MAS SE 13
@see auch bei HSR
@version 2.0
@author Gianni Zanetti
*/
	// Attribute oder Felder
	private String mName;
	private int mAlter;
	private boolean mSex;
	
	// setter Methode für Name
	public void setName (String pName){
		mName=pName;
	}
	
	//getter Methode für Name
	public String getName(){
		return mName;
	}
	// setter Methode für Alter
	public void setAlter(int pAlter){
		mAlter=pAlter;
	}
	
	// getter Methode für Alter
	public int getAlter(){
		return mAlter;
	}

	public void setSex(boolean pSex)
	{
		
		mSex=pSex;
		
	}

	public boolean getSex(){
		return mSex;
	}
}
