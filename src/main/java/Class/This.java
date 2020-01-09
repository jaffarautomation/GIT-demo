package Class;

public class This {

	
	int i;
	int j;
	
	public This(int i, int j){
		
	this.i=i;
		this.j=j;
		
	
		
	}
	
	This()
	{
		
		System.out.println("This is default cont");
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	This referencevariable =	new This();
	This referencevariable1 =new This(3,4);
	
        System.out.println(referencevariable.i);
        System.out.println(referencevariable.j);
	}

}
