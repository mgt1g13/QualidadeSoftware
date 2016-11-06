import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Test;

import com.fbergeron.card.ClassicDeck;


public class ClassicDeckTest {

	@Test
	public void testBuildCards() {
		ClassicDeck deck = new ClassicDeck(null);
		assertEquals(52, deck.cardCount());
	}

	@Test
	public void testShuffle() {
		ClassicDeck deck = new ClassicDeck(null);
		Vector cards = (Vector) deck.getCards().clone();
		deck.shuffle(3);
		Vector shuffledCards = deck.getCards();	
		assertNotEquals(cards, shuffledCards);
	}

	@Test
	public void testFirstFaceUp() {
		ClassicDeck deck = new ClassicDeck(null);
		
	}

}
