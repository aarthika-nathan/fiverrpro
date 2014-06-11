
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

	public boolean equals(Item item){
		return true;
	}
	
	public void addItem(){
		
	}
	
	public boolean purchase(){
		return true;
	}
	
	public String toString(){
		return "Item name: "+itemName + "\nPrice: "+ itemPrice + "\nItem ID : "+ itemID + "\nNum of Items: "+ count; 
	}
	
	private boolean validateItemId(String ID) {
		// TODO Auto-generated method stubs
		//get the first character of the ID
		if(ID.length() ==8 ){
			String firstCharacter = String.valueOf(ID.charAt(0));
			System.out.println(firstCharacter);
			
			if(firstCharacter.equals("i")){
				//get the 7 characters followed by i
				String valueString = ID.substring(1,8);
				System.out.println(valueString);
				
				//checking whether the remaining 7 characters are digits
				
				try {
					int valueInt= Integer.parseInt(valueString);
					System.out.println("Integers");
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
	

	public static void main(String args[]){
		Item i=new Item();
		i.setItemID("i1234d67");
		
	}
	
}	
	

