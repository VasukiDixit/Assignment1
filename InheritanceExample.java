package Demo;
		// TODO Auto-generated method stub
		class A
		{
		   public void methodA()
		   {
		      System.out.println("method of Class A");
		   }
		}
		class B extends A
		{
		   public void methodB()
		   {
		      System.out.println("method of Class B");
		   }
		}
		class C extends A
		{
		  public void methodC()
		  {
		     System.out.println("method of Class C");
		  }
		}
		class InheritanceExample{
	
		  public static void main(String args[])
		  {
		     B obj1 = new B();
		   
		   
		     obj1.methodA();
		    
		  
		}

	}

