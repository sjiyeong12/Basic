package io;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import swing.BaseFrm;

public class _02_NotePad extends BaseFrm {
public static void main(String[] args) {
new _02_NotePad();
}
private JMenuBar menuBar;
private JMenu mnFile, mnInfo;
private JMenuItem miOpen, miNew, miSave, miExit;
private JTextArea ta;
private JScrollPane scp;
@Override
public void init() {
menuBar = new JMenuBar();
mnFile = new JMenu("File(f)");
mnInfo = new JMenu("Info(I)");
miNew = new JMenuItem("New(N)");
miOpen = new JMenuItem("Open(O)");
miSave = new JMenuItem("Save(S)");
miExit = new JMenuItem("Exit(x)");
mnFile.add(miNew);
mnFile.add(miOpen);
mnFile.add(miSave);
mnFile.add(miExit);
menuBar.add(mnFile);
menuBar.add(mnInfo);
setJMenuBar(menuBar);
ta = new JTextArea();
scp = new JScrollBar(ta);
}

@Override
public void arrange() {
    add(scp);
}
}