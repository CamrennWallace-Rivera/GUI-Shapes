import javax.swing.JOptionPane;

public class Sphere 
{
	// data Members
			private int xCenter;
			private int yCenter;
			private int radius;
			
			
			// constructors
			public Sphere() // no arg constructor 
				{
				
				 	xCenter= 0;
				 	yCenter= 0;
				 	radius=100;
				
				}
			
			public Sphere(int x, int y, int r) // arg constructor 
			{
			 xCenter= x;
			 yCenter= y;
			 radius = r;
			 
			}
			
			// accessors 
			public int getXcenter()        {return xCenter;}
			public int getYcenter()        {return yCenter;}
			public int getRadius()          {return radius;}
			
			// other methods
			public double getVolume() {
				return ((int) (10.0*(4/3.0)*Math.PI*Math.pow(radius, 3)))/10.0;
				}
			public double getSurfaceArea() {
				
				    return ((int)(Math.pow(10, 2)*(4*Math.PI*Math.pow(radius, 2)) )/Math.pow(10,2));
	
						
				} 
			public void getAttributes()  {
			
			{
				String input;
				input=JOptionPane.showInputDialog(null,
				"Please enter an integer",
				" X-Coordinate of The Center",
				JOptionPane.QUESTION_MESSAGE
				);
				
			xCenter=Integer.parseInt(input);
			}
			
			
			{
				String input;
				input=JOptionPane.showInputDialog(null,
				"Please enter an integer",
				" Y-Coordinate of The Center",
				JOptionPane.QUESTION_MESSAGE
				);
				
			yCenter=Integer.parseInt(input);
			}
			
			{
				String input;
				input=JOptionPane.showInputDialog(null,
				"Please enter an integer",
				" Radius",
				JOptionPane.QUESTION_MESSAGE
				);
				
			radius=Integer.parseInt(input);
			}
			}
			
			public String toString()
			
			{
				return  "               Sphere Properties         "+"\n"+
						"_________________________________________"+"\n"+
						"          Center  = ("+xCenter+","+yCenter+")"+"\n"+ 
						"          Radius  =  "+radius+"            "+"\n"+
						"     Surface Area =  "+getSurfaceArea()+"  "+"\n"+
						"          Volume  =  "+getVolume()+"       "+"\n"+
						"__________________________________________"+"\n"
						  ;
			}
}
