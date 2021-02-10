package Assignment3;

class Customer {
      String residentialAddres;
      	String Officialaddress;
	    String cusName;
		public Customer(String residentialAddres, String officialaddress, String cusName) {
			super();
			this.residentialAddres = residentialAddres;
			Officialaddress = officialaddress;
			this.cusName = cusName;
		}
		public void getOfficialaddress() {
	          System.out.println("Official Address:" + Officialaddress);
		}
		public void setOfficialaddress(String officialaddress) {
			Officialaddress = officialaddress;
		}
		public void getResidentialAddres() {
			System.out.println("Residential Address:" +residentialAddres);
		}
		public void setResidentialAddres(String residentialAddres) {
			this.residentialAddres = residentialAddres;
		}
		public void getCusName() {
			System.out.println("Customer:" + cusName);
		}
		public void setCusName(String cusName) {
			this.cusName = cusName;
		}
	
		
}

class AggregationEncapsulationExample1{
	public static void main(String args[]) 
	{
		
		Customer c=new Customer("Banglore","Mysore","mahima");
		c.setCusName("John");
		c.getCusName();
		c.setOfficialaddress("1st Main Electronics city, Bangalore");
		c.getOfficialaddress();
		c.setResidentialAddres("1st Main HSR Layout, Bangalore");
		c.getResidentialAddres();
	}
}














