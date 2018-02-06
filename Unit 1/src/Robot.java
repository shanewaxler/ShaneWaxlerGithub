//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Tree Frog Robot Glancing Right", 35, 35 );
      head(window);
      //call head method
      head(window);
      upperBody(window);
      lowerBody(window);
      lowerBody(window);
      //call other methods
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.GREEN);

      window.fillOval(300, 100, 200, 100);
      window.setColor(Color.RED);
      window.fillOval(300, 100, 50, 50);
      window.fillOval(400, 100, 50, 50);
      window.setColor(Color.BLACK);
      window.fillRect(320,175,100,10);

		//add more code here
				
   }

   public void upperBody( Graphics window )
   {
	   window.setColor(Color.GREEN);
	   window.fillRect(300, 200, 200, 200);
	   window.setColor(Color.GREEN);
	   window.fillRect(100,200,200,50);
	   window.fillRect(500,200,200,50);
		//add more code here
   }

   public void lowerBody( Graphics window )
   {
	   window.fillRect(300, 400, 50, 200);
	   window.fillRect(450, 400, 50, 200);
		//add more code here

   }
}