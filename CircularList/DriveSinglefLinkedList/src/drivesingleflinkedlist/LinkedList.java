/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drivesingleflinkedlist;

/**
 *
 * @author Hunter
 */
public class LinkedList 
{
      private Node first = null;
      private Node last = null;
              
      
      LinkedList(){}
      public void addToFront(int backNum){
          Node newN = new Node(0);
    newN.data = backNum;
    newN.next = null; 
    newN.next = null;
    if(first == null) {
      first = newN;
      newN.next = first;
      newN.prev = first;
    } else {
      Node temp = new Node(0);
      temp = first;
      while(temp.next != first)
        temp = temp.next;
      temp.next = newN;
      newN.prev = temp;
      newN.next = first;
      first.prev = newN;
      first = newN;
    }    
    } 
       
      
      public void addToBack(int backNum)
      {
         
    Node newNode = new Node(backNum);
    newNode.next = null; 
    //newNode.next = null;
    if(first == null) {
      first = newNode;
      newNode.next = first;
      newNode.prev = first;
    } else {
      Node temp = new Node(0);
      temp = first;
      while(temp.next != first)
        temp = temp.next;
      temp.next = newNode;
      newNode.next = first;
      newNode.prev = temp;
      first.prev = newNode;
    } 
           }
      
      public void addInOrder(Node temp)
      {
          System.out.println("temp " + temp.getData());
          if(first == null){
              first = temp;
              return;
          }
                 
          Node iter = first;
          if(iter.getNext() == null)
          {
              if(iter.getData() < temp.getData()){
                  iter.setNext(temp);
                  temp.setPrev(iter);
                  return;
                 
              }
              else{
                  iter.setPrev(temp);
                  temp.setNext(iter);
                  first = temp;
                  return;
              }
          }
          while(temp.getData() > iter.getData())
          {
             
              if(iter.getNext() == null)
              {
                   iter.setNext(temp);
                   temp.setPrev(iter);
                   return;
              }
              iter = iter.getNext();
            
          }
          
          
          if(iter == first)
          {
              temp.setNext(iter);
              iter.setPrev(temp);
              first = temp;
              return;
          }
          iter.getPrev().setNext(temp);
          temp.setPrev(iter.getPrev());
          temp.setNext(iter);
          iter.setPrev(temp);
           
             
         
          
      }
      public boolean deleteNode(int del)
      {
          Node iter = first;
          if(first.getData() == del)
          {
              first = first.getNext();
              first.setPrev(null);
              return true;
          }
          while(iter!=null)
          {
              if(iter.getData() == del)
              {
                  iter.getPrev().setNext(iter.getNext());
                  if(iter.getNext() != null)
                      iter.getNext().setPrev(iter.getPrev());
                  return true;
              }
           
              iter = iter.getNext();
              
          }
          return false;
      }
      public void print(){
        System.out.println("****************");
        Node temper = new Node(0);
        temper = this.first;
        //System.out.println(this.first);
    if(temper != null) {
      System.out.print("Linked List: ");
      while(true) {
        System.out.print(temper.data + " ");
        temper = temper.next;
        if(temper == this.first)
          break;
      }
      System.out.println();
        System.out.println("****************");
        }
      }
      public void printBackwards(){
       System.out.println("****************");
       last = first.prev;
        Node temper = new Node(0);
        temper = this.last;
        //System.out.println(this.last); = null
    if(temper != null) {
      System.out.print("Linked List: ");
      //System.out.println(this.last);
      while(true) {
        System.out.print(temper.data + " ");
        temper = temper.prev;
        if(temper == this.last)
          break;
      }
      System.out.println();
        System.out.println("****************");
        }
      }
}
      
      
      
