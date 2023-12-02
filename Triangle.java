import javax.swing.JOptionPane;

public class Triangle 
{
// copy triangle class
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private int x3;
	private int y3;
	

	public Triangle() // no arg constructor 
	{
		x1= 0;
		y1= 0;
		x2= 0;
		y2= 100;
		x3= 100;
		y3= 100;
		
	}
	
	public Triangle(int x, int y, int xtwo, int ytwo, int xthree, int ythree) //  arg constructor 
	{
		 x1= x;
		 y1= y;     
		 x2= xtwo;
		 y2= ytwo;
		 x3= xthree;
		 y3= ythree;
		 
		 
      }
	
	// accessors 
		public int getX1()       {return x1;}
		public int getY1()       {return y1;}
		public int getX2()       {return x2;}
		public int getY2()       {return y2;}
		public int getX3()       {return x3;}
		public int getY3()       {return y3;}
		public double getSide(int x, int y, int xtwo, int ytwo) {
			return Math.sqrt(Math.pow(x-xtwo,2)+Math.pow(y-ytwo,2));
		}
	// other methods
		public double getPerimeter() {
			double side1=getSide(x1,y1,x2,y2);
			double side2=getSide(x2,y2,x3,y3);
			double side3= getSide(x3,y3,x1,y1);
			
			return (int)((side1+side2+side3)* Math.pow(10, 2))/Math.pow(10, 2);
		} 
		public double getArea() {
			double s=getPerimeter()/2;
			double side1=getSide(x1,y1,x2,y2);
			double side2=getSide(x2,y2,x3,y3);
			double side3= getSide(x3,y3,x1,y1);
			return Math.round(Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)));
			
			}  
		public void getAttributes() {
		
		{
			
			
			String input;
			input=JOptionPane.showInputDialog(null,
			"Please enter an integer",
			"Enter X1 (X-Coordinate of the First Point)",
			JOptionPane.QUESTION_MESSAGE
			);
			
		x1=Integer.parseInt(input);
		}
		
		{
		String input;
		input=JOptionPane.showInputDialog(null,
				"Please enter an integer",
				"Enter Y1 (Y-Coordinate of the First Point)",
				JOptionPane.QUESTION_MESSAGE
				);
				
			y1=Integer.parseInt(input);
		}
		
			{
				String input;
				input=JOptionPane.showInputDialog(null,
						"Please enter an integer",
						"Enter X2 (X-Coordinate of the Second Point)",
						JOptionPane.QUESTION_MESSAGE
						);
						
					x2=Integer.parseInt(input);
				}
			{
				String input;
				input=JOptionPane.showInputDialog(null,
						"Please enter an integer",
						"Enter Y2 (Y-Coordinate of the Second Point)",
						JOptionPane.QUESTION_MESSAGE
						);
						
					y2=Integer.parseInt(input);
				}
			{
				String input;
				input=JOptionPane.showInputDialog(null,
						"Please enter an integer",
						"Enter X3 (X-Coordinate of the Third Point)",
						JOptionPane.QUESTION_MESSAGE
						);
						
					x3=Integer.parseInt(input);
					
			}
			
			{
				String input;
				input=JOptionPane.showInputDialog(null,
						"Please enter an integer",
						"Enter Y3 (Y-Coordinate of the Third Point)",
						JOptionPane.QUESTION_MESSAGE
						);
						
					y3=Integer.parseInt(input);
					
			}
		}
			public String toString()
			{
				return  "      Triangle Properties       "+" \n"+
						"_________________________________"+"\n"+
						"     Point 1     =("+x1+","+y1+")"+"\n"+
						"     Point 2     =("+x2+","+y2+")"+"\n"+
						"     Point 3     =("+x3+","+y3+")"+"\n"+
						"     Perimeter = "+getPerimeter()+" "+"\n"+ 
						"     Area         = "+getArea()+"      "+"\n"+
						"_________________________________"+"\n"
						 ;
						   
						
								
			}
			
		
}