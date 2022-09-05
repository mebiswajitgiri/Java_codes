package com.company.LinkList;

public class CircularLL
{
    Node head;
    //Node tail;
    int size;
    public CircularLL()
    {
        this.size=0;
    }
    private class Node
    {
        int val;
        Node next;
        private Node(int val)
        {
            this.val=val;
        }
        private Node(int val,Node next)
        {
            this.val=val;
            this.next=next;
        }
    }
    public void  insert(int val)
    {
        Node node = new Node(val);
        if(head==null)
        {
            head=node;
            node.next=head;
            size++;
            return;
        }
        Node temp=head;
        while(temp.next!=head)
        {
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;
        size++;
    }
    public void insert(int val,int idx)
    {
        if(size==0)
        {
            insert(val);
            return;
        }
        if(idx==0 || idx==size)
        {
            insert(val);
            return;
        }
        Node node= new Node(val);
        Node temp=head;
        for(int i=1;i<idx;i++)
        {
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;
        size++;
    }
    public void display()
    {
        Node temp=head;
        while(temp.next!=head)
        {
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.print(temp.val +" -> ");
        System.out.println("End");
    }
    public void size()
    {
        System.out.println(size);
    }
    public void delete(int val)
    {
        if(head.val==val)
        {
            Node temp=head;
            while(temp.next!=head)
            {
                temp=temp.next;
            }
            temp.next=head.next;
            head=head.next;
            size--;
            return;
        }
        Node node=head;
        do{
            if(node.next.val==val)
                break;
            node=node.next;
        }while(node!=head);
        node.next=node.next.next;
        size--;
    }
}
