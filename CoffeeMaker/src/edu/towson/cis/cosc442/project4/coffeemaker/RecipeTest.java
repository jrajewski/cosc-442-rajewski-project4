/**
 * 
 */

package edu.towson.cis.cosc442.project4.coffeemaker;

import junit.framework.TestCase;

public class RecipeTest extends TestCase{
	Recipe r1 = new Recipe();
	Recipe r2 = new Recipe();
	
	//tests equals method for 2 different recipes
	public void testEquals(){
		r1 = new Recipe();
		r1.setName("Coffee");
		r1.setPrice(50);
		r1.setAmtCoffee(6);
		r1.setAmtMilk(1);
		r1.setAmtSugar(1);
		r1.setAmtChocolate(0);
		
		r2 = new Recipe();
		r2.setName("Coffee2");
		r2.setPrice(50);
		r2.setAmtCoffee(1);
		r2.setAmtMilk(1);
		r2.setAmtSugar(1);
		r2.setAmtChocolate(0);
		
		//r1.equals(r2);
		assertFalse(r1.equals(r2));
	}
	
	//tests condition for if the price is set to be less than 0
	public void testSetPrice(){
		r1.setPrice(-1);
		assertEquals(r1.getPrice(), 0);
	}
	
	//cover toString method
	public void testToString(){
		r1.toString();
	}
	
	//tests condition to set coffee to be less than 0
	//should just set it to 0
	public void testSetAmtCoffee(){
		r1.setAmtCoffee(-1);
		assertEquals(r1.getAmtCoffee(), 0);
	}
	
	public void testSetAmtChocolate(){
		r1.setAmtChocolate(-1);
		assertEquals(r1.getAmtChocolate(), 0);
	}
	
	public void testSetAmtMilk(){
		r1.setAmtMilk(-1);
		assertEquals(r1.getAmtMilk(), 0);
	}
	
	public void testSetAmtSugar(){
		r1.setAmtSugar(-1);
		assertEquals(r1.getAmtSugar(), 0);
	}
}