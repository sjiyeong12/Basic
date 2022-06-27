package object;
import java.util.Arrays;

    class SutdaDeck {
        final int CARD_NUM = 20;
        SutdaCard[] cards = new SutdaCard[CARD_NUM]; //섯다카드[20쟝];
        
        SutdaDeck(){
            //배열 sutdacard를 적절히 초기화하시오
            int j = 1;
            for (int i = 0; i < cards.length; i++) {
                cards[i] = new SutdaCard();
                cards[i].num = j++;
                if(j>10) j=1;
                if(i==0 || i==2 || i==7) cards[i].isKwang = true;
            }
        }

        public SutdaCard pick(int arrnum){
            return cards[arrnum];  
        }

        public SutdaCard pick(){
            return cards[(int)(Math.random() * cards.length)]; 
        }


        void shuffle(){
            SutdaCard CardDeck = new SutdaCard();
            for (int i = 0; i < cards.length; i++) {
              int rand = (int) (Math.random() * cards.length);
              SutdaCard tmp = cards[i];
              cards[i] = cards[rand];
              cards[rand] = tmp;
            }
          }
    } //SutdaDeck

    class SutdaCard{
        int num;
        boolean isKwang;

        SutdaCard() {
            this(1, true);
        }

        SutdaCard(int num, boolean isWwang){
            this.num=num;
            this.isKwang = isKwang;
        }

        //info()대신 object 클래스의 toString()을 오버라이딩했다.
        public String toString() {
                return num + (isKwang?"K":"");
        }
    }

    public class Exercise7_2 {
        public static void main(String[] args) {
            SutdaDeck deck = new SutdaDeck();

            // System.out.println(deck.pick(0));
            // System.out.println(deck.pick());
            deck.shuffle();

            for (int i = 0; i < deck.cards.length; i++) {
                System.out.println(deck.cards[i]+",");
            }
            System.out.println();
            // System.out.println(deck.pick(0));
        }

}