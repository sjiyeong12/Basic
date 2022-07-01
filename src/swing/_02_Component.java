package swing;

import javax.swing.*;
import java.awt.event.*;

public class _02_Component extends BaseFrm{
    JPanel pnlNorth, pnlCenter;
    JLabel lbMenu1, lbMenu2;
    JLabel icon1, icon2;
    JCheckBox cbMenu1, cbMenu2; 


    public static void main(String[] args) {
        new _02_Component();
    }
    @Override
    public void init() {
        pnlNorth = new JPanel();
        pnlCenter = new JPanel();
        lbMenu1 = new JLabel("키위"); //체크박스 앞의 라벨!
        lbMenu2 = new JLabel("사과");
        cbMenu1 = new JCheckBox(); //체크박스 초기화
        cbMenu2 = new JCheckBox();
        icon1 = new JLabel(new ImageIcon("images/1.jpg"));
        icon2 = new JLabel(new ImageIcon("images/2.jpg"));
        icon1.setVisible(false); //보일지 안 보일지 여부.(false라서 보이지 않음)
        icon2.setVisible(false);
        cbMenu1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                icon1.setVisible(!icon1.isVisible());
                
            }
            
        });
        cbMenu2.addActionListener(e->icon2.setVisible(true));
        
    }

    @Override
    public void arrange() {
        pnlNorth.add(lbMenu1);
        pnlNorth.add(cbMenu1);
        pnlNorth.add(lbMenu2);
        pnlNorth.add(cbMenu2);
        pnlCenter.add(icon1);
        pnlCenter.add(icon2);
        add(pnlNorth,"North"); //North에 배치
        add(pnlCenter,"Center");

    }
}
