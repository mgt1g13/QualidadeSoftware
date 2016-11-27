

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.fbergeron.card.Card;
import com.fbergeron.card.ClassicCard;
import com.fbergeron.card.Suit;
import com.fbergeron.card.Value;

/**
 * Teste das classes de carta. Para o teste, decidiu-se usar Classic Cards
 * por serem as entidades realmente utilizadas no código
 * @author matheustrindade
 *
 */
public class CardTest {

	public ArrayList<Card> cartas;
	
	
	/**
	 * Instancia um Ás de Espadas para os testes
	 */
	@Before
	public void instanciaCartas(){
		cartas = new ArrayList<Card>();
		
		cartas.add(new ClassicCard(Value.V_ACE, Suit.SPADE));
	}
	

	/**
	 * Teste a função de comparar cartas
	 */
	@Test
	public void testCompare(){
		assertEquals(new ClassicCard(Value.V_ACE, Suit.SPADE), cartas.get(0));
		assertNotEquals(new ClassicCard(Value.V_KING, Suit.SPADE), cartas.get(0));
	}
	
	/**
	 * Testa a função de virar a carta
	 */
	@Test
	public void testTurnFaceDown(){
		Card carta = new ClassicCard(Value.V_ACE, Suit.SPADE);
		if(carta.isFaceDown()){
			carta.flip();
		}
		
		carta.turnFaceDown();
		assertTrue(carta.isFaceDown());
	}
	
	/**
	 * Testa a função flip, que vira a carta, mudando a orientação da sua face
	 */
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
