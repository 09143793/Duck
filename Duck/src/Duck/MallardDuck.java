/***********************************************************************
 * Module:  MallardDuck.java
 * Author:  Administrator
 * Purpose: Defines the Class MallardDuck
 ***********************************************************************/
package Duck;

import java.util.*;

/** @pdOid fe135a9f-df34-4415-8139-0dc0f10c49a8 */
public class MallardDuck extends Duck {
   /** @pdOid 7561c42b-e0bb-48e4-a9c5-69d201a7ee05 */
	public void dispaly() {
	      // TODO: implement
	   }
	   public MallardDuck() {
			QuackBehavior = new Quack();
			FlyBehavior = new FlyWithWings();
		}

		@Override
		public void swim() {
			// TODO Auto-generated method stub
			System.out.println("它会游泳。");
		}

		@Override
		public void display() {
			// TODO Auto-generated method stub
			System.out.println("这是个野鸭。");
		}
   }