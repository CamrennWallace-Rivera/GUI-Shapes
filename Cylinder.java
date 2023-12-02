import javax.swing.JOptionPane;

public class Cylinder 
{
	// data members
	private int xCenterofBase;
	private int yCenterofBase;
	private int rBase;
	private int height;

	// constructors
	public Cylinder() // no arg constructor 
	{
		 xCenterofBase= 0;
		 yCenterofBase= 0;
		 rBase= 100;
		 height= 100;
	}
	public Cylinder(int x, int y, int r , int h) // arg constructor 
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
	public double getSurfaceArea() { 
						return ((int) 
								(Math.pow(10, 2) 
										*(2*Math.PI*rBase)*(height+rBase))
																		)/Math.pow(10, 2);}
											 
											 
	public double getVolume(){
		return ((int) 
				(Math.pow(10, 2)
			            * (Math.PI*Math.pow(rBase,2)*height)
											)/Math.pow(10, 2));}
	public void getAttributes()  {
	
	{
		String input;
		input=JOptionPane.showInputDialog(null,
		"Please enter an integer",
		"X Center of Base",
		JOptionPane.QUESTION_MESSAGE
		);
		
	xCenterofBase=Integer.parseInt(input);
	}
	
	{
	String input;
	input=JOptionPane.showInputDialog(null,
			"Please enter an integer",
			"Y Center of Base",
			JOptionPane.QUESTION_MESSAGE
			);
			
		yCenterofBase=Integer.parseInt(input);
	}
	
		{
			String input;
			input=JOptionPane.showInputDialog(null,
					"Please enter an integer",
					"Radius of the Cylinder",
					JOptionPane.QUESTION_MESSAGE
					);
					
				rBase=Integer.parseInt(input);
			}
		{
			String input;
			input=JOptionPane.showInputDialog(null,
					"Please enter an Integer",
					"Height of Cylinder",
					JOptionPane.QUESTION_MESSAGE
					);
					
				height =Integer.parseInt(input);
			}
	}
		public String toString()
		{
			return  "      Cylinder Properties   "+" \n"+
					"________________________________"+"\n"+
"TopLeftCorner=("+xCenterofBase+"," +yCenterofBase+")"+"\n"+
					"           Width = "+rBase+ "   "+"\n"+
					"          Height = "+height+"   "+"\n"+
					"     Surface Area = "+getSurfaceArea()+" "+"\n"+ 
					"        Volume   = "+getVolume()+"      "+"\n"+
					"________________________________"+"\n"
					    ;
					   
					
							
		}
	}


