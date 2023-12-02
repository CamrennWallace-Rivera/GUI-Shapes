import javax.swing.JOptionPane;

public class RegularPolygon {
	// copy Polygon class
			private int xCenter;
			private int yCenter;
			private int nSides;
			private int rCircle;
			
			
			
	// constructors
			public RegularPolygon() // no arg constructor 
			{
				 xCenter  = 0;
				 yCenter  = 0;
				 nSides   = 0;
				 rCircle  = 0;
			}
			
			public RegularPolygon(int x, int y, int s, int r)  // arg constructor
			{
				xCenter =  x;
				yCenter =  y;
				nSides  =  s;
				rCircle =  r;
			}
			
	//get accessors
			
			public int getXcenter()      {return xCenter;}
			public int getYcenter()      {return yCenter;}
			public int getNSides()       {return nSides;}
			public int getRCircle()      {return rCircle;}
			// other accessors
			
			public double getPerimeter() {
				return Math.round(getSideLength()*nSides)
					
					;}
			public double getArea() {
				
				return ((int)
						(Math.pow(10, 2) 															
						        *(nSides*Math.pow(rCircle, 2)*Math.sin(2*Math.PI/nSides))/2))   
																						/Math.pow(10, 2)
				
					;}
			public double getSideLength() {
				
				return  Math.round((2*Math.sin(Math.PI/nSides))*rCircle)
				
				;}
			public void getAttributes() {    
			
			{
				String input;
				input=JOptionPane.showInputDialog(null,
						"Please enter an integer:",
						" X-Coordinate of the Center",
						JOptionPane.QUESTION_MESSAGE
						);
			
					xCenter=Integer.parseInt(input);
			}
			
			
			{
				String input;
				input=JOptionPane.showInputDialog(null,
						"Please enter an integer:",
						"Y-Coordinate of the Center",
						JOptionPane.QUESTION_MESSAGE
						);
			
					yCenter=Integer.parseInt(input);
			}
			
			{
				String input;
				input=JOptionPane.showInputDialog(null,
						"Please enter an integer:",
						"Radius of Bounding Circle",
						JOptionPane.QUESTION_MESSAGE
						);
			
					rCircle=Integer.parseInt(input);
			}
			
			{
				String input;
				input=JOptionPane.showInputDialog(null,
						"Please enter an integer:",
						"Number of Sides of Regular Polygon",
						JOptionPane.QUESTION_MESSAGE
						);
			
					nSides=Integer.parseInt(input);
			}
			}
			public String toString()
			
			{
				return  "         Regular Polygon Properties              "+"\n"+
						"_________________________________________________"+"\n"+
						"           Center     = ("+xCenter+","+yCenter+")"+"\n"+ 
						"           Radius     =  "+rCircle+"             "+"\n"+
						"           # Sides    =  "+nSides+"              "+"\n"+
						"       Side Length =  "+getSideLength()+"     "+"\n"+
						"          Perimeter  =  "+getPerimeter()+"      "+"\n"+
						"                Area    =  "+getArea()+"      "+"\n"+
						"_________________________________________________"+"\n"
						   ;
			}
}
