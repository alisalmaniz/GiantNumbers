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
public class Status {
    
    private LinkedList link1;
    private LinkedList link2;
    private int sign1;
    private int sign2;
    
    public Status(LinkedList link1, LinkedList link2){

        this.link1=link1;
        this.link2=link2;
        sign1= (int) link1.getLast();
        sign2= (int) link2.getLast();
    }
    
    
    public void compare(){
        
        int j=0;
        if(sign1==0 && sign2==1)
            JOptionPane.showMessageDialog(null, "The first number is Greater than second number.");
        
        else if(sign1==1 && sign2==0)
            JOptionPane.showMessageDialog(null, "The second number is Greater than first number.");
        
        else if(sign1==1 && sign2==1){
            if(link1.size() > link2.size())
                JOptionPane.showMessageDialog(null, "The second number is Greater than first number.");
            else if(link1.size() < link2.size())
              JOptionPane.showMessageDialog(null, "The first number is Greater than second number.");
            else{
                for(int i=0; i<link1.size()-1; i++){

                    if((int)link1.get(i) > (int)link2.get(i)){
                        JOptionPane.showMessageDialog(null, "The second number is Greater than first number.");
                        j++;
                        break;
                    }
                    else if((int)link1.get(i) < (int)link2.get(i)){
                        JOptionPane.showMessageDialog(null, "The first number is Greater than second number.");
                        j++;
                        break;
                    }
                } 
                if(j==0)
                    JOptionPane.showMessageDialog(null, "The numbers are equal.");
            }
        }
        
        else if(sign1==0 && sign2==0){
            j=0;
            if(link1.size() < link2.size())
                JOptionPane.showMessageDialog(null, "The second number is Greater than first number.");
            else if(link1.size() > link2.size())
              JOptionPane.showMessageDialog(null, "The first number is Greater than second number.");
            else{
                for(int i=0; i<link1.size()-1; i++){

                    if((int)link1.get(i) < (int)link2.get(i)){
                        JOptionPane.showMessageDialog(null, "The second number is Greater than first number.");
                        j++;
                        break;
                    }
                    else if((int)link1.get(i) > (int)link2.get(i)){
                        JOptionPane.showMessageDialog(null, "The first number is Greater than second number.");
                        j++;
                        break;
                    }
                } 
                if(j==0)
                    JOptionPane.showMessageDialog(null, "The numbers are equal.");
            }
        }
            
        
    }

    public void isZero(){
        
        int j=0;

        for(int i=0; i<link1.size()-1; i++){
            
            if((int)link1.get(i)!=0)
                j++;System.out.println("");
        }
        int j2=0;

        for(int i=0; i<link2.size()-1; i++){
            
            if((int)link2.get(i)!=0)
                j2++;
        }
        
        if(j==0 && j2!=0)
            JOptionPane.showMessageDialog(null, "Just first number is zero.");
        else if(j!=0 && j2==0)
            JOptionPane.showMessageDialog(null, "Just second number is zero.");
        else if(j==0 && j2==0)
            JOptionPane.showMessageDialog(null, "Both numbers are zero.");
        else
            JOptionPane.showMessageDialog(null, "The numbers are not zero.");
    }
    
    public void setLink1(LinkedList link1) {
        this.link1 = link1;
    }

    public LinkedList getLink1() {
        return link1;
    }

    public LinkedList getLink2() {
        return link2;
    }

    public void setLink2(LinkedList link2) {
        this.link2 = link2;
    }
    
}
