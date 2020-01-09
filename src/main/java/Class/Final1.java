package Class;

abstract  class Final1 {

	
	
	int i ;
	
	Final1(){
		
		System.out.println("This is constructor of abstract class");
		i=5;
		System.out.println("value of i is = " + i);
	}
	
	
	abstract public void f();
	
	public final void add()
	{
		
		System.out.println("this is final method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	}

}
