package swing;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class _03_Component extends BaseFrm{
    private  JPanel pnlNorth, pnlCenter;
    private String arr[];
    private String size[];
    private JRadioButton[] rbArr;
    private ButtonGroup btnGroup;
    private JComboBox cbSize;
    private JLabel lbMenu,lbSize;

    @Override
    public void init() {
        pnlNorth = new JPanel();
        pnlCenter = new JPanel();
        arr = new String[]{"Coffee", "Latte", "Espresso","BlackTea","Ade"};
        size = new String[]{"Small","Mideum","Large"};
        rbArr = new JRadioButton[5];
        btnGroup = new ButtonGroup();
        cbSize = new JComboBox<>(size);
        lbSize = new JLabel(size[1]);
        for (int i = 0; i < arr.length; i++) {
            rbArr[i] = new JRadioButton(arr[i]);
            final int tmp = i;
            // rbArr[i].addActionListener(e->{lbMenu.setText(rbArr[tmp].getText());}); //자바에서 지역변수가 익명객체로 들어갈 때는 반드시 상수를 넣어야 함
            //위의 주석은 아래를 람다식으로 만든 것
            rbArr[i].addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    lbMenu.setText(rbArr[tmp].getText());
                }
            });
            cbSize.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                lbSize.setText(size[cbSize.getSelectedIndex()]);
                }
                });

            btnGroup.add(rbArr[i]);
            pnlNorth.add(rbArr[i]);
        }
        rbArr[0].setSelected(true);
        cbSize.setSelectedIndex(1);
        lbMenu = new JLabel(rbArr[0].getText());
        lbSize = new JLabel(size[cbSize.getSelectedIndex()]);
        lbMenu.setFont(new Font("Consolas",Font.ITALIC, 80));
        lbSize.setFont(new Font("Consolas",Font.BOLD, 30));
        lbSize.setForeground(Color.ORANGE);
    }
    @Override
    public void arrange() {
        pnlNorth.add(cbSize);
        pnlCenter.add(lbMenu);
        pnlCenter.add(lbSize);
        add(pnlNorth,"North");
        add(pnlCenter,"Center");
        
    }


    public static void main(String[] args) {
        new _03_Component();
    }
}
