package pkgTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgGame.Deck;
import pkgGame.Hand;

class HandTest {

	@Test
	void test() {
		Deck d = new Deck();
		Deck a = new Deck();
		Hand h = new Hand(d);
		for (int i =0; i<h.getHand().size();i++) {
			System.out.println(h.getHand().get(i));
		}
		System.out.println(h.ScoreHand()[0]);
		System.out.println(h.ScoreHand()[1]);
		System.out.println(h.getCurrentDeck());
		h.Hit(a);
		System.out.println(h.getCurrentDeck());
		for (int i =0; i<h.getHand().size();i++) {
			System.out.println(h.getHand().get(i));
		}
		System.out.println(h.ScoreHand()[0]);
		System.out.println(h.ScoreHand()[1]);
		
	}

}
