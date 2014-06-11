
public class Item {

	String itemName; //maximum 15 characters
	String itemID;
	double itemPrice; //non negative value
	int count; //number of items currently in the stock
	
	
/*Creates a new blan item*/

	public Item(){
		count=0;
	}
	
/*
Method Name: setIemPrice
Method Purpose: Stores the non-negative price for this item
Return Type: boolean value of the itemPrice
Parameters: None
*/	
	public boolean setItemPrice(double price){
		if(price>=0){
			itemPrice=price;
			return true;
		}
		else
			return false;
		
	}
/*
Method Name: setIemName
Method Purpose: Stores at most 15 characters for the item name
User enters the name of the item
*/	
	
	public void setItemName(String itemName){
		if(itemName.length()==15){
			this.itemName=itemName;
		}
		else{
			System.out.println("Invalid item name. Give atmost 15 characters");
		}
	}
/*
Method Name: setIemID
Method Purpose: validates and sets the ItemIF
Return Type: boolean value of the itemID
Parameters: (String) ItemID
*/	
	
	public boolean setItemID(String itemID){
		boolean status=validateItemId(itemID);
		if(status){
			this.itemID=itemID;
			return true;
		}
			
		else
			return false;
	}
/*
Method Name: equals
Method Purpose: checking whether itemName, itemPrice and itemID are equal
Return Type: boolean value for the item
Parameters: (Item) item
*/	

	public boolean equals(Item item){
		if(item.itemPrice == itemPrice && item.itemName.equalsIgnoreCase(itemName) && item.itemID.equals(itemID))
			return true;
		else
			return false;
		
	}
/*
Method Name: addItem
Method Purpose: increments the number of this item in the stock
Return Type: None
Parameters: None
*/	
	
	public void addItem(){
		count++;
	}
/*
Method Name: purchase
Method Purpose: If the item is available decrements the number in the stock
Return Type: boolean value for the count item
Parameters: None
*/	
	
	public boolean purchase(){
		//if item is available decrement the stock count
		if(count>0){
			count--;
			return true;
		}
		else
			return false;
	}
/*
Method Name: toString
Method Purpose: String representation of this item
Return Type: Retrieves the detail of the item 
Parameters: None
*/	
	
	public String toString(){
		return "Item name: "+itemName + "\nPrice: "+ itemPrice + "\nItem ID : "+ itemID + "\nNum of Items: "+ count; 
	}
/*
Method Name: validateItemId
Method Purpose: checking the validity of the ID
Return Type: boolean value of the validation result 
Parameters: (String)ID
*/	
	
	private boolean validateItemId(String ID) {
		if(ID.length() ==8 ){
			String firstCharacter = String.valueOf(ID.charAt(0));
			if(firstCharacter.equals("i")){
				String valueString = ID.substring(1,8);
				try {
					int valueInt= Integer.parseInt(valueString);
					return true;
				}catch(Exception e){
					return false;
				}	
			}
			else
				return false;
		}
		else
			return false;
	}
	
	
}	
	

