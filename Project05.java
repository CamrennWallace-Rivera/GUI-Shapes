
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.Color;

public class Project05 extends Frame implements ActionListener
{
	//  Objects
	String command = "";
	//Objects
	Rectangle r;
	Triangle  t;
	Diamond   d;
	RegularPolygon p;
	Cube c;
	Sphere s;
	Cone cn;
	Cylinder cy;
	
	
	
	
	// Colors
	JColorChooser colorChooser = new JColorChooser();
	Color backgroundColor = new Color(0,0,0);
	Color foregroundColor = new Color(255,255,255);
		
	public static void main(String[] args)
	{
		Frame frame = new Project05();	
		frame.setResizable(true);
		frame.setSize(1000,840);
		frame.setVisible(true);
		
	}
	
	public Project05()
	{
		setTitle("Graphics");
		
		// Create Menu
		   			
		MenuBar mb = new MenuBar();
		setMenuBar(mb);
		
		Menu fileMenu = new Menu("File");
		mb.add(fileMenu);
		
		MenuItem miAbout = new MenuItem("About");
		miAbout.addActionListener(this);
		fileMenu.add(miAbout);
		
		MenuItem miColor = new MenuItem("Color");
		miColor.addActionListener(this);
		fileMenu.add(miColor);
		
		MenuItem miExit = new MenuItem("Exit");
		miExit.addActionListener(this);
		fileMenu.add(miExit);
		// 2D Shapes menu
		
		Menu twoDMenu = new Menu("2D Shapes");
		mb.add(twoDMenu);
		
		MenuItem miTriangle = new MenuItem("Triangle");
		miTriangle.addActionListener(this);
		twoDMenu.add(miTriangle);
		
		MenuItem miRectangle = new MenuItem("Rectangle");
		miRectangle.addActionListener(this);
		twoDMenu.add(miRectangle);
		
		MenuItem miDiamond = new MenuItem("Diamond");
		miDiamond.addActionListener(this);
		twoDMenu.add(miDiamond);
		
		MenuItem miRegularPolygon = new MenuItem("Regular Polygon");
		miRegularPolygon.addActionListener(this);
		twoDMenu.add(miRegularPolygon);
		
				
		
		
		
		
		
		// 3D Shapes Menu
		
		Menu threeDMenu = new Menu("3D Shapes");
		mb.add(threeDMenu);
		
		MenuItem miCube = new MenuItem("Cube");
		miCube.addActionListener(this);
		threeDMenu.add(miCube);
		
		MenuItem miSphere = new MenuItem("Sphere");
		miSphere.addActionListener(this);
		threeDMenu.add(miSphere);

		
		MenuItem miCone = new MenuItem("Cone");
		miCone.addActionListener(this);
		threeDMenu.add(miCone);
		
		MenuItem miCylinder = new MenuItem("Cylinder");
		miCylinder.addActionListener(this);
		threeDMenu.add(miCylinder);
		
		
		// End program when window is closed
		
		WindowListener l = new WindowAdapter()
		{
						
			// window closed - exit program						
						public void windowClosing(WindowEvent ev)
						{
							System.exit(0);
						}
						// menu option selected - go to redraw and display method
						public void listener(WindowEvent ev)
						{
							repaint();
						}
						// window resized or refocused - redraw
						public void windowStateChanged(WindowEvent ev)
						{
							repaint();
						}
		
		};
		
		ComponentListener k = new ComponentAdapter()
		{
			public void componentResized(ComponentEvent e) 
			{
        		repaint();           
    		}
		};
		
		// register listeners
			
		this.addWindowListener(l);
		this.addComponentListener(k);

	}
	
//******************************************************************************
//  called by windows manager whenever the application window performs an action
//  (select a menu item, close, resize, ....
//******************************************************************************

public void actionPerformed (ActionEvent ev)
	{
	// figure out which command was issued
	
	command = ev.getActionCommand();
	
	// take action accordingly
	switch (command)
	{
	case "About":
	{
		repaint();
		break;
	}
	case "Exit":
	{
		System.exit(0);
	}
	case "Color":
	{
		backgroundColor = JColorChooser.showDialog(
									                     null,
									                     "Choose Background Color",
									                     colorChooser.getBackground());

		foregroundColor = JColorChooser.showDialog(
									                     null,
									                     "Choose Drawing Color",
									                     colorChooser.getBackground());
		repaint();
		break;
	}
	case "Rectangle":
	{
		r= new Rectangle();
		r.getAttributes();
		repaint();
		break;
	}
	case "Triangle":
	{
		t= new Triangle();
		t.getAttributes();
		repaint();
		break;
	}
	case "Diamond":
	{
		d= new Diamond();
		d.getAttributes();
		repaint();
		break;
	}
	case "Regular Polygon":
	{
		p= new RegularPolygon();
		p.getAttributes();
		repaint();
		break;
	}
	case  "Cube":
	{
		c= new Cube();
		c.getAttributes();
		repaint();
		break;
	}
	case "Cone":
	{
		cn= new Cone ();
		cn.getAttributes();
		repaint();
		break;
	}
	case "Cylinder":
	{
		cy= new Cylinder ();
		cy.getAttributes ();
		repaint();
		break;
	}
	case "Sphere":
		s= new Sphere ();
		s.getAttributes();
		repaint();
		break;
	}
}
//********************************************************
// called by repaint() to redraw the screen
//********************************************************
		
public void paint(Graphics g)
{
	
	// Check Command issued, take action accordingly
	switch(command)
	{
	case "About":
	{
		g.drawString(" Geometric Shapes",400, 100);
		g.drawLine (350,120, 550,120);
		g.drawString(" This program supports the entry of values of primary attributes and calculation of secondary " , 200, 140);
		g.drawString(" attributes (sides, angels, perimeter, area, surface, volume of the following shapes: " , 200, 160);
		
		g.drawString(" 1.      Triangle", 400, 200);
		g.drawString(" 2.      Rectangle", 400, 220);
		g.drawString(" 3.      Diamond"  , 400, 240);
		g.drawString(" 4.      Regular Polygon", 400, 260);
		g.drawString(" 5.      Cube", 400, 280);
		g.drawString(" 6.      Sphere", 400, 300);
		g.drawString(" 7.      Cone", 400, 320);
		g.drawString(" 8.      Cylinder", 400, 340);
		
		
		
		
		 
		
		break;
	}
	case "Color":
	{
		this.setBackground(backgroundColor);
		this.setForeground(foregroundColor);
		break;	
	}
	case "Rectangle":
	{	
		int x = r.getXTopLeft();
		int y = r.getYTopLeft();
		int w = r.getWidth();
		int h = r.getHeight();
		int a = r.getArea();
		int p = r.getPerimeter();
		g.drawString("Rectangle Properties", 100, 100);
		g.drawLine(70,120,240,120);
		g.drawString("TopLeft Corner", 80,140);
		g.drawString("=("+x+","+y+")", 170, 140);
		g.drawString("Width", 80,160);
		g.drawString("= "+w, 170, 160);
		g.drawString("Height", 80,180);
		g.drawString("= "+h, 170, 180);
		g.drawString("Perimeter", 80,200);
		g.drawString("="+p, 170, 200);
		g.drawString("Area", 80,220);
		g.drawString("= "+a, 170, 220);
		
		// draw the boarder of rectangle
		
		g.drawRect(65, 90, 180, 150);
		
		// draw the shape
		
		g.drawRect(x, y, w, h);
		
		// draw the labels
		g.drawString("("+x+","+y+")", x-20, y-15);
		g.drawString(" "+w, x+w/2, y-15);
		g.drawString(" "+h, x-35, y+h/2);
		break;
	}
	case "Triangle":
	{
		int x  = t.getX1();
		int y  = t.getY1();
		int xtwo = t.getX2();
		int ytwo = t.getY2();
		int xthree = t.getX3();
		int ythree = t.getY3();
	    double p = t.getPerimeter();
	    double a = t.getArea();
	    g.drawString("Triangle Properties",115,115);
		g.drawLine(70,120,240,120);
		g.drawString("First Point", 80,140);
		g.drawString("=("+x+","+y+")", 170, 140);
		g.drawString("Second Point", 80,160);
		g.drawString("=("+xtwo+","+ytwo+")", 170, 160);
		g.drawString("Third Point", 80,180);
		g.drawString("=("+xthree+","+ythree+")", 170, 180);
		g.drawString("Perimeter", 80,200);
		g.drawString("="+p, 170, 200);
		g.drawString("Area", 80,220);
		g.drawString("= "+a, 170, 220);
		
		// draw the boarder of rectangle
		
		g.drawRect(65, 90, 180, 150);
		
		// draw the shape
		
		g.drawLine(x, y, xtwo, ytwo);
		g.drawLine(xtwo, ytwo, xthree, ythree);
		g.drawLine(xthree, ythree, x, y);
		
		g.drawString("("+x+","+y+")", x-5, y-15);
		g.drawString("("+xtwo+","+ytwo+")", xtwo, ytwo+10);
		g.drawString("("+xthree+","+ythree+")", xthree, ythree+10);
	
		
		break;
		
		
	}
	case "Diamond":
	{
		int x  = d.getXcenter();
		int y  = d.getYcenter();
		int w = d.getWidth();
		int h = d.getHeight();
	    double p = d.getPerimeter();
	    double a = d.getArea();
	    g.drawString("Diamond",115,115);
		g.drawLine(70,120,240,120);
		g.drawString("Center Point", 80,140);
		g.drawString("=("+x+","+y+")", 170, 140);
		g.drawString("Width", 80,160);
		g.drawString("= "+w, 170, 160);
		g.drawString("Height", 80,180);
		g.drawString("= "+h, 170, 180);
		g.drawString("Perimeter", 80,200);
		g.drawString("="+p, 170, 200);
		g.drawString("Area", 80,220);
		g.drawString("= "+a, 170, 220);
		
		// draw the boarder of rectangle
		
		g.drawRect(65, 90, 180, 150);
		
		// draw shape 
		g.drawLine(x-w/2, y, x+w/2, y);
		g.drawLine(x, y-h/2, x, y+h/2);
		g.drawLine(x, y-h/2, x+w/2, y);
		g.drawLine(x, y-h/2, x-w/2, y);
		g.drawLine(x, y+h/2, x+w/2, y);
		g.drawLine(x, y+h/2, x-w/2, y);
		
		// draw labels
	
		g.drawString("("+x+","+y+")", x, y);
		g.drawString(Integer.toString(h), x-30, y-h/4);
		g.drawString(Integer.toString(w), x-w/4, y+10);
		


		
		
		
		break;
	}
	case "Regular Polygon":
	{
		int x  = p.getXcenter();
		int y  = p.getYcenter();
		int s = p.getNSides();
		int r = p.getRCircle();
		double l = p.getSideLength();
	    double a = p.getArea();
	    double sp = p.getPerimeter();
	    g.drawString("Regular Polygon",100,100);
		g.drawLine(70,120,240,120);
		g.drawString("Center Point", 80,140);
		g.drawString("=("+x+","+y+")", 170, 140);
		g.drawString("Radius", 80,160);
		g.drawString("= "+r, 170, 160);
		g.drawString("nSides", 80,180);
		g.drawString("= "+s, 170, 180);
		g.drawLine(70,200,240,200);
		g.drawString("Vertices",110,220);
		g.drawLine(70,240,240,240);
		
		
		
		
		int [] xPoints = new int[s];
		int [] yPoints = new int[s];
		double angle = 2*Math.PI/s;
		
		for (int i=0; i < s; i++) {
			xPoints[i]= (int) (x+(r* Math.cos(i*angle)));
			yPoints[i]=(int) (y+(r* Math.sin(i*angle)));
			
			
		}
			g.drawPolygon(xPoints,yPoints,s);
			
	    int startY= 260;
	    
	    for (int i=0; i<s;i++) {
	    	g.drawString("Point"+(i+1)+"    =("+ xPoints[i]+","+yPoints[i]+")",85, startY);
	    	
	    	startY+=20;
	    	
	    }
	    
	    
	    
	    // center line 
	    g.drawLine(x, y, x+r, y);
	   
	  
	    g.drawLine(70,startY+20,240,startY+20);
	    g.drawString("Side", 85,startY+40);
	    g.drawString(" ="+l, 170, startY+40);
	    g.drawString("Perimeter", 85,startY+60);
		g.drawString(" ="+sp, 170, startY+60);
		g.drawString("Area", 85,startY+80);
		g.drawString(" ="+a, 170, startY+80);
	    g.drawRect(65, 70 ,190, startY+40);
	    
	    // draw coordinate lines
	    g.drawString("("+x+","+y+")", x, y+10);
	    
	    //Side length
	    g.drawString(" "+l, x+(r*2/2)-5, y-(r*2/4));
	    
	    // Radius
	   
	   g.drawString(" "+r, x+r/2, y-(r/4));
			
	 
		
		
		break;
	}
	case "Cube":
	{
		int x  = c.getXTopLeftCorner();
		int y  = c.getYTopLeftCroner();
		int w  = c.getWidth();
		int h  = c.getHeight();
		int d  = c.getDepth();
		int s =  c.getSurfaceArea(); 
		int p =  c.getVolume();
		
		g.drawString("Cube Properties",115,115);
		g.drawLine(70,120,240,120);
		g.drawString("TopLeft Corner", 80,140);
		g.drawString(" =("+x+","+y+")", 170, 140);
		g.drawString("Width", 80,160);
		g.drawString(" = "+w, 170, 160);
		g.drawString("Height", 80,180);
		g.drawString(" = "+h, 170, 180);
		g.drawString("Depth", 80,200);
		g.drawString(" ="+d, 170, 200);
		g.drawString("Surface Area", 80,220);
		g.drawString(" = "+s, 170, 220);
		g.drawString("Volume", 80,240);
		g.drawString(" = "+p, 170, 240);
		
		g.drawRect(72, 90, 190, 170);
		// draw the shape
		g.drawRect(x, y, w, h);
		//drawing the connecting lines 
				g.drawLine(x, y, x+30, y-30);
				g.drawLine(x+w, y, x+w+30, y-30);
				
				g.drawLine(x+w, y+h, x+w+30, y+h-30);
				g.drawLine(x+30, y-30, x+w+30, y-30);
				g.drawLine(x+w+30, y+h-30, x+w+30, y-30);
				
				//coordinates
				
				g.drawString("("+x,x,y-5);
		        g.drawString(","+y+")",x+30,y-5);
		        g.drawString(""+w,x+w/2,y);
		        g.drawString(""+h,x-30,y+h/2);
		        g.drawString(""+d,(x+w)+20,y-20);
		
		
		
		break;
		
	}
	case "Sphere":
	{
		int x = s.getXcenter();
		int y = s.getYcenter();
		int r = s.getRadius();
     double a = s.getSurfaceArea();
     double v = s.getVolume();
		
		g.drawString("Sphere Properties",115,115);
		g.drawLine(70,130,270,130);
		g.drawString("Center", 80,150);
		g.drawString("=("+x+","+y+")", 170, 150);
		g.drawString("Radius", 80,170);
		g.drawString("= "+r, 170, 170);
		g.drawString("Surface Area", 80,190);
		g.drawString("= "+a, 170, 190);
		g.drawString("Volume", 80,210);
		g.drawString("="+v, 170, 210);
		
		g.drawRect(70, 90, 205, 190);
		
		g.drawOval(x-r,y-r/4 , 2*r, r/2);
		g.drawOval(x-r, y-r, 2*r, 2*r);
		//draw the radius line 
		g.drawLine(x-r, y, x, y);
		
		// draw coordinate points
		g.drawString("("+x+","+y+")", x-20, y+15);
		g.drawString(" "+r, x-(r/3), y-15);
		
		
		
		break;
	}
	case "Cylinder":
	{
		int x = cy.getXCenterofBase();
		int y = cy.getYCenterofBase();
		int r = cy.getRBase();
		int h = cy.getHeight();
	double a  = cy.getSurfaceArea();
	double v  =  cy.getVolume();
	
	g.drawString("Cylinder Properties", 100, 110);
	g.drawLine(72,120,260,120);
	g.drawString("Base Center", 80, 140);
	g.drawString(" =("+x+","+y+")", 170, 140);
	g.drawString("Radius", 80, 160);
	g.drawString("  ="+r, 170, 160);
	g.drawString("Height", 80, 180);
	g.drawString("  ="+h, 170, 180);
	g.drawString("Surface Area", 80, 200);
	g.drawString("  ="+a, 170, 200);
	g.drawString("Volume",80,220);
	g.drawString("  ="+v,170,220);
	//This is to draw the rectangle
	g.drawRect(72, 90, 190, 150);
	
	// drawing the ovals of the cylinder
	g.drawOval(x-r, y-(r/4), r*2, r/2);
	g.drawOval(x-r, (y-(r/4))+h, r*2, r/2);
	//connecting lines
	g.drawLine(x-r, (y+(r*2)), (x-r), y);
	g.drawLine(x+r, y+r*2, x+r, y);
	g.drawLine(x,y,x,y+h);
	g.drawLine(x+r,y+h,x,y+h);
	//coordinate points
	g.drawString(""+h, x, y+h/2);
	g.drawString("("+x, x-10, y+h);
	g.drawString(","+y+")", x+20, y+h);
	g.drawString(""+r, (x+r)-25, (y+h)-10);

	
	break;
	

	}
	case "Cone":
	{
		int x = cn.getXCenterofBase();
		int y = cn.getYCenterofBase();
		int r = cn.getRBase();
		int h = cn.getHeight();
    double a  = cn.getSurfaceArea();
     double v = cn.getVolume();
		
		g.drawString("Cone Properties",115,115);
		g.drawLine(72,130,260,130);
		g.drawString("Base Center", 80,150);
		g.drawString("=("+x+","+y+")", 170, 150);
		g.drawString("Radius", 80,170);
		g.drawString("= "+r, 170, 170);
		g.drawString("Height", 80,190);
		g.drawString("= "+h, 170, 190);
		g.drawString("Surface Area", 80,210);
		g.drawString("= "+a, 170, 210);
		g.drawString("Volume", 80,230);
		g.drawString("="+v, 170, 230);
		
		//This is too draw the rectangle
		g.drawRect(72, 90, 190, 150);
		// drawing the cone base
		g.drawOval(x-r, y-(r/8), r*2, r/4);
		// drawing the connecting lines for the cone
		g.drawLine(x, y, x, y-h);
		g.drawLine(x+r, y, x, y-h);
		g.drawLine(x-r, y, x, y-h);
		g.drawLine(x, y, x+r, y);
		
		// drawing the coordinate
		g.drawString("("+x+","+y+")", x-20, y-15);
		//drawing the height label
		g.drawString(" "+h, x, y-(h/2));
		
		// drawing radius label
		g.drawString(" "+r, x+r/2, y-10);
	}
	
	}


}
		
}
