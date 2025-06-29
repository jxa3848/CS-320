//jonathan abramavage redue 5//27/2025 


package setter;

public class Contact {
	
	private String ID;
	private String FName;
	private String LName;
	private String Phone;
	private String Address;	
	
	//check the id 
	private final boolean checkID(String ID) {// these are where we set the character limits for everything
		if(ID == null || ID.length() > 10) {
			return false;			
		}		
		return true;
	}
	
	//check the first name
	private final boolean checkFName(String FName) {
		if(FName == null || FName.length() > 10) {
			return false;			
		}
		return true;
	}
	//checks the last name
	private final boolean checkLName(String LName) {
		if(LName == null || LName.length() > 10) {	
			return false;			
		}
		return true;
	}
	//checks the phone
	private final boolean checkPhone(String Phone) {
		if(Phone == null || Phone.length() != 10) {
			return false;			
		}
		return true;
	}
	//checks the address
	private final boolean checkAddress(String address) {
		if(address == null || address.length() > 30) {
			return false;			
		}
		return true;
	}
	
	public Contact(String ID, 
			String FName, 
			String LName, 
			String Phone, 
			String Address) {
		
		if(!this.checkID(ID)) {
			throw new IllegalArgumentException("ID not valid");
		}
		
		if(!this.checkFName(FName)) {
			throw new IllegalArgumentException("first name not valid");
		}
		
		if(!this.checkLName(LName)) {
			throw new IllegalArgumentException("last name not valid");
		}
		
		if(!this.checkPhone(Phone)) {
			throw new IllegalArgumentException("phone not valid");
		}
		
		if(!this.checkAddress(Address)) {
			throw new IllegalArgumentException("address not valid");
		}		
		
		this.ID = ID;
		this.FName = FName;
		this.LName = LName;
		this.Phone = Phone;
		this.Address = Address;
	}

	public String gettheID() {
		return ID;
	}

	public void settheID(String ID) {
		if(!this.checkID(ID)) {
			throw new IllegalArgumentException("ID not valid");
		}
		this. ID= ID;
	}
	// sets if / this statements for the illegal exceptions
	 

	public String gettheFName() {
		return FName;
	}

	public void settheFName(String FName) {
		if(!this.checkFName(FName)) {
			throw new IllegalArgumentException("first name not valid");
		}
		this.FName = FName;
	}

	public String gettheLName() {
		return LName;
	}

	public void settheLName(String LName) {
		if(!this.checkLName(LName)) {
			throw new IllegalArgumentException("last name not valid");
		}
		this.LName = LName;
	}

	public int getthePhone() {
		return Integer.valueOf(Phone);
	}

	public void setthePhone(String Phone) {
		if(!this.checkPhone(Phone)) {
			throw new IllegalArgumentException("phone not valid");
		}
		this.Phone = Phone;
	}

	public String gettheAddress() {
		return Address;
	}

	public void settheAddress(String Address) {
		if(!this.checkAddress(Address)) {
			throw new IllegalArgumentException(" address not valid");
		}	
		this.Address = Address;
	}

}

