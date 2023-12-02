import javax.swing.JOptionPane;

public class Cone 
{
	// data members
	private int xCenterofBase;
	private int yCenterofBase;
	private int rBase;
	private int height;

	// constructors
	public Cone() // no arg constructor 
	{
		 xCenterofBase= 0;
		 yCenterofBase= 0;
		 rBase= 100;
		 height= 100;
	}
	public Cone(int x, int y, int r , int h) // arg constructor 
	{
		 xCenterofBase= x;
		 yCenterofBase= y;
		 rBase= r;
		 height=h;
	}
	// accessors 
	public int getXCenterofBase ()  {return xCenterofBase;}
	public int getYCenterofBase()   {return yCenterofBase;}
	public int getRBase()           {return rBase;}
	public int getHeight()          {return height;}
	// other methods
	public double getSurfaceArea()  {return ((int)(Math.PI*rBase*(rBase+Math.sqrt(Math.pow(height,2)+Math.pow(rBase, 2))))); }
	public double getVolume()       {return  ((int)(Math.pow(10, 2)*(Math.PI*Math.pow(rBase, 2))*(height/3))/Math.pow(10,2));}
	public void getAttributes()  {
	
	{
		String input;
		input=JOptionPane.showInputDialog(null,
		"Please enter an integer",
		"X Base of Center",
		JOptionPane.QUESTION_MESSAGE
		);
		
	xCenterofBase=Integer.parseInt(input);
	}
	
	{
	String input;
	input=JOptionPane.showInputDialog(null,
			"Please enter an integer",
			"Y Base of Center",
			JOptionPane.QUESTION_MESSAGE
			);
			
		yCenterofBase=Integer.parseInt(input);
	}
	
		{
			String input;
			input=JOptionPane.showInputDialog(null,
					"Please enter an integer",
					"Radius of the Base",
					JOptionPane.QUESTION_MESSAGE
					);
					
				rBase=Integer.parseInt(input);
			}
		{
			String input;
			input=JOptionPane.showInputDialog(null,
					"Please enter an Integer",
					"Height of the Cone",
					JOptionPane.QUESTION_MESSAGE
					);
					
				height =Integer.parseInt(input);
			}
	}
		public String toString()
		{
			return  "      Cone Properties   "+" \n"+
					"________________________________"+"\n"+
"Base Center =("+xCenterofBase+"," +yCenterofBase+")"+"\n"+
					"           Radius = "+rBase+ "   "+"\n"+
					"          Height = "+height+"   "+"\n"+
					"     Surface Area = "+getSurfaceArea()+" "+"\n"+ 
					"        Volume   = "+getVolume()+"      "+"\n"+
					"________________________________"+"\n"
					    ;
					   
					
							
		}
	}


