package swing;

import javax.swing.JFrame;

public abstract class BaseFrm extends JFrame { //클래스 앞에 abstarct 가 붙으면 인스턴스를 생성할 수 없다.
    //추상클래스는 추상 메소드를 포함
    //클래스 앞에 final이 붙으면 상속이 안됨
    private int width, height;
    public BaseFrm(){
        this(600,500);
    }
    public BaseFrm(int width, int height){
        this.width=width;
        this.height=height;
        init(); 
        arrange(); 
        inflate();
    }

        public abstract void init(); //추상메서드
        public abstract void arrange(); //추상메서드
        public void inflate(){
            
            setSize(width,height);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
            setLocation(300,300);
            setVisible(true); 
            setTitle("제목 설정");
        }
    }
