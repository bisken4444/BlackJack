package pkgGame;

import java.util.ArrayList;

import pkgEnum.eExceptionType;
import pkgExceptions.DeckException;

public class Hand {

	private ArrayList<Card> handCards = new ArrayList<Card>();
	private Deck currentDeck;
	
	public Hand(Deck d)
	{
		currentDeck = d;
		Hit(currentDeck);
		Hit(currentDeck);
	}
	
	public void Hit(Deck d)
	{
		try {
			currentDeck = d;
			handCards.add(currentDeck.Draw());
		} 
		catch (DeckException e) {
			if (e.geteExceptionType() == eExceptionType.EmptyDeck)
			{
				currentDeck = new Deck();
				Hit(currentDeck);
			}
		}
	}
	
	public int[] ScoreHand()
	{
		HandScore HandScore = new HandScore(handCards);
		return HandScore.getScore();
	}

	public Deck getCurrentDeck() {
		return currentDeck;
	}
	
	public ArrayList<Card> getHand()
	{
		return handCards;
	}
	
}
