
public class Card {
	
 int cardValue,suitValue;  //cardValue:1~13 //suitNum 1:club 2:diamond 3:heart 4:spade. 
          
Card(){//constructor1
	 this.cardValue=0;
	 this.suitValue=0;
 }
                               
Card(int cardValue, int suitValue){//constructor2
	 this.cardValue=cardValue;
	 this.suitValue=suitValue;
 }

public String toString(){
	String suit=new String(""); //suit: club,diamond,heart,spade.

	switch(suitValue){
	case 1:
		suit="Club";
		break;
	case 2:
		suit="Diamond";
		break;
	case 3:
		suit="Heart";
		break;
	case 4:
		suit="Spade";
		break;
	default:
		suit="wrong";
		break;
			
	}
	//System.out.println(cardNum + " of " + suit +"\n");
	return cardValue+" of "+suit;//return a string. (eg.,"2 of Heart"
}

public boolean winner(Card b){
	boolean re=true;
	/*
	if(this.cardValue > b.cardValue)
		return true;
	else if(this.cardValue < b.cardValue)
		return false;
	else if(this.suitNum > b.suitNum)
		return true;
	else if(this.suitNum < b.suitNum)
		return false;
	*/
	if(this.cardValue < b.cardValue)
		re=false;
	else if((this.cardValue == b.cardValue)&&(this.suitValue < b.suitValue))
		re=false;
	return re;
}

}