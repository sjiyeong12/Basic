package object;


public class Exercise9_1 {
  public static void main(String[] args) {
    CardDeck deck = new CardDeck();
    deck.printDeck();
    deck.shuffle();
  }
}

class SutdaCard {
  private int num;
  private boolean kwang;

  public SutdaCard(int num, boolean kwang) {
    this.num = num;
    this.kwang = kwang;
  }

  public SutdaCard() {
    this(1, false);
  }

  public int getNum() {
    return this.num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public boolean isKwang() {
    return this.kwang;
  }

  public void setKwang(boolean kwang) { 
    this.kwang = kwang;
  }

  @Override
  public String toString() {
    return num + (kwang ? "(k)" : "");
  }
}

@Override
public boolean equals(Object )

class CardDeck {
  // 1.카드 20장 클래스 //2. 카드 20장 초기화 //3.카드섞기
  SutdaCard cards[] = new SutdaCard[20];

  public CardDeck() {
    for (int i = 0; i < cards.length; i++) { 

    //   boolean tmp = (i<10&&(i==0||i==2||i==7))?true:false;
    //   cards[i] = new SutdaCard(i%10+1,tmp);

    // boolean tmp = (i<10&&(i.equals(0)||i.equals(2)||i.equals(0))?true:false;
    cards[i] = new SutdaCard(i%10+1,SutdaCard.num.equals(0) );
    }
  }

  void printDeck(){
    System.out.print("[");
    for (int i = 0; i < cards.length; i++) {
      if(i!=0) System.out.print(",");
      System.out.print(cards[i]);
    }
    System.out.println("]");
  }

  void shuffle(){
    for (int i = 0; i < cards.length; i++) {
      int rand = (int) (Math.random() * cards.length);
      SutdaCard tmp = cards[i];
      cards[i] = cards[rand];
      cards[rand] = tmp;
    }
    printDeck();
  }

}

interface Grawable{}
interface Groundable extends Grawable{}