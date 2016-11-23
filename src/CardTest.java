

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.fbergeron.card.Card;
import com.fbergeron.card.ClassicCard;
import com.fbergeron.card.Suit;
import com.fbergeron.card.Value;

public class CardTest {

	public ArrayList<Card> cartas;
	
	
	@Before
	public void instanciaCartas(){
		cartas = new ArrayList<Card>();
		
		cartas.add(new ClassicCard(Value.V_ACE, Suit.SPADE));
	}
	

	@Test
	public void testCompare(){
		assertEquals(new ClassicCard(Value.V_ACE, Suit.SPADE), cartas.get(0));
		assertNotEquals(new ClassicCard(Value.V_KING, Suit.SPADE), cartas.get(0));
	}
	
	@Test
	public void testTurnFaceDown(){
		Card carta = new ClassicCard(Value.V_ACE, Suit.SPADE);
		if(carta.isFaceDown()){
			carta.flip();
		}
		
		carta.turnFaceDown();
		assertTrue(carta.isFaceDown());
	}
	
	@Test
	public void testFlip(){
		Card carta = new ClassicCard(Value.V_ACE, Suit.SPADE);
		boolean estadoInicial = carta.isFaceDown();
		carta.flip();
		assertNotEquals(estadoInicial, carta.isFaceDown());
		carta.flip();
		assertEquals(estadoInicial, carta.isFaceDown());
	}

}
