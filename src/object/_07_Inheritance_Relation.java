package object;

public class _07_Inheritance_Relation {
    public static void main(String[] args) {
        Firebat firebat = new Firebat(); //FIrebat이라는 클래스의 새 firebat 생성
        firebat.move(100,100);
        firebat.steamPack();
        //클래스와 관계를 고려해야 한다.
        // is-a 관계 :: Inheritance
        // has-a 관계 :: 포함관계
    }   
}

class Unit {
    int x;
    int y;
    int hp;
    int attacLv;
    int armor;
    void move(int x, int y){
        this.x = x;
        this.y = y;
    } //move함수에 x랑 y를 집어넣음. 그래서 클래스를 가져오는 this.<에 x와 y를 붙임
}

//같은 폴더 안에 같은 클래스네임이 있으면 안됨.
//Unit에서 상속받은 Firebat
class Firebat extends Unit {
    void steamPack(){
        System.out.println("스팀펙~~~!");
    }
}

class Car {
    int wheel;
    int door;
    Engine engine; //has a 관계(포함관계); class엔진을 들고옴;
}

class Engine {
    int gitong;
    int mph;
    int cc;
}
