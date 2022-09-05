package com.company.LinkList;

public class DL
{
    private Node head;
    private int size;
    public DL()
    {
        this.size=0;
    }
    private class Node
    {
        private int val;
        private Node next;
        private Node prev;

        public Node(int val)
        {
           this.val=val;
        }
        public Node(int val,Node next,Node prev)
        {
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }
    public void insertFirst(int val)
    {
        Node node = new Node(val);
        if(head==null)
        {
           head=node;
           size++;
           return;
        }
        node.next=head;
        head.prev=node;
        head=node;
        size++;
    }
    public void insertLast(int val)
    {
        Node node = new Node(val);
        if(head==null)
        {
            head=node;
            size++;
            return;
        }
        Node temp=head;
        for(int i=1;i<size;i++)
        {
            temp=temp.next;
        }
        temp.next=node;
        node.prev=temp;
        size++;
    }
    public void insert(int val,int idx)
    {
        if(idx==0)
        {
            insertFirst(val);
            return;
        }
        else if(idx==size)
        {
            insertLast(val);
            return;
        }
        Node node = new Node(val);
        Node temp=head;
        for(int i=1;i<idx;i++)
        {
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;
        node.prev=temp;
        temp=node.next;
        temp.prev=node;
        size++;
    }
    public void display()
    {
        Node temp=head;
        System.out.print(temp.val +"-> ");
        for(int i=1;i<size;i++)
        {
            temp=temp.next;
            System.out.print(temp.val+"-> ");
        }
        System.out.println("End");
    }
    public int size()
    {
        return size;
    }
    public void displayReverse()
    {
        Node temp=head;
        for(int i=1;i<size;i++)
        {
            temp=temp.next;
        }
        System.out.print(temp.val + "-> ");
        while(temp.prev!=null)
        {
            temp=temp.prev;
            System.out.print(temp.val + "-> ");
        }
        System.out.println("END");
    }
    public void insertParticular(int after,int val)
    {
        Node node=new Node(val);
        Node temp=head;
        Node p=null;
        while(temp.next!=null)
        {
            if(temp.val==after)
            {
                p=temp;
                break;
            }
            temp=temp.next;
        }
        if(p==null)
        {
            System.out.println("Number does not exist inside the LinkList");
            return;
        }
        if(p.next==null)
        {
            node.prev=p;
            p.next=node;
        }
        else
        {
            node.next=p.next;
            node.prev=p;
            p.next=node;
            node.next.prev=node;
        }
        size++;
    }
}
