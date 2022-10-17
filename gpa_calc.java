package gpa_calc;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;

public class gpa_calc extends JFrame {
	
  private JButton mac, uw, uoft, check_mac_units, check_mac_grades,calculate_mac;
  private JButton check_uoft_units, check_uoft_grades, calculate_uoft;
  private JButton check_uw_units, check_uw_grades, calculate_uw;
  private JLabel label;
  private JTextField tf=new JTextField("Welcome To Your GPA Calculator, Pick The University You Attend!"); 
 
  private static JTextArea mac_units = new JTextArea();
  private static JTextArea mac_grades = new JTextArea();
  
  private static JTextArea uoft_units = new JTextArea();
  private static JTextArea uoft_grades = new JTextArea();
  
  private static JTextArea uw_units = new JTextArea();
  private static JTextArea uw_grades = new JTextArea();
  
  private JTextField final_gpa = new JTextField(); 
  
  ArrayList <Double> mac_final_units = new ArrayList <>();
  ArrayList <Double> mac_final_grades = new ArrayList <>();
  
  ArrayList <Double> uoft_final_units = new ArrayList <>();
  ArrayList <Double> uoft_final_grades = new ArrayList <>();
  
  ArrayList <Double> uw_final_units = new ArrayList <>();
  ArrayList <Double> uw_final_grades = new ArrayList <>();
  
  public static void main(String[] args) {
    new gpa_calc();
  }

  public gpa_calc() {
  
    this.setSize(800,800);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("GPA Calculator");
    this.setLayout(null);
    
    tf.setEditable(false);
    tf.setBounds(100,50, 370,20); 
    final_gpa.setEditable(false);
    final_gpa.setBounds(100,450, 200,20);

    Clicklistener click = new Clicklistener();

    mac = new JButton ("McMaster");
    mac.setBounds(100,100,95,30);  
    mac.addActionListener(click);
    
    mac_units.setBounds(100,200,600, 20);
    mac_grades.setBounds(100,300,600, 20);
    
    uoft_units.setBounds(100,200,600, 20);
    uoft_grades.setBounds(100,300,600, 20);
    
    uw_units.setBounds(100,200,600, 20);
    uw_grades.setBounds(100,300,600, 20);

    uw = new JButton ("Waterloo");
    uw.setBounds(200,100,95,30);
    uw.addActionListener(click);
    
    uoft = new JButton ("Uoft");
    uoft.setBounds(300,100,95,30);
    uoft.addActionListener(click);
    
    label = new JLabel();
    label.setBounds(100,150,250,20);
    
    check_mac_units = new JButton ("Click here once you have inputted the number of units for each course taken");
    check_mac_units.setBounds(100, 250, 500,30);
    check_mac_units.addActionListener(click);
    
    check_uoft_units = new JButton ("Click here once you have inputted the number of units for each course taken");
    check_uoft_units.setBounds(100, 250, 500,30);
    check_uoft_units.addActionListener(click);
    
    check_uw_units = new JButton ("Click here once you have inputted the number of units for each course taken");
    check_uw_units.setBounds(100, 250, 500,30);
    check_uw_units.addActionListener(click);
    
    check_mac_grades = new JButton ("Click here once you have inputted the grades for each course taken");
    check_mac_grades.setBounds(100, 350, 500,30);
    check_mac_grades.addActionListener(click);    
    
    check_uoft_grades = new JButton ("Click here once you have inputted the grades for each course taken");
    check_uoft_grades.setBounds(100, 350, 500,30);
    check_uoft_grades.addActionListener(click);
    
    check_uw_grades = new JButton ("Click here once you have inputted the grades for each course taken");
    check_uw_grades.setBounds(100, 350, 500,30);
    check_uw_grades.addActionListener(click);
    
    calculate_mac = new JButton ("Calculate GPA!");
    calculate_mac.setBounds(100,400,200,30);
    calculate_mac.addActionListener(click);
    
    calculate_uoft = new JButton ("Calculate GPA!");
    calculate_uoft.setBounds(100,400,200,30);
    calculate_uoft.addActionListener(click);
    
    calculate_uw = new JButton ("Calculate GPA!");
    calculate_uw.setBounds(100,400,200,30);
    calculate_uw.addActionListener(click);
    
    
    this.add(tf);
    this.add(mac);
    this.add(uw);
    this.add(uoft);
    this.add(label);
    this.add(final_gpa);
    
    this.add(mac_units);
    this.add(check_mac_units);
    this.add(mac_grades);
    this.add(check_mac_grades);
    this.add(calculate_mac);
    
    this.add(uoft_units);
    this.add(check_uoft_units);
    this.add(uoft_grades);
    this.add(check_uoft_grades);
    this.add(calculate_uoft);
    
    this.add(uw_units);
    this.add(check_uw_units);
    this.add(uw_grades);
    this.add(check_uw_grades);
    this.add(calculate_uw);
    
    mac_units.setVisible(false);
    check_mac_units.setVisible(false);
    mac_grades.setVisible(false);
    check_mac_grades.setVisible(false);
    calculate_mac.setVisible(false);
    
    uoft_units.setVisible(false);
    check_uoft_units.setVisible(false);
    uoft_grades.setVisible(false);
    check_uoft_grades.setVisible(false);
    calculate_uoft.setVisible(false);    
    
    uw_units.setVisible(false);
    check_uw_units.setVisible(false);
    uw_grades.setVisible(false);
    check_uw_grades.setVisible(false);
    calculate_uw.setVisible(false); 
    
    final_gpa.setVisible(false);
    
    this.setVisible(true);
    
  }
    
