/**
 * 
 */

package edu.towson.cis.cosc442.project4.coffeemaker;

import junit.framework.TestCase;

/**
 *
 */
public class InventoryTest extends TestCase {
	private Recipe r1 = new Recipe();
	
	
	private void SetUp(){
		
	}
	
	private Inventory i = new Inventory();
	
	public void testToString(){
		i.toString();
	}
	
	public void testEnoughIngredients(){
		r1.setName("Coffee");
		r1.setPrice(14);
		r1.setAmtCoffee(14);
		r1.setAmtMilk(14);
		r1.setAmtSugar(14);
		r1.setAmtChocolate(14);
		assertTrue(i.enoughIngredients(r1));
	}
	
	public void testEnoughIngredients2(){
		r1.setName("Coffee");
		r1.setPrice(16);
		r1.setAmtCoffee(16);
		r1.setAmtMilk(16);
		r1.setAmtSugar(16);
		r1.setAmtChocolate(16);
		assertFalse(i.enoughIngredients(r1));
	}
	
	public void testSetChocolate(){
		i.setChocolate(20);
		assertTrue(i.getChocolate() == 20);
	}
	
	public void testSetChocolate2(){
		i.setChocolate(-1);
		assertTrue(i.getChocolate() == 0);
	}
	
	public void testSetCoffee(){
		i.setCoffee(10);
		assertTrue(i.getCoffee() == 10);
	}
	
	public void testSetCoffee2(){
		i.setCoffee(-1);
		assertTrue(i.getCoffee() == 0);
	}
	
	public void testSetSugar(){
		i.setSugar(5);
		assertTrue(i.getSugar() == 5);
	}
	
	public void testSetSugar2(){
		i.setSugar(-1);
		assertTrue(i.getSugar() == 0);
	}
	
	public void testSetMilk(){
		i.setMilk(25);
		assertTrue(i.getMilk() == 25);
	}
	
	public void testSetMilk2(){
		i.setMilk(-1);
		assertTrue(i.getMilk() == 0);
	}
}