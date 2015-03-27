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
public class Multiplication {
    
    private LinkedList link1;
    private LinkedList link2;
    private int sign1;
    private int sign2;
    
    public Multiplication(LinkedList link1, LinkedList link2){

        this.link1=link1;
        this.link2=link2;
        sign1= (int) link1.getLast();
        sign2= (int) link2.getLast();
    }
    
    
    public void multiplicationAndPrint(){
        
        LinkedList link3 = new LinkedList();
        int temp=0;
        int n=0;
        int k=0;
        for(int i=0; i<link1.size()-1; i++){
            k=Math.min(i, link2.size()-2);
            n=0;
            for(int j=0; j<=k ; j++){
                n+=(int)link1.get(link1.size()-2-j+link2.size()-2-Math.max(i,link2.size()-2)) * (int)link2.get(link2.size()-2-k+j);
                System.out.println("**"+n+"**"+i);
            }
            link3.addFirst((n+temp)%10);
            temp=(n+temp)/10;   
        }
        System.out.println("");
        for(int i=1; i<link2.size()-1; i++){
            k=Math.min(link1.size()-2, link2.size()-2-i);
            n=0;
            for(int j=0; j<=k ; j++){
                n+=(int)link1.get(j) * (int)link2.get(link2.size()-2-i-j);
            System.out.println("**"+ n+"**"+i);
            }
            link3.addFirst((n+temp)%10);
            temp=(n+temp)/10;      
        }
        
        if(temp!=0)
                link3.addFirst(temp);
        
        JOptionPane.showMessageDialog(null, "It will write in consul");
        
         if((sign1==1 && sign2==0) || (sign1==0 && sign2==1))
            System.out.print("-");
            
        for(int i=0; i<link3.size() ;i++)
            System.out.print((int)link3.get(i));

        System.out.println();
    }
}
