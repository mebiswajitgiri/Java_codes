package com.company.LinkList;

public class LL2
{
    public class LLException extends Exception
    {
        public LLException(String message)
        {
            super(message);
        }
    }
    private Node head;
    int size;
    public LL2()
    {
        this.head=null;
        this.size=0;
    }
    private class Node
    {
        private int val;
        private Node next;
        public Node(int val)
        {
            this.val=val;
        }
        public Node(int val,Node next)
        {
            this.val=val;
            this.next=next;
        }
    }
    public void insert(int val)
    {
        Node node = new Node(val);
        if(this.head==null)
        {
            this.head=node;
            size++;
            return;
        }
        Node temp;
        temp=head;
        for(int i=1;i<size;i++)
        {
            temp=temp.next;
        }
        temp.next=node;
        size++;

    }
    public void insert(int val,int idx) throws Exception
    {
        if(idx>size)
        {
            throw new  LLException("Index shouldn't be greater than the size");
        }
        if(idx<0)
        {
            throw new LLException("Index shouldn't be a negative number");
        }
        Node node = new Node(val);
        if(idx==0)
        {
            node.next=head;
            head=node;
            size++;
            return;
        }
        if(idx>=size)
        {
            insert(val);
            return;
        }
        Node temp;
        temp=head;
        for(int i=1;i<idx;i++)
        {
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;
        size++;
    }
    public void delete()
    {
        if(size==1)
        {
            head=null;
            size--;
            return;
        }
        Node temp;
        temp=head;
        for(int i=1;i<size-1;i++)
        {
           temp=temp.next;
        }
        temp.next=null;
        size--;
    }
    public void delete(int idx) throws Exception
    {
        if(idx>size)
        {
            throw new LLException("Index shouldn't be greater than size");
        }
        if(idx<0)
        {
            throw new LLException("Index shouldn't be a negative number");
        }
        if(idx==0)
        {
            head=head.next;
            size--;
            return;
        }
        if(idx==size-1)
        {
            delete();
            return;
        }
        Node temp;
        temp=head;
        for(int i=1;i<idx;i++)
        {
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
    }
    public void display()
    {
        Node temp;
        temp=head;
        System.out.print(temp.val +"-> ");
        for(int i=1;i<size;i++)
        {
            temp=temp.next;
            System.out.print(temp.val+"-> ");
        }
        System.out.println("END");
    }
    public int size()
    {
        return size;
    }
    public int get(int idx) throws Exception
    {
        if(idx>size)
        {
            throw new LLException("Index shouldn't be greater than size");
        }
        if(idx<0)
        {
            throw new LLException("Index shouldn't be a negative number");
        }
        if(idx==0)
        {
            return head.val;
        }
        Node temp=head;
        for(int i=1;i<idx+1;i++)
        {
            temp=temp.next;
        }
        return temp.val;
    }
}
