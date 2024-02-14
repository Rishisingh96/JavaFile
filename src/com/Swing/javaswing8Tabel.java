package com.Swing;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class javaswing8Tabel {

    public JFrame jFrame;
        public javaswing8Tabel() {
            jFrame = new JFrame("This is iframe tutorial ");

            String data[][] = {{"1", "Rishi","Singh"},
                    {"2","mahendar","singh"},
                     { "3","Garima","singh"}
            };
            String column[] = {"id","name","surname"};

            final JTable jTable = new JTable(data,column);

            jTable.setCellSelectionEnabled(true);

            ListSelectionModel selectionModel  = jTable.getSelectionModel();
            selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            selectionModel.addListSelectionListener(new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent e) {
                    String data = null;
                    int[] row = jTable.getSelectedRows();
                    int[] column = jTable.getSelectedColumns();

                    for(int i = 0; i<row.length;i++){
                        for (int j = 0; j<column.length;j++){
                            data = (String) jTable.getValueAt(row[i],column[i]);
                        }
                    }
                    System.out.println("you selected this data  " + data  );
                }
            });

            JScrollPane jScrollPane = new JScrollPane(jTable);
            jFrame.add(jScrollPane);
         //   jFrame.add(jTable);
          //  jFrame.setLayout(null);
            jFrame.setSize(400, 400);
            jFrame.setVisible(true);
            jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        }

        public static void main(String args[]) {
            com.Swing.javaswing8Tabel ns = new com.Swing.javaswing8Tabel();
        }
    }

