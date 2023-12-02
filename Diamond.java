import javax.swing.JOptionPane;

public class Diamond 
{
	// copy Diamond class
		private int xCenter;
		private int yCenter;
		private int height;
		private int width;
		
		
		
		// constructors
		public Diamond() // no arg constructor 
		{
			 xCenter = 0;
			 yCenter = 0;
			 height  = 100;
			 width   = 100;
		}
		
		public Diamond(int x, int y, int h, int w)  // arg constructor
		{
			xCenter=  x;
			yCenter=  y;
			height =  h;
			width  =  w;
		}
		
		
			//get accessors
			
			public int getXcenter()      {return xCenter;}
			public int getYcenter()      {return yCenter;}
			public int getHeight()       {return height;}
			public int getWidth()        {return width;}
			// other accessors
			
			public int getArea() {
				return (width*height/2);
				}
			
			public double getPerimeter() {
			double x= Math.sqrt(Math.pow(xCenter-(width/2.0)-xCenter,2)+Math.pow(yCenter-(yCenter-(height/2.0)),2))*4;
					return ((int) (x* Math.pow(10, 2)))/Math.pow(10, 2);
				}
			public void getAttributes() {
		
			{
			String input;
			input=JOptionPane.showInputDialog(null,
					"Please enter an integer:",
					"Enter X (X-Coordinate of the Center of the Diamond)",
					JOptionPane.QUESTION_MESSAGE
					);
		
				xCenter=Integer.parseInt(input);
			}
			
			{
				String input;
				input=JOptionPane.showInputDialog(null,
						"Please enter an integer:",
						"Enter Y (Y-Coordinate of the Center of the Diamond)",
						JOptionPane.QUESTION_MESSAGE
						);
			
					yCenter=Integer.parseInt(input);
			}
			
			{
				String input;
				input=JOptionPane.showInputDialog(null,
						"Please enter an integer:",
						"Enter The Width of The Diamond",
						JOptionPane.QUESTION_MESSAGE
						);
					width=Integer.parseInt(input);
			}
			
			{
				String input;
				input=JOptionPane.showInputDialog(null,
						"Please enter an integer:",
						"Enter Height of The Diamond",
						JOptionPane.QUESTION_MESSAGE
						);
			
					height=Integer.parseInt(input);
			}
			}
			
			
			public String toString()
			
			{
				return  "         Diamond Properties             "+"\n"+
						"_________________________________________"+"\n"+
						"          Center  = ("+xCenter+","+yCenter+")"+"\n"+ 
						"           Width  =   "+width+"             "+"\n"+
						"           Height =  "+height+"             "+"\n"+
						"             Area   =  "+getArea()+"   "+"\n"+
						"       Perimeter =  "+getPerimeter()+"   "+"\n"+
						"__________________________________________"+"\n"
						 ;
					
			}
	
	}
