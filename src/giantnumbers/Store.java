/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giantnumbers;

import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ali salmani
 */
public class Store {
    
    private int sign1;
    private int sign2;
    private int i;
    private int n;
    private char c;
    
    private String num1;
    private String num2;
    
    public Store(){
        sign1=0;
        sign2=0;  
        
        num1 =  JOptionPane.showInputDialog("Enter first number");
        num2 =  JOptionPane.showInputDialog("Enter second number");
    }
    
    
    public LinkedList set1 (){
        // set every element of number1 to one cell of linklist1 (link1).
   
        LinkedList link1 = new LinkedList();
        
        if(num1.charAt(0)== '-')
            sign1=1;
        // it will add to end of list to show that this number is negative or positive.
        
        for( i=sign1 ; i < num1.length() ; i++){
            
            c=num1.charAt(i);
            n=Character.getNumericValue(c);
            link1.add(n);
        }
        
        link1.add(sign1);
         
        return link1;   
    }
    
    public LinkedList set2 (){
        // set every element of number2 to one cell of linklist2 (link2).
        
        LinkedList link2 = new LinkedList();
            
        if(num2.charAt(0)== '-')
            sign2=1;
        // it will add to end of list to show that this number is negative or positive.
        
        for( i=sign2 ; i < num2.length() ; i++){
            
            c=num2.charAt(i);
            n=Character.getNumericValue(c);
            link2.add(n);
        }
        
        link2.add(sign2);
        
        return link2;
    }

    public int getSign1() {
        return sign1;
    }

    public void setSign1(int sign1) {
        this.sign1 = sign1;
    }

    public int getSign2() {
        return sign2;
    }

    public void setSign2(int sign2) {
        this.sign2 = sign2;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }
    
}
