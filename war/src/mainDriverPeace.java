
public class mainDriverPeace {

	public static void main(String[] args) {
		 PeaceDeck myDeck=new PeaceDeck(), yourDeck= new PeaceDeck();
		    PeaceCard myCard,yourCard;
				int iWin=0, yWin=0;

				for(int i=0;i<52;i++){
					System.out.println(i+1 +":");
					myCard = myDeck.draw();
					System.out.println("my card: "+myCard.toString());
					yourCard = yourDeck.draw();
					System.out.println("your card: "+yourCard.toString());
					
					if(myCard.winner(yourCard)){
						System.out.println("I win!");
						iWin++;
					}
					else {
						System.out.println("U win!\n");
						yWin++;
					}			
				}
				System.out.println("my wins: "+ iWin);
				System.out.println("your wins: "+ yWin);
				if(iWin>yWin)
					System.out.println("I win the game!");
				else if(iWin<yWin)
					System.out.println("You win the game!");
				else
					System.out.println("Tie!");

	}
}

