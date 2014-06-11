public class Item {

	String itemName; //maximum 15 characters 
	String itemID; 
	double itemPrice; //non negative value 
	int count; //number of items currently in the stock 
	
	public Item(){ 
		count=0; 
		} 
	
	public boolean setItemPrice(double price){
		if(price>=0){
			itemPrice=price; 
			return true; 
		}
		else 
			return false; 
	} 
	
	public void setItemName(String itemName){
		if(itemName.length()==15){
			this.itemName=itemName; 
		} 
		else{ 
			System.out.println("Invalid item name. Give atmost 15 characters"); 
		} 
	} 
	
	public boolean setItemID(String itemID){
		boolean status=validateItemId(itemID);
		if(status){
			this.itemID=itemID;
			return true;
		} 
		else 
			return false;
	}

	
	private boolean validateItemId(String itemID2) { 
		// TODO Auto-generated method stubs return false; 
		boolean bool = false;
		return bool;
	} 

}