
public class PeaceCard extends Card {
	@Override public boolean winner(Card b){
        boolean re=true;
	if(this.cardValue > b.cardValue)
		re=false;
	else if((this.cardValue == b.cardValue)&&(this.suitValue > b.suitValue))
		re=false;
	return re;
    
    }
}
