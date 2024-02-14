package Rishicode;
class Phone
{
	public void showTime(){
		System.out.println("This is 8 am");
	}

	public void on(){
		System.out.println("Turnig on Phone...");
	}
}

class smartPhone extends Phone
{
	public void music(){
		System.out.println("Playing music ... ");
	}
	public void on(){
		System.out.println("Turning on smartPhone....");
	}
}
class  R_49_Dynamic_method
{
	public static void main(String[] args) 
	{
		Phone obj = new Phone();
	}
}
