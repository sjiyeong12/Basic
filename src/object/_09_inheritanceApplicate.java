package object;

public class _09_inheritanceApplicate {
public static void main(String[] args) {
Buyer b = new Buyer();
Tv tv = new Tv();
Audio audio = new Audio();
Computer com = new Computer();
b.buy(tv); //자부관계
// b.buy(tv.price, tv.name);
// b.buy(audio.price, audio.name);
// b.buy(com.price, com.name);
System.out.println(b.money);
}
}

class Buyer {
int money = 300;
int bonusPoint;
String[] list = new String[10];
int count = 0;
// 1) 일반형 타입의 속성으로 처리
// void buy(int price, String name){
// money -= price;
// list[count++] = name;
// }

// 2) 참조형 타입으로 처리
// void buy(Computer c){
//     if(money>=c.price)
//     money -= c.price;
//     list[count++] = c.name;
// }
// void buy(Audio a){
//     if(money>=a.price)
//     money -= a.price;
//     list[count++] = a.name;
// }
// void buy(Tv t){
//     if(money>=t.price)
//     money -= t.price;
//     list[count++] = t.name;
// }

// 3) 상속의 형변환으로 처리
void buy(Item i){
    if(money >= i.price) money -= i.price; list[count++]=i.name;
}
}

class Item {
    String name;
    int price;
    public Item(String name, int price){
        this.price = price; 
        this.name = name;
    }
}

class Tv extends Item{
    public Tv(){
        super("Tv",40); //super은 조상을 가리킨다 생성자의 첫줄엔 기본 소괄호가 생략되어있다.
    }
}

class Audio extends Item{
    public Audio(){
        super("Audio",100); 
    }
}

class Computer extends Item{
    public Computer(){
        super("Computer",60); 
    }
}