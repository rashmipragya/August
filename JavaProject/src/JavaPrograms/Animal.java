package JavaPrograms;

public class Animal
{
	int length = 10;
	static int height = 15;
	char skin = 'c';
	String blood = "cold_blooded";
	double weight = 30.48;	
	
	public void color ()
	{
		int a = 10;
		int b = 20;
		int c = a*b;
		double d = a/b;
		double e = a%b;
		System.out.println("Animal is yellow in color");
		System.out.println(a+b+c+d+e);
		System.out.println("c =" + c + " ; d =" + d + "; e = "+ e );
	}

	public void eyes ()
	{
		System.out.println("Eyes are green in color");
		System.out.println(this.blood);
		System.out.println(this.length);
		System.out.println(this.skin);
		System.out.println(this.weight);
		System.out.println(this.height);		
	}
	public static void main(String[] args) 
	{
		Animal an = new Animal();
		int p = 70;
		System.out.println(p);
		System.out.println(height);		
		an.eyes();
		an.color();	
		System.out.println(an.length);
	}

}
