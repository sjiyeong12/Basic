package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class _01_Container {
    public static void main(String[] args) {
        new MyFrame();
    }
}

class MyFrame extends BaseFrm {
    private JButton btnNorth, btnSouth, btnWest, btnEast, btnCenter;
    private JPanel pnlCenter;

    @Override
    public void init() {
        pnlCenter = new JPanel();
        pnlCenter.setLayout(new BorderLayout());
        btnNorth = new JButton("확인");
        btnSouth = new JButton("확인");
        btnWest = new JButton("확인");
        btnEast = new JButton("확인");
        btnCenter = new JButton("확인");
        btnCenter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(getParent(), "누르지마");
            }
        });
    }

    @Override
    public void arrange() {
        add(btnNorth, "North"); // 버튼 추가 + 버튼 위치
        add(btnSouth, "South");
        add(btnWest, "West");
        add(btnEast, "East");
        pnlCenter.add(btnCenter);
        pnlCenter.add(btnEast);
        add(pnlCenter, "Center");
    }

    MyFrame() {
        super();
        // setSize(400,300); //창의 가로와 세로 설정
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //나가면 완전히 실행 종료
        // // setLocationRelativeTo(this); //창이 열릴 때 화면 정 중앙에서 열림
        // setLocation(300,300); //300,300좌표에서 열림
        // setVisible(true); //창을 화면에 나타낼 것인지 설정
        // setTitle("제목 설정");
    }
}