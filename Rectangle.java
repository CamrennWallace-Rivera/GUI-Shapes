import javax.swing.JOptionPane;

public class Rectangle 
{
	// data members
	private int xTopLeft;
	private int yTopLeft;
	private int width;
	private int height;

	// constructors
	public Rectangle() // no arg constructor 
	{
		 xTopLeft= 0;
		 yTopLeft= 0;
		 width= 100;
		 height= 100;
	}
	public Rectangle(int x, int y, int w , int h) // arg constructor 
	{
		 xTopLeft= x;
		 yTopLeft= y;
		 width= w;
		 height=h;
	}
	// accessors 
	public int getXTopLeft() {return xTopLeft;}
	public int getYTopLeft() {return yTopLeft;}
	public int getWidth()    {return width;}
	public int getHeight()   {return height;}
	// other methods
	public int getPerimeter() {return (2*(height+width));}
	public int getArea()      {return height*width;}
	public void getAttributes()  {
	
	{
		String input;
		input=JOptionPane.showInputDialog(null,
		"Please enter an integer",
		"Top Left X Corner of Rectangle",
		JOptionPane.QUESTION_MESSAGE
		);
		
	xTopLeft=Integer.parseInt(input);
	}
	
	{
	String input;
	input=JOptionPane.showInputDialog(null,
			"Please enter an integer",
			"Top Left Y Corner of Rectangle",
			JOptionPane.QUESTION_MESSAGE
			);
			
		yTopLeft=Integer.parseInt(input);
	}
	
		{
			String input;
			input=JOptionPane.showInputDialog(null,
					"Please enter an integer",
					"Width of the Rectangle",
					JOptionPane.QUESTION_MESSAGE
					);
					
				width=Integer.parseInt(input);
			}
		{
			String input;
			input=JOptionPane.showInputDialog(null,
					"Please enter an integer",
					"Height of the Rectangle",
					JOptionPane.QUESTION_MESSAGE
					);
					
				height =Integer.parseInt(input);
			}
	}
		public String toString()
		{
			return  "      Rectangle Properties   "+" \n"+
					"________________________________"+"\n"+
"TopLeftCorner=("+xTopLeft+"," +yTopLeft+")"+"\n"+
					"           Width = "+width+ "   "+"\n"+
					"          Height = "+height+"   "+"\n"+
					"      Perimeter = "+getPerimeter()+" "+"\n"+ 
					"            Area   = "+getArea()+"      "+"\n"+
					"________________________________"+"\n"
					    ;
					   
					
							
		}
	}


