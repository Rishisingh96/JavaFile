package com.Swing;
import java.awt.*;
import javax.swing.*;
public class NotePad {
    public JFrame jFrame;
    public JMenuBar jMenuBar;
    JMenu file,edit,view;
    JMenuItem Undo,cut,copy,paste,delete, Goto,selectAll,
            New,NewWindow, Open,save,saveAs,print,exti,
            zoom,zoomin,zoomout;
    JTextArea jTextArea;
    public NotePad(){
        jFrame= new JFrame("this is jFrame ");

        jMenuBar = new JMenuBar();
/*
        File = new JMenu("File");
        File.add(New);
        File.add(NewWindow);
        File.add(Open);
        File.add(save);
        File.add(saveAs);
//        File.add(PageSetup);
        File.add(print);
        File.add(exti);
        Edit = new JMenu("Edit");
        Edit.add(Undo);
        Edit.add(cut);
        Edit.add(copy);
        Edit.add(paste);
        Edit.add(delete);
        Edit.add(Goto);
        Edit.add(selectAll);
        View = new JMenu("View");
        View.add(zoom);
        zoom.add(zoomin);
        zoom.add(zoomout);
*/
        jMenuBar.add(file);
        jMenuBar.add(edit);
        jMenuBar.add(view);

        jFrame.setJMenuBar(jMenuBar);
        jFrame.add(jMenuBar);

        jFrame.setLayout(null);
        jFrame.setSize(500,500);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        NotePad jNotePad = new NotePad();
    }
}
