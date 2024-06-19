package com.Swing.Universal;

import java.awt.*;
import java.awt.event.*;
import java.awt.print.PrinterException;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MenuBarExample implements ActionListener {
    JFrame f;
    JMenuBar menuBar;
    JMenu file, edit, help, Refactor;
    JMenuItem cut, copy, paste, selectAll, save, saveAs, open, exit, print;
    JMenuItem rename,Edit,moveClass;
    JTextArea ta;
    JLabel imageLabel;
    File currentFile;
    public MenuBarExample() {
        f = new JFrame();
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
//        Refactor = new JMenuItem("Refactor");
        rename = new JMenuItem("Rename");
        Edit = new JMenuItem("Edit");
        moveClass = new JMenuItem("Move");
        selectAll = new JMenuItem("SelectAll");
        save = new JMenuItem("Save");
        saveAs = new JMenuItem("Save As");
        open = new JMenuItem("Open");
        exit = new JMenuItem("Exit");
        print = new JMenuItem("Print");

        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);
        rename.addActionListener(this);
        save.addActionListener(this);
        saveAs.addActionListener(this);
        open.addActionListener(this);
        exit.addActionListener(this);
        print.addActionListener(this);

        menuBar = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        Refactor = new JMenu("Refactor");
        edit.add(Refactor);

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);
      //  edit.add(Refactor);

//        menuBar.add(Refactor.add(Edit));
//        menuBar.add(Refactor.add(moveClass));
        Refactor.add(rename);
        Refactor.add(Edit);
        Refactor.add(moveClass);

        file.add(open);
        file.add(save);
        file.add(saveAs);
        file.add(print);
        file.add(exit);


        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);

        ta = new JTextArea();
        ta.setBounds(5, 5, 400, 400);
        Font font = new Font("Arial", Font.BOLD, 20);
        ta.setFont(font);

        imageLabel = new JLabel();
        imageLabel.setBounds(5, 5, 400, 400);

        f.add(menuBar);
        f.add(ta);
        f.add(imageLabel);
        f.setJMenuBar(menuBar);
        f.setLayout(null);
        f.setSize(500, 500);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new MenuBarExample();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cut) {
            ta.cut();
        } else if (e.getSource() == copy) {
            ta.copy();
        } else if (e.getSource() == paste) {
            ta.paste();
        } else if (e.getSource() == selectAll) {
            ta.selectAll();
        } else if (e.getSource() == save) {
            saveFile(false);
        } else if (e.getSource() == saveAs) {
            saveFile(true);
        } else if (e.getSource() == open) {
            openFile();
        } else if (e.getSource() == exit) {
            System.exit(0);
        } else if (e.getSource() == print) {
            printFile();
        }
    }

    private void saveFile(boolean saveAs) {
        if (saveAs || currentFile == null) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));
            int option = fileChooser.showSaveDialog(f);
            if (option == JFileChooser.APPROVE_OPTION) {
                currentFile = fileChooser.getSelectedFile();
                if (!currentFile.getName().endsWith(".txt")) {
                    currentFile = new File(currentFile.getAbsolutePath() + ".txt");
                }
            } else {
                return;
            }
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(currentFile))) {
            ta.write(writer);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void openFile() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files, Image Files", "txt", "jpg", "jpeg", "png"));
        int option = fileChooser.showOpenDialog(f);
        if (option == JFileChooser.APPROVE_OPTION) {
            currentFile = fileChooser.getSelectedFile();
            String fileName = currentFile.getName().toLowerCase();
            if (fileName.endsWith(".txt")) {
                openTextFile(currentFile);
            } else if (fileName.endsWith(".jpg") || fileName.endsWith(".jpeg") || fileName.endsWith(".png")) {
                openImageFile(currentFile);
            }
        }
    }

    private void openTextFile(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            ta.read(reader, null);
            ta.setVisible(true);
            imageLabel.setVisible(false);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void openImageFile(File file) {
        try {
            ImageIcon imageIcon = new ImageIcon(ImageIO.read(file));
            imageLabel.setIcon(imageIcon);
            ta.setVisible(false);
            imageLabel.setVisible(true);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void printFile() {
        try {
            boolean complete = ta.print();
            if (complete) {
                JOptionPane.showMessageDialog(f, "Printing Complete", "Information", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(f, "Printing", "Printer", JOptionPane.ERROR_MESSAGE);
            }
        } catch (PrinterException ex) {
            ex.printStackTrace();
        }
    }
}
