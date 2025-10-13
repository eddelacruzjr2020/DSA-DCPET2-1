/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5And6Sample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.*;

/**
 * Simple List Sample App
 * Demonstrates adding and removing items using LinkedList and JList
 * @author Edmundo Dela Cruz
 */
public class ListSampleActivity extends JFrame implements ActionListener {
    
    private DefaultListModel<String> listModel;
    private LinkedList<String> linkedList;
    private JList<String> list;
    private JScrollPane scrollPane;
    private JTextField txtField;
    private JButton btnAdd, btnRemove;
    
    public ListSampleActivity() {
        linkedList = new LinkedList<>();
        listModel = new DefaultListModel<>();
        
        setTitle("List Sample App");
        setSize(300, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        // Create JList and ScrollPane
        list = new JList<>(listModel);
        scrollPane = new JScrollPane(list);
        scrollPane.setBounds(10, 10, 260, 180);
        add(scrollPane);
        
        // Create text field
        txtField = new JTextField();
        txtField.setBounds(10, 200, 160, 30);
        add(txtField);
        
        // Create Add button
        btnAdd = new JButton("Add");
        btnAdd.setBounds(180, 200, 80, 30);
        add(btnAdd);
        btnAdd.addActionListener(this);
        
        // Create Remove button (placed below Add)
        btnRemove = new JButton("Remove");
        btnRemove.setBounds(180, 240, 80, 30);
        add(btnRemove);
        btnRemove.addActionListener(this);
       
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAdd) {
            String listItem = txtField.getText().trim();
            
            if (!listItem.isEmpty()) {
                linkedList.add(listItem); // Add to LinkedList
                listModel.addElement(listItem); // Display in JList
                txtField.setText("");
            } else {
                JOptionPane.showMessageDialog(this, 
                    "Please enter an item first.", 
                    "Input Error", 
                    JOptionPane.ERROR_MESSAGE);
            }
        } 
        else if (e.getSource() == btnRemove) {
            int indexSelected = list.getSelectedIndex();
            
            if (indexSelected != -1) {
                linkedList.remove(indexSelected);
                listModel.remove(indexSelected);
            } else {
                JOptionPane.showMessageDialog(this, 
                    "Select an item to remove.", 
                    "Selection Error", 
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
}