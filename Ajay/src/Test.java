class Ajay
{
	int i,j;
	void m1()
	{
		i=i+10;
		j=j+20;
		System.out.println(i);
		System.out.println(j);
	}
}
public class Test extends Ajay {
	void m1()
	{
		i=i+20;
		j=j+30;
		System.out.println(i);
		System.out.println(j);
	}
	

	public static void main(String[] args) {
		Test t=new Test();
		t.m1();
		
		
	}

}
