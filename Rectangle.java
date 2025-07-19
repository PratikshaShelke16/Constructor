
public class Rectangle {
	int lenght;
	int width;
	public Rectangle()
	{
		int lenght = 0;
		int width=0;
		
	}
	public Rectangle(int l,int w)
	{
		 lenght=l;
		 width=w;
		
	}
	public static void main(String[] args) {
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle(10,5);
		System.out.println("r1 :" + r1.lenght + " x " + r1.width );
		System.out.println("r1 :" + r2.lenght + " x " + r2.width );
	}

}
