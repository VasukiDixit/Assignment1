package Day9;
interface Hotdrink{
   String name(String name);
   int amount(int amt);
}
class Tea implements Hotdrink{

	@Override
	public String name(String name) {
		System.out.println("hotdrink name is"+ name);
		return name;
	}

	@Override
	public int amount(int amt) {
		System.out.println("hotdrink amount is"+ amt);
		return 0;
	}
	
	
}
public class InterfaceApplicationExample {

	public static void main(String[] args) {
	          Tea t=new Tea();
	          t.amount(100);
	          t.name("Tea");
	          }

}
