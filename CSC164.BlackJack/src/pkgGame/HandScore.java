package pkgGame;

import java.util.ArrayList;

import pkgEnum.eCardRank;

public class HandScore {
	
	private ArrayList<Card> handCards = new ArrayList<Card>();

	public HandScore(ArrayList<Card> h) {
		handCards = h;
	}
	
	public int[] getScore() {
		int[] scoreArray = new int[2];
		for (Card c: handCards) {
			if (c.geteCardRank() == eCardRank.ACE) {
				scoreArray[0] = scoreArray[0] + 11;
				scoreArray[1] = scoreArray[1] +1;
			} else {
				scoreArray[0] = scoreArray[0] + c.geteCardRank().getiCardRank();
				scoreArray[1] = scoreArray[1] + c.geteCardRank().getiCardRank();
			}
		}
		return scoreArray;
	}
}
