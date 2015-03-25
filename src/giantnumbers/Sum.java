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
        
        int a=0;
        int b=0;
        for(;i>1 ;i--){
            
            a =(sign1==1 ? -1 : 1) * (size1>1 ? (int) link1.get(size1-2) : 0 );
            b =(sign2==1 ? -1 : 1) * (size2>1 ? (int) link2.get(size2-2) : 0 );
            
            link3.addFirst((b+a+temp)%10);
            temp=(b+a)/10;
            
            size1--;
            size2--;
          //  JOptionPane.showMessageDialog(null, "ok");
           // JOptionPane.showMessageDialog(null, a);
           // JOptionPane.showMessageDialog(null, b);
        }
        if(temp!=0)
            link3.addFirst(temp);
        
        int c=0;
      //    System.out.print("ok");
        
        for( i=0; i<link3.size()-1; i++){
            
            a= (int) link3.get(i);
            b= (int) link3.get(i+1);
            if((a>0 && b<0) || (a<0 && b>0)){
                
                c=10*a+b;
                link3.set(i, c/10);
                link3.set(i+1, c%10);
            }
          
        }
        
        if((int)link3.get(0)==0)
            i=1;
        else
            i=0;
            
        if((int)link3.get(1)<0)
            System.out.print("-");
            
        for(; i<link3.size() ;i++)
            System.out.print(Math.abs((int)link3.get(i)));

        System.out.println();
    }
    
}