  private class Clicklistener implements ActionListener {
	  
    public void actionPerformed(ActionEvent e) {
    	
      //all mcmaster parts	
      if (e.getSource() == mac) {
        label.setText("Entering McMaster GPA calculator..."); 
        uoft_units.setVisible(false);
        check_uoft_units.setVisible(false);
        uoft_grades.setVisible(false);
        check_uoft_grades.setVisible(false);
        calculate_uoft.setVisible(false); 
        final_gpa.setVisible(false);
        
        uw_units.setVisible(false);
        check_uw_units.setVisible(false);
        uw_grades.setVisible(false);
        check_uw_grades.setVisible(false);
        calculate_uw.setVisible(false); 
        
        mac_units.setVisible(true);
        mac_units.setEditable(true);
        check_mac_units.setVisible(true);
        mac_units.setText("Delete this text and write the number of units of each course taken, separated by a comma");       
      }
      
      if (e.getSource() == check_mac_units) {
      	mac_units.setEditable(false);
      	String units = mac_units.getText();
      	ArrayList<String> unit_list = new ArrayList<>(Arrays.asList(units.split(",")));
      	
      	
      	
      	for (int i = 0; i<unit_list.size(); i++) {
      		mac_final_units.add(Double.parseDouble(unit_list.get(i)));
      	}   	
      	   	
      	mac_grades.setVisible(true);
      	mac_grades.setEditable(true);
      	mac_grades.setText("Delete this text and write your grade for each course on the 12 point scale, sepearated by a comma");
      	check_mac_grades.setVisible(true);
      }
      
      if (e.getSource() == check_mac_grades) {
    	  mac_grades.setEditable(false);
    	  String grades = mac_grades.getText();
    	  
    	  ArrayList<String> grade_list = new ArrayList<>(Arrays.asList(grades.split(",")));
          
          
    	  for (int i = 0; i< grade_list.size(); i++) {
        		mac_final_grades.add(Double.parseDouble(grade_list.get(i)));
          }        
          calculate_mac.setVisible(true); 
      }
      
      if (e.getSource() == calculate_mac) {
    	  double sum_units = 0;
          double sum_points = 0;
          for (int i = 0; i<mac_final_grades.size(); i++) {
        	  sum_units = mac_final_units.get(i) + sum_units;
        	  sum_points = mac_final_units.get(i)*mac_final_grades.get(i) + sum_points;
          }
          double gpa = sum_points/sum_units;
          double gpa_round = Math.round(gpa * 100.0) / 100.0;
          final_gpa.setText("Your Cumulative GPA is: "+gpa_round);
          final_gpa.setVisible(true);
      }
      
      //all waterloo parts
      if (e.getSource() == uw) {
        label.setText("Entering uWaterloo GPA calculator...");
        mac_units.setVisible(false);
        check_mac_units.setVisible(false);
        mac_grades.setVisible(false);
        check_mac_grades.setVisible(false);
        calculate_mac.setVisible(false);
        final_gpa.setVisible(false);
        
        uoft_units.setVisible(false);
        check_uoft_units.setVisible(false);
        uoft_grades.setVisible(false);
        check_uoft_grades.setVisible(false);
        calculate_uoft.setVisible(false); 
        
        uw_units.setVisible(true);
        uw_units.setEditable(true);
        check_uw_units.setVisible(true);
        uw_units.setText("Delete this text and write the number of credits of each course taken, separated by a comma");
      }
      
      if (e.getSource() == check_uw_units) {
        	uw_units.setEditable(false);
        	String units = uw_units.getText();
        	ArrayList<String> unit_list = new ArrayList<>(Arrays.asList(units.split(",")));
        	
        	
        	
        	for (int i = 0; i<unit_list.size(); i++) {
        		uw_final_units.add(Double.parseDouble(unit_list.get(i)));
        	}   	
        	   	
        	uw_grades.setVisible(true);
        	uw_grades.setEditable(true);
        	uw_grades.setText("Delete this text and write your grade for each course as a percent, sepearated by a comma");
        	check_uw_grades.setVisible(true);
        }
      
      if (e.getSource() == check_uw_grades) {
    	  uw_grades.setEditable(false);
    	  String grades = uw_grades.getText();
    	  
    	  ArrayList<String> grade_list = new ArrayList<>(Arrays.asList(grades.split(",")));
          
          
    	  for (int i = 0; i< grade_list.size(); i++) {
        		uw_final_grades.add(Double.parseDouble(grade_list.get(i)));
          }        
          calculate_uw.setVisible(true); 
      }
      
      if (e.getSource() == calculate_uw) {
    	  double sum_units = 0;
          double sum_points = 0;
          for (int i = 0; i<uw_final_grades.size(); i++) {
        	  sum_units = uw_final_units.get(i) + sum_units;
        	  sum_points = uw_final_units.get(i)*uw_final_grades.get(i) + sum_points;
          }
          double gpa = sum_points/sum_units;
          double gpa_four_scale = 0;
          
          if (gpa >=90) {
        	  gpa_four_scale = 4;
          }
          else if (gpa >=85) {
        	  gpa_four_scale = 3.9;
          }
          else if (gpa >=80) {
        	  gpa_four_scale = 3.7;
          }
          else if (gpa >=77) {
        	  gpa_four_scale = 3.3;
          }
          else if (gpa >=73) {
        	  gpa_four_scale = 3;
          }
          else if (gpa >=70) {
        	  gpa_four_scale = 2.7;
          }
          else if (gpa >=67) {
        	  gpa_four_scale = 2.3;
          }
          else if (gpa >=63) {
        	  gpa_four_scale = 2;
          }
          else if (gpa >=60) {
        	  gpa_four_scale = 1.7;
          }
          else if (gpa >=57) {
        	  gpa_four_scale = 1.3;
          }
          else if (gpa >=53) {
        	  gpa_four_scale = 1;
          }
          else if (gpa >=50) {
        	  gpa_four_scale = 0.7;
          }
          else {
        	  gpa_four_scale = 0;
          }
          final_gpa.setText("Your Cumulative GPA is: "+gpa_four_scale);
          final_gpa.setVisible(true);
      }
      
      //all uoft parts
      if (e.getSource() == uoft) {
        label.setText("Entering Uoft GPA calculator...");
        mac_units.setVisible(false);
        check_mac_units.setVisible(false);
        mac_grades.setVisible(false);
        check_mac_grades.setVisible(false);
        calculate_mac.setVisible(false);
        final_gpa.setVisible(false);
        
        uw_units.setVisible(false);
        check_uw_units.setVisible(false);
        uw_grades.setVisible(false);
        check_uw_grades.setVisible(false);
        calculate_uw.setVisible(false); 
        
        uoft_units.setVisible(true);
        uoft_units.setEditable(true);
        check_uoft_units.setVisible(true);
        uoft_units.setText("Delete this text and write the number of credits of each course taken, separated by a comma");
        
      }	  
      
      if (e.getSource() == check_uoft_units) {
        uoft_units.setEditable(false);
        String units = uoft_units.getText();
        ArrayList<String> unit_list = new ArrayList<>(Arrays.asList(units.split(",")));
        	       	
        for (int i = 0; i<unit_list.size(); i++) {
        	uoft_final_units.add(Double.parseDouble(unit_list.get(i)));
        }   	
        	   	
        uoft_grades.setVisible(true);
        uoft_grades.setEditable(true);
        uoft_grades.setText("Delete this text and write your grade for each course on the 4 point scale, sepearated by a comma");
        check_uoft_grades.setVisible(true);
        }
      
      if (e.getSource() == check_uoft_grades) {
    	  uoft_grades.setEditable(false);
    	  String grades = uoft_grades.getText();
    	  
    	  ArrayList<String> grade_list = new ArrayList<>(Arrays.asList(grades.split(",")));
          
    	  for (int i = 0; i< grade_list.size(); i++) {
        		uoft_final_grades.add(Double.parseDouble(grade_list.get(i)));
          }        
          calculate_uoft.setVisible(true); 
      }
      
      if (e.getSource() == calculate_uoft) {
    	  double sum_units = 0;
          double sum_points = 0;
          for (int i = 0; i<uoft_final_grades.size(); i++) {
        	  sum_units = uoft_final_units.get(i) + sum_units;
        	  sum_points = uoft_final_units.get(i)*uoft_final_grades.get(i) + sum_points;
          }
          double gpa = sum_points/sum_units;
          double gpa_round = Math.round(gpa * 100.0) / 100.0;
          final_gpa.setText("Your Cumulative GPA is: "+gpa_round);
          final_gpa.setVisible(true);
      }
    }
  }
}