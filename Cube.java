import javax.swing.JOptionPane;

public class Cube 
{
	// data Members
		private int xTopLeftCorner;
		private int yTopLeftCorner;
		private int width;
		private int height;
		private int depth;
				
				
				
	// constructors
	public Cube() // no arg constructor 
		{
		
		 	xTopLeftCorner= 0;
		 	yTopLeftCorner= 0;
		 	depth=100;
		 	width= 100;
		 	height= 100;
		
		}
		
	public Cube(int x, int y, int w , int h, int d) // arg constructor 
		{
		 xTopLeftCorner= x;
		 yTopLeftCorner= y;
		 depth         = d;
		 width         = w;
		 height        = h;
		 
		}
	
	// accessors 
		public int getXTopLeftCorner() {return xTopLeftCorner;}
		public int getYTopLeftCroner() {return yTopLeftCorner;}
		public int getWidth()          {return width;}
		public int getHeight()         {return height;}
		public int getDepth()          {return depth;}
		// other methods
		public int getVolume() {
			 return width*height*depth;}
		public int getSurfaceArea() {
			return 2*(width*height+height*depth+depth*width);}//get formula
		public void getAttributes()  {
		
		
		{
			String input;
			input=JOptionPane.showInputDialog(null,
			"Please enter an integer",
			" X-Coordinate of the Top Left Corner",
			JOptionPane.QUESTION_MESSAGE
			);
			
		xTopLeftCorner=Integer.parseInt(input);
		}
		
		{
			String input;
			input=JOptionPane.showInputDialog(null,
			"Please enter an integer",
			" Y-Coordinate of the Top Left Corner",
			JOptionPane.QUESTION_MESSAGE
			);
			
		yTopLeftCorner=Integer.parseInt(input);
		}
		
		{
			String input;
			input=JOptionPane.showInputDialog(null,
			"Please enter an integer",
			"Width of The Cube",
			JOptionPane.QUESTION_MESSAGE
			);
			
		width=Integer.parseInt(input);
		}
		
		{
			String input;
			input=JOptionPane.showInputDialog(null,
			"Please enter an integer",
			"Height of The Cube",
			JOptionPane.QUESTION_MESSAGE
			);
			
		height=Integer.parseInt(input);
		}
		
		{
			String input;
			input=JOptionPane.showInputDialog(null,
			"Please enter an integer",
			"Depth of The Cube",
			JOptionPane.QUESTION_MESSAGE
			);
			
		depth=Integer.parseInt(input);
		}
		}
		public String toString()
		
		{
			return  "               Cube Properties           "+"\n"+
					"_________________________________________"+"\n"+
					"          Center  = ("+xTopLeftCorner+","+yTopLeftCorner+")"+"\n"+ 
					"           Width  =  "+width+"        "+"\n"+
					"           Height =  "+height+"        "+"\n"+
					"           Depth  =  "+depth+"         "+"\n"+
					"          Surface =  "+getSurfaceArea()+"  "+"\n"+
					"          Volume  =  "+getVolume()+"   "+"\n"+
					"__________________________________________"+"\n"
					    ;
				
		}
}
