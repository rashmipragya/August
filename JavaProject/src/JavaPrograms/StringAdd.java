package JavaPrograms;

public class StringAdd {
	
	String a = "Rashmi";
	String b = " ";
	String c = "Pragya";
	String d = a+b+c;
	
	public void test()
	{
		int x = 5;
		int y =10;
		int z = x +y;
		int l,m,n;
		l = m = n = 6;
		int q = l+m+n;
		System.out.println(q);	
		int o =9, u =10, r =5;
		int f =o+u+r;
		System.out.println(f);
	}

	public static void main(String[] args) 
	{
		StringAdd add = new StringAdd();
		System.out.println(add.d);
		add.test();
		

	}

}
