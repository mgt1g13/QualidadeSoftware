

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.fbergeron.card.ClassicCard;
import com.fbergeron.card.Stack;
import com.fbergeron.card.Suit;
import com.fbergeron.card.Value;
import com.fbergeron.solitaire.*;


public class SequentialStackTest {

	private SequentialStack pilhaSequencial;
	
	
	/**
	 * Instancia uma pilha sequencial para os testes
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		pilhaSequencial = new SequentialStack();
		pilhaSequencial.push(new ClassicCard(Value.V_ACE, Suit.HEART));
		pilhaSequencial.push(new ClassicCard(Value.V_2, Suit.HEART));
		pilhaSequencial.push(new ClassicCard(Value.V_3, Suit.HEART));
	
		
	}

	/**
	 * Verifica se a adição de uma carta na piha sequencial pode ser realizada
	 */
	@Test
	public void testIsValid() {
		assertTrue(pilhaSequencial.isValid(new ClassicCard(Value.V_4, Suit.HEART)));
		assertFalse(pilhaSequencial.isValid(new ClassicCard(Value.V_4, Suit.SPADE)));
		assertFalse(pilhaSequencial.isValid(new ClassicCard(Value.V_7, Suit.SPADE)));
		assertFalse(pilhaSequencial.isValid(new ClassicCard(Value.V_6, Suit.HEART)));
		
	}
	
	/**
	 * Verifica se a adição de uma pilha sobre a pilha sequencial pode ser realizada
	 */
	@Test
	public void testIsValidStack() {
		Stack s = new Stack();
		s.push(new ClassicCard(Value.V_4, Suit.HEART));
		
		assertTrue(pilhaSequencial.isValid(s));
		
		//Não funciona com uma pilha com duas ou mais cartas
		s.push(new ClassicCard(Value.V_5, Suit.HEART));
		assertFalse(pilhaSequencial.isValid(s));
		
		s = new Stack();
		s.push(new ClassicCard(Value.V_4, Suit.SPADE));
		
		assertFalse(pilhaSequencial.isValid(s));
		
		
	}

	@Test
	public void testPush(){
		int prevCount = pilhaSequencial.cardCount();
		pilhaSequencial.push(new ClassicCard(Value.V_4, Suit.HEART));
		assertEquals(prevCount + 1, pilhaSequencial.cardCount());
		
		//Não deve deixar dar o push!! Nao seria uma pilha sequencial mais
		pilhaSequencial.push(new ClassicCard(Value.V_5, Suit.HEART));
		assertEquals(prevCount + 1, pilhaSequencial.cardCount());
		
	
	}

}
