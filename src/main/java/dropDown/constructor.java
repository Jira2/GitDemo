package dropDown;

public class constructor {

	int i;
	String name;
	
	constructor(int i, String name)
	{
		this.i=i;
		this.name=name;
	}
	
//	constructor(constructor a)
//	{
//		this.i=a.i;
//		this.name=a.name;
//	}
	
	constructor(){}
	
	void dispaly(){System.out.println(i+" "+name);}
	
	public static final void  main(String[] args) {
		
		constructor s1 = new constructor(11,"ankur");
		//constructor s2 = new constructor(s1);
		constructor s2 = new constructor();
		
		s1.dispaly();
		s2.i=s1.i;
		s2.dispaly();
		
	}

}
