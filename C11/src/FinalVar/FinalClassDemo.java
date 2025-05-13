package FinalVar;

final class FinalClassDemo 
{
void show()
{
	System.out.println("confidential data");
}

class FinalClassDemo1 extends FinalClassDemo
{
	void show()
	{
		System.out.println("non confidential data");
	}
}
}
