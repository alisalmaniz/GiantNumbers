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
public class Sum {
    
    private int size1;
    private int size2;
    private int temp;
    private LinkedList link1;
    private LinkedList link2;
    
    public Sum(LinkedList link1, LinkedList link2){

        this.link1=link1;
        this.link2=link2;
        size1=link1.size();
        size2=link2.size();
        temp=0;
    }    
    

    public void sumAndPrint(){
        
        LinkedList link3 = new LinkedList();
        
        int sign1= (int) link1.getLast();
        int sign2= (int) link2.getLast();
        
        int i;
        if(size1>size2)
            i=size1;
        else
            i=size2;
        
        //the following is a special way to sum
        
        
        int a=0;
        int b=0;
        for(;i>1 ;i--){
            
            a =(sign1==1 ? -1 : 1) * (size1>1 ? (int) link1.get(size1-2) : 0 );
            b =(sign2==1 ? -1 : 1) * (size2>1 ? (int) link2.get(size2-2) : 0 );
            //every element of a positive number will be positive and
            //every element of a negative number will be negative.
            
            link3.addFirst((b+a+temp)%10);
            temp=(b+a+temp)/10;
            
            size1--;
            size2--;

        }
        if(temp!=0)
            link3.addFirst(temp);
        
        //now the elements of a list are positive and negative
        //every element has 10 times greater than his right element
        
        int c=0;
        
        for( i=0; i<link3.size()-1; i++){
            
            a= (int) link3.get(i);
            b= (int) link3.get(i+1);
            if((a>0 && b<0) || (a<0 && b>0)){
                
                c=10*a+b;
                link3.set(i, c/10);
                link3.set(i+1, c%10);
            }
          
        }
        //the following print the number 
        
        JOptionPane.showMessageDialog(null, "It will write in consul");
        
        if((int)link3.get(0)==0)
            i=1;
        else
            i=0;
            
        if((int)link3.get(link3.size()-1)<0)
            System.out.print("-");
            
        for(; i<link3.size() ;i++)
            System.out.print(Math.abs((int)link3.get(i)));

        System.out.println();
    }

    public LinkedList getLink1() {
        return link1;
    }

    public void setLink1(LinkedList link1) {
        this.link1 = link1;
    }

    public LinkedList getLink2() {
        return link2;
    }

    public void setLink2(LinkedList link2) {
        this.link2 = link2;
    }

    public int getSize1() {
        return size1;
    }

    public void setSize1(int size1) {
        this.size1 = size1;
    }
    
    public int getSize2() {
        return size2;
    }

    public void setSize2(int size2) {
        this.size2 = size2;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
    
    
}
