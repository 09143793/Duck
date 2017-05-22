/***********************************************************************
 * Module:  RedheadDuck.java
 * Author:  Administrator
 * Purpose: Defines the Class RedheadDuck
 ***********************************************************************/

package Duck;
import java.util.*;

public class RedheadDuck extends Duck {
	public void dispaly() {
	      // TODO: implement
	   }
	public RedheadDuck() {
		QuackBehavior = new MuteQuack();
		FlyBehavior = new FlyWithWings();
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("������Ӿ��");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("���������ǱѼ��");
	}

}