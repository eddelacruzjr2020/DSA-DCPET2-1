/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2Code;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

   
/**
 *
 * @author Edmundo Dela Cruz
 */
public class mcDollibee extends JFrame implements ActionListener{
    
    private JLabel hdrMcDollibee, lblBurger, lblBurgerCount, lblFries, lblFriesCount, lblSoda, lblSodaCount;
    private JButton addBurger, minusBurger, addFries, minusFries, addSoda, minusSoda, btnReview, btnReset;
    private JComboBox<String> cmbBurger, cmbFries, cmbSoda;
    private JTextArea txaSummary;
    private static final String[] sizes = {"Small", "Medium", "Large"};
    private int intBurger = 0;
    private int intFries = 0;
    private int intSoda = 0;
    
    mcDollibee(){
        setSize(600, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Adding Components
        hdrMcDollibee = new JLabel("Welcome to McDollibee", SwingConstants.CENTER);
        hdrMcDollibee.setBounds(0, 10, 600, 30);
        add(hdrMcDollibee);
        
        //Burger
        lblBurger = new JLabel("Burger:");
        lblBurger.setBounds(50, 50, 100, 30);
        add(lblBurger);
        
        //Burger Count
        lblBurgerCount = new JLabel("0");
        lblBurgerCount.setBounds(160, 50, 50, 30);
        add(lblBurgerCount);
        
        //Add Burger
        addBurger = new JButton("+");
        addBurger.setBounds(220, 50, 50, 30);
        add(addBurger);
        
        //Add Burger
        minusBurger = new JButton("-");
        minusBurger.setBounds(280, 50, 50, 30);
        add(minusBurger);
        
        //Burger Combo box
        cmbBurger = new JComboBox<>(sizes);
        cmbBurger.setBounds(340, 50, 80, 30);
        add(cmbBurger);
        
         //Fries
        lblFries = new JLabel("Fries:");
        lblFries.setBounds(50, 100, 100, 30);
        add(lblFries);
        
        //Fries Count
        lblFriesCount = new JLabel("0");
        lblFriesCount.setBounds(160, 100, 50, 30);
        add(lblFriesCount);
        
        //Add Fries
        addFries = new JButton("+");
        addFries.setBounds(220, 100, 50, 30);
        add(addFries);
        
        //Add Fries
        minusFries = new JButton("-");
        minusFries.setBounds(280, 100, 50, 30);
        add(minusFries);
        
        //Fries Combo box
        cmbFries = new JComboBox<>(sizes);
        cmbFries.setBounds(340, 100, 80, 30);
        add(cmbFries);
        
         //Soda
        lblSoda = new JLabel("Soda:");
        lblSoda.setBounds(50, 150, 100, 30);
        add(lblSoda);
        
        //Soda Count
        lblSodaCount = new JLabel("0");
        lblSodaCount.setBounds(160, 150, 50, 30);
        add(lblSodaCount);
        
        //Add Soda
        addSoda = new JButton("+");
        addSoda.setBounds(220, 150, 50, 30);
        add(addSoda);
        
        //Add Soda
        minusSoda = new JButton("-");
        minusSoda.setBounds(280, 150, 50, 30);
        add(minusSoda);
        
        //Soda Combo box
        cmbSoda = new JComboBox<>(sizes);
        cmbSoda.setBounds(340, 150, 80, 30);
        add(cmbSoda);
        
        //Review 
        btnReview = new JButton("Review Order");
        btnReview.setBounds(50, 200, 120, 30);
        add(btnReview);
        
         //Reset 
        btnReset = new JButton("Reset Order");
        btnReset.setBounds(200, 200, 120, 30);
        add(btnReset);
        
        //Summary Form
        txaSummary = new JTextArea();
        txaSummary.setBounds(50, 250, 500, 200);
        txaSummary.setEditable(false);
        add(txaSummary);
        
        //Add buttons to actionListener
        addBurger.addActionListener(this);
        minusBurger.addActionListener(this);
        addFries.addActionListener(this);
        minusFries.addActionListener(this);
        addSoda.addActionListener(this);
        minusSoda.addActionListener(this);
        btnReview.addActionListener(this);
        btnReset.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == addBurger){
            intBurger++;
            lblBurgerCount.setText(String.valueOf(intBurger));
        }else if(e.getSource() == minusBurger){
            if(intBurger > 0){
                intBurger--;
                lblBurgerCount.setText(String.valueOf(intBurger));
            }
        }else if(e.getSource() == addFries){
            intFries++;
            lblFriesCount.setText(String.valueOf(intFries));
        }else if(e.getSource() == minusFries){
            if(intFries > 0){
                intFries--;
                lblFriesCount.setText(String.valueOf(intFries));
            }
        }else if(e.getSource() == addSoda){
            intSoda++;
            lblSodaCount.setText(String.valueOf(intSoda));
        }else if(e.getSource() == minusSoda){
            if(intSoda > 0){
                intSoda--;
                lblSodaCount.setText(String.valueOf(intSoda));
            }
        }else if(e.getSource() == btnReview){
            double totalCost = 0.0;
            
            totalCost+=calculateCost(intBurger, (String)cmbBurger.getSelectedItem());
            totalCost+=calculateCost(intFries, (String)cmbFries.getSelectedItem());
            totalCost+=calculateCost(intSoda, (String)cmbSoda.getSelectedItem());
            
            txaSummary.setText("Burger ("+cmbBurger.getSelectedItem()+") : "+intBurger+"\n" +
                               "Fries ("+cmbFries.getSelectedItem()+") : "+intFries+"\n" +
                               "Soda ("+cmbSoda.getSelectedItem()+") : "+intSoda+"\n" +
                               "Total Cost: $"+totalCost);
            
        }else if(e.getSource() == btnReset){
            txaSummary.setText("");
            intBurger = 0;
            lblBurgerCount.setText(String.valueOf(intBurger));
            intFries = 0;
            lblFriesCount.setText(String.valueOf(intFries));
            intSoda = 0;
            lblSodaCount.setText(String.valueOf(intSoda));
            cmbBurger.setSelectedIndex(0);
            cmbFries.setSelectedIndex(0);
            cmbSoda.setSelectedIndex(0);
            
        }
        
    }
    
    private double calculateCost(int count, String size){
        double price = 0.0;
        switch(size){
            case "Small" -> price = 5.00;
            case "Medium" -> price = 7.50;
            case "Large" -> price = 10.00;
        }
        
        return count*price;
    }
    
}
