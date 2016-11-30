package testes;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.fbergeron.card.ClassicCard;
import com.fbergeron.card.Suit;
import com.fbergeron.card.Value;
import com.fbergeron.solitaire.SolitaireStack;


public class SolitaireStackTest {

	private SolitaireStack pilhaSolitaire;
	
	/**
	 * Instancia uma pilha para os testes
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
	
		pilhaSolitaire = new SolitaireStack();
		pilhaSolitaire.push(new ClassicCard(Value.V_7, Suit.HEART));
		
		pilhaSolitaire.push(new ClassicCard(Value.V_6, Suit.CLUB));
		pilhaSolitaire.push(new ClassicCard(Value.V_5, Suit.DIAMOND));
	
	}

	/**
	 * Testa se a adi��o de uma piha sobre a outra pilha pode ser realizada
	 */
	@Test
	public void testIsValidStack() {
		
		SolitaireStack pilhaSolitaire2 = new SolitaireStack();
		pilhaSolitaire2.push(new ClassicCard(Value.V_4, Suit.HEART));
		pilhaSolitaire2.push(new ClassicCard(Value.V_3, Suit.CLUB));
		pilhaSolitaire2.push(new ClassicCard(Value.V_2, Suit.DIAMOND));

		pilhaSolitaire2.reverse();
		//A pilha deve ser revertida para ser comparada. N�o falava nada em coment�rio
		//Foi descoberto analisando o c�digo
		
		
		assertFalse(pilhaSolitaire.isValid(pilhaSolitaire2));
		
		pilhaSolitaire2 = new SolitaireStack();
		pilhaSolitaire2.push(new ClassicCard(Value.V_4, Suit.CLUB));
		pilhaSolitaire2.push(new ClassicCard(Value.V_3, Suit.HEART));
		pilhaSolitaire2.push(new ClassicCard(Value.V_2, Suit.SPADE));
		pilhaSolitaire2.reverse();

		assertTrue(pilhaSolitaire.isValid(pilhaSolitaire2));
		
	}

	/**
	 * Verifica se a adi��o de uma carta na pilha � v�lida
	 */
	@Test
	public void testIsValidClassicCard() {
		assertTrue(pilhaSolitaire.isValid(new ClassicCard(Value.V_4, Suit.SPADE)));
		assertFalse(pilhaSolitaire.isValid(new ClassicCard(Value.V_4, Suit.DIAMOND)));
		assertFalse(pilhaSolitaire.isValid(new ClassicCard(Value.V_4, Suit.HEART)));
		assertTrue(pilhaSolitaire.isValid(new ClassicCard(Value.V_4, Suit.CLUB)));
		//Cobertura de C�digo
		assertFalse(new SolitaireStack().isValid(new ClassicCard(Value.V_4, Suit.CLUB)));
		assertTrue(new SolitaireStack().isValid(new ClassicCard(Value.V_KING, Suit.CLUB)));
		assertTrue(new SolitaireStack().isValid(new ClassicCard(Value.V_KING, Suit.HEART)));
		assertTrue(new SolitaireStack().isValid(new ClassicCard(Value.V_KING, Suit.DIAMOND)));
		assertTrue(new SolitaireStack().isValid(new ClassicCard(Value.V_KING, Suit.SPADE)));
	}
	
	
	/**
	 * Teste a adi��o de cartas numa pilha solitaire. Falha pois n�o h� restri��o quanto a 
	 * insers��o de cartas fora de ordem
	 */
	@Test
	public void testPush(){
		int prevCount = pilhaSolitaire.cardCount();
		pilhaSolitaire.push(new ClassicCard(Value.V_4, Suit.SPADE));
		assertEquals(prevCount + 1, pilhaSolitaire.cardCount());
		
		//N�o deve deixar dar o push!! Nao seria uma pilha solitaire mais
		pilhaSolitaire.push(new ClassicCard(Value.V_3, Suit.SPADE));
		assertEquals(prevCount + 1, pilhaSolitaire.cardCount());
		
	
	}

}
