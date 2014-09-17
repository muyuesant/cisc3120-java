import java.util.Random;
public class Deck {
Card[][] deckOfCard= new Card[14][5];//1~13,1~4
public static int loopTime = 52;

Deck(){
for(int i=1;i<14;i++)//initial a deck of card
	for(int j=1;j<5;j++){
		deckOfCard[i][j]= new Card();
		deckOfCard[i][j].cardValue=i;
		deckOfCard[i][j].suitValue=j;
	}

}

public Card draw(){
	 Card cardDraw= new Card();
	 
	 int valueIndex = new Random().nextInt(13)+1;//draw a random card.
	 int suitIndex = new Random().nextInt(4)+1;
	 
	 while( deckOfCard[valueIndex][suitIndex].suitValue == 0){ //to check if this card is in the deck or not
		  valueIndex = new Random().nextInt(13)+1;//draw another card.
		  suitIndex = new Random().nextInt(4)+1;
	 }
	 cardDraw.cardValue = deckOfCard[valueIndex][suitIndex].cardValue;//assign the value of the drew card into the Card instance
	 cardDraw.suitValue = deckOfCard[valueIndex][suitIndex].suitValue;
	
	 deckOfCard[valueIndex][suitIndex].cardValue=0;//mark the drew card's value and suit with zero in the deck, 
	 deckOfCard[valueIndex][suitIndex].suitValue=0;//make sure this card won't show up anymore
	 return cardDraw;	 
}

public void showCard(){//show the whole deck of the card 
	System.out.println("******************");
	for(int i=1;i<14;i++){
		for(int j=1;j<5;j++){
			System.out.println(deckOfCard[i][j].toString());
		}	
		System.out.println("\n");
	}
}

}
