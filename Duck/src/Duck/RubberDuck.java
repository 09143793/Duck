/***********************************************************************
 * Module:  RubberDuck.java
 * Author:  Administrator
 * Purpose: Defines the Class RubberDuck
 ***********************************************************************/

package Duck;

import java.util.*;

/** @pdOid 8e486a28-67b4-473f-b475-4c72d3738314 */
public class RubberDuck extends Duck {
   /** @pdOid 84a74458-5fd8-4e6e-9f92-53f0ead6b6c1 */
   public void dispaly() {
      // TODO: implement
   }
   public RubberDuck() {
		QuackBehavior = new Squeak();
		FlyBehavior	= new FlyNoWay();
		FlyBehavior = new FlyWithRocket();
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("它不会游泳。");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("这是个塑料鸭。");
	}


}