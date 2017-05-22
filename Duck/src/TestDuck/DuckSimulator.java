package TestDuck;

import java.awt.Font;
import org.junit.Test;
import Duck.Duck;
import Duck.MallardDuck;
import Duck.RedheadDuck;
import Duck.RubberDuck;

public class DuckSimulator {
	
	@Test
	public void MallardDuck() {
	      Duck MallardDuck = new MallardDuck();
	      System.out.println("MallardDuck");
	      MallardDuck.display();
	      MallardDuck.swim();
	      MallardDuck.performFly();		
	      MallardDuck.performQuack();
	    
	   }
	
	@Test
	public void RedHeadDuck() {
	      Duck RedHeadDuck = new RedheadDuck();
	      System.out.println("RedHeadDuck");
	      RedHeadDuck.display();
	      RedHeadDuck.swim();
	      RedHeadDuck.performFly();		      
	      RedHeadDuck.performQuack();
	   }
	
	@Test
	public void RubberDuck() {
	      Duck RubberDuck = new RubberDuck();
	      System.out.println("RubberDuck:");
	      RubberDuck.display();
	      RubberDuck.swim();
	      RubberDuck.performFly();	
	      RubberDuck.performQuack();
	     
	   }
	
	

}
