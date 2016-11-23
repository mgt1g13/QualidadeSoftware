/**
 * 
 */


import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Before;
import org.junit.Test;

import com.fbergeron.card.ClassicCard;
import com.fbergeron.card.Stack;
import com.fbergeron.card.Suit;
import com.fbergeron.card.Value;

/**
 * @author matheustrindade
 *
 */
public class StackTest {

	private Stack pilhaDeCartas;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		pilhaDeCartas = new Stack();
	}
	
	
	/**
	 * Test method for {@link com.fbergeron.card.Stack#cardCount()}.
	 */
	@Test
	public void testCardCountBeforePush() {
		assertEquals(0, pilhaDeCartas.cardCount());
	}
	
	/**
	 * Test method for {@link com.fbergeron.card.Stack#cardCount()}.
	 */
	@Test
	public void testPush() {
		//Adiciona todas as cartas do naipe de espadas.
		for(int i = 0 ; i < Value.values.length ; i++){
			pilhaDeCartas.push(new ClassicCard(Value.values[i], Suit.SPADE));
		}	
		assertEquals(pilhaDeCartas.cardCount(),13);
	}

	
	/**
	 * Test method for {@link com.fbergeron.card.Stack#getCards()}.
	 */
	@Test
	public void testGetCards() {
		
		Vector cartas = pilhaDeCartas.getCards();
		
		System.out.println(cartas.size());
		assertEquals(cartas.size(), 0);
		
		//Dependencia com o teste e push
		testPush();
		
		for(int i = 0 ; i < Value.values.length ; i++){
			if(!cartas.contains(new ClassicCard(Value.values[i], Suit.SPADE)))
					fail("Does not contain every added card");
		}
		
		
	}

	/**
	 * Test method for {@link com.fbergeron.card.Stack#top()}.
	 */
	@Test
	public void testTop() {
		//Dependencia com o teste de push
		testPush();
		assertEquals(pilhaDeCartas.top(), new ClassicCard(Value.V_KING, Suit.SPADE));
		
	}

	/**
	 * Test method for {@link com.fbergeron.card.Stack#push(com.fbergeron.card.Stack)}.
	 */
	@Test
	public void testPushStack() {
		testPush();
		Stack stackToBePushed = fullSuitStack(Suit.HEART);
		
		pilhaDeCartas.push(stackToBePushed);
		
		assertEquals(pilhaDeCartas.cardCount(), Value.values.length * 2);
		
		
		for(int i = 0 ; i < Value.values.length ; i++){
			if(!pilhaDeCartas.contains(new ClassicCard(Value.values[i], Suit.HEART)))
				fail("Does not contain one card that was supposed to be there!");
			if(!pilhaDeCartas.contains(new ClassicCard(Value.values[i], Suit.SPADE)))
				fail("Does not contain one card that was supposed to be there!");
		}
		
	}

	/**
	 * Test method for {@link com.fbergeron.card.Stack#pop()}.
	 */
	@Test
	public void testPop() {
		
		testPush();
	
		int cardVal = 12;
		
		while(pilhaDeCartas.cardCount() != 0){
			ClassicCard c = (ClassicCard) pilhaDeCartas.pop();
			assertEquals(c, new ClassicCard(Value.values[cardVal], Suit.SPADE));
			cardVal--;
		}	
	}
	
	
	/**
	 * Test method for {@link com.fbergeron.card.Stack#pop()}.
	 */
	@Test
	public void testPopUpToCard() {
		
		testPush();
	
		int cardVal = 12;
		
		while(pilhaDeCartas.cardCount() != 0){
			ClassicCard c = (ClassicCard) pilhaDeCartas.pop();
			assertEquals(c, new ClassicCard(Value.values[cardVal], Suit.SPADE));
			cardVal--;
		}
		
		
	}
	
	
	
	
	/**
	 * M�todo auxiliar para criar uma pilha com todas as cartas de um dado naipe
	 * @param suit dado naipe
	 * @return Pilha do dado naipe
	 */
	public Stack fullSuitStack(Suit suit){
		Stack s = new Stack();
		for(int i = 0 ; i < Value.values.length ; i++){
			s.push(new ClassicCard(Value.values[i], suit));
		}
		return s;
	}

	

}