/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1314;

/**
 *
 * @author Edmundo Dela Cruz
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;

public class CustomerServiceQueueManager extends JFrame implements ActionListener{

    private JTextField txtCustomerName;
    private JButton btnAddCustomer, btnServeCustomer, btnShowQueue;
    private JList<String> customerList;
    private DefaultListModel<String> listModel;
    private Queue<String> customerQueue;  // Queue to manage customers (FIFO)

    CustomerServiceQueueManager() {
        // Initialize components
        customerQueue = new LinkedList<>();
        listModel = new DefaultListModel<>();

        // Frame settings
        setTitle("Customer Service Queue Manager");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Customer name input field
        JLabel lblCustomerName = new JLabel("Customer Name:");
        lblCustomerName.setBounds(20, 20, 120, 30);
        add(lblCustomerName);

        txtCustomerName = new JTextField();
        txtCustomerName.setBounds(170, 20, 300, 30);
        add(txtCustomerName);

        // Button to add a customer (left side)
        btnAddCustomer = new JButton("Add Customer");
        btnAddCustomer.setBounds(20, 70, 140, 30);
        add(btnAddCustomer);

        // Button to serve the next customer (left side)
        btnServeCustomer = new JButton("Serve Customer");
        btnServeCustomer.setBounds(20, 110, 140, 30);
        add(btnServeCustomer);

        // Button to show the current queue of customers (left side)
        btnShowQueue = new JButton("Show Queue");
        btnShowQueue.setBounds(20, 150, 140, 30);
        add(btnShowQueue);

        // List to display the customers
        customerList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(customerList);
        scrollPane.setBounds(170, 70, 300, 180);
        add(scrollPane);
        
        //Add ActionListener
        btnAddCustomer.addActionListener(this);
        btnServeCustomer.addActionListener(this);
        btnShowQueue.addActionListener(this);


        // Make frame visible
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new CustomerServiceQueueManager();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnAddCustomer){
            String customerName = txtCustomerName.getText().trim();
            if(!customerName.isEmpty()){
                customerQueue.offer(customerName);
                txtCustomerName.setText("");
                JOptionPane.showMessageDialog(this, "Customer added to the queue: "+customerQueue); 
            }else{
                JOptionPane.showMessageDialog(this, "Please enter a customer name", "Error", JOptionPane.ERROR_MESSAGE); 
            }
               
        }else if(e.getSource() == btnServeCustomer){
            if(!customerQueue.isEmpty()){
                String nextCustomer = customerQueue.poll();
                JOptionPane.showMessageDialog(this, "Serving customer: "+nextCustomer); 
            }else{
                JOptionPane.showMessageDialog(this, "No Customer in the queue", "Info", JOptionPane.INFORMATION_MESSAGE); 
            }
        }else if(e.getSource() == btnShowQueue){
            listModel.clear();
            if(!customerQueue.isEmpty()){
                for (String customer : customerQueue){
                    listModel.addElement(customer);
                }
            }else{
                JOptionPane.showMessageDialog(this, "No Customer in the queue", "Info", JOptionPane.INFORMATION_MESSAGE); 
            }
        }
    }
}
