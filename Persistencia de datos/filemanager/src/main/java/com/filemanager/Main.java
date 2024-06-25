package com.filemanager;

import javax.swing.JFileChooser;

public class Main {
    public static void main(String[] args) {
        // javax.swing.JFileChooser j = new javax.swing.JFileChooser();
        JFileChooser j = new JFileChooser();
        try {
            j.showOpenDialog(j);

            String path = j.getSelectedFile().getAbsolutePath();
            System.out.println(path);
    
        } catch (Exception e) {
           System.out.println("No se seleccionó ningún archivo");
        }
    }
}