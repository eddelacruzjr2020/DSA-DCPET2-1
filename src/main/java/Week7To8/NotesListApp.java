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
 *
 * @author Edmundo Dela Cruz
 */
public class NotesListApp extends JFrame implements ActionListener{
    
    private DefaultListModel<String> listmodel;
    private LinkedList<String> linkedList;
    private JScrollPane scrollPane;
    private JList<String> list;
    private JTextField txtField;
    private JButton btnAdd, btnRemove, btnClear, btnComplete;
   
    NotesListApp(){
        
        linkedList = new LinkedList<>();
        listmodel = new DefaultListModel<>();
        
        setTitle("Notes List");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        //Create JList and scrollpane
        list = new JList<>(listmodel);
        scrollPane = new JScrollPane(list);
        scrollPane.setBounds(10, 10, 260, 180);
        add(scrollPane);
        
        
        //Create text field
        txtField = new JTextField();
        txtField.setBounds(10, 200, 160, 30);
        add(txtField);
        
        //Create Add and Remove button
        btnAdd = new JButton("Add");
        btnAdd.setBounds(180, 200, 80, 30);
        add(btnAdd);
        btnAdd.addActionListener(this);
 
        
        btnRemove = new JButton("Remove");
        btnRemove.setBounds(180, 240, 80, 30);
        add(btnRemove);
        btnRemove.addActionListener(this);
        
        btnClear = new JButton("Clear");
        btnClear.setBounds(180, 280, 80, 30);
        add(btnClear);
        btnClear.addActionListener(this);
        
        btnComplete = new JButton("Complete");
        btnComplete.setBounds(180, 320, 80, 30);
        add(btnComplete);
        btnComplete.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnAdd){
        
            String todo = txtField.getText().trim();
            
            if(!todo.isEmpty()){
                linkedList.add(todo);
                listmodel.addElement(todo);
                txtField.setText("");
            }else{
                JOptionPane.showMessageDialog(this, "Please enter an todo first", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
            
            
        }else if(e.getSource() == btnRemove){
            
            int indexSelected = list.getSelectedIndex();
            
            if(indexSelected != -1){
                linkedList.remove(indexSelected);
                listmodel.remove(indexSelected);
            }else{
                 JOptionPane.showMessageDialog(this, "Please select first before remove", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }else if(e.getSource() == btnClear){
                linkedList.clear();
                listmodel.clear();
        }else if(e.getSource() == btnComplete){
            
            int indexSelected = list.getSelectedIndex();
            
            if(indexSelected != -1){
                String completedTask = listmodel.getElementAt(indexSelected);
                listmodel.set(indexSelected, completedTask + " (Completed)");
                list.setSelectedIndex(-1);
                
            }else{
                 JOptionPane.showMessageDialog(this, "Please select first before completing", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }


}
