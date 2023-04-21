/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author jvetri
 */
public class Stack {

    private int maxSize;
    private long[] stackArray;
    private int top;
    
    public Stack(int s)
    {
        maxSize = s;
        stackArray = new long[maxSize];
        top = -1;
    }
    
    public void push(long j)
    {
        stackArray[++top] = j;// ++top instead of top++ because ++top means increment before excecuting the statement
    }
    
    public long pop(){
        return stackArray[top--];
    }
    
    public boolean isEmpty(){
     return (top == -1);  
    }
    public boolean isFull()
    {
        return (top == maxSize-1);
    }
    
    
    public static void main(String[] args){
        Stack delimiter = new Stack(5);
        
        String test = "(())";
        
        char[] array = test.toCharArray();
        
        for(int i = 0; i < test.length(); i++ ){
            
            if(array[i] == '('){
                delimiter.push(1);
            }
            else if(array[i] == ')'){
            delimiter.pop();
        }
        }
         if(delimiter.isEmpty() == true){
             System.out.println("String is balanced");
         } 
         if(delimiter.isEmpty() == false){
             System.out.println("String is unbalanced");
         }
            
        
         
        
    }
}
