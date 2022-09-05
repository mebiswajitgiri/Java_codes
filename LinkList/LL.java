package com.company.LinkList;

public class LL
{
    private Node head;
    private Node tail;
    private int size;
    public LL()
    {
        this.size=0;
    }
    public void size()
    {
        System.out.println("size is "+size);
    }
    public void insertFirst(int value)
    {
        Node node = new Node(value);
        if(this.size==0)
        {
            node.next=null;
            this.head=node;
            this.tail=node;
        }
        else
        {
            node.next=this.head;
            this.head=node;
        }
        size++;
    }
    public void insert(int value)
    {
        Node node = new Node(value);
        if(size==0)
        {
            node.next=null;
            this.head=node;
            this.tail=node;
        }
        else
        {
            this.tail.next=node;
            this.tail=node;
            node.next=null;
        }
        size++;
    }
    public void insert(int value,int idx)
    {
        if(idx==0)
        {
            insertFirst(value);
            return;
        }
        else if(idx>size-1)
        {
            insert(value);
            return;
        }
        Node node = new Node(value);
        Node temp=head;
        int count=0;
        while(count<idx-1)
        {
            temp=temp.next;
            count++;
        }
        node.next=temp.next;
        temp.next=node;
        size++;
    }
    public void display()
    {
        Node temp=this.head;
        while(temp !=null)
        {
            System.out.print(temp.value + "-> ");
            temp=temp.next;
        }
        System.out.println("END");

    }
    public void delFirst()
    {
        this.head=this.head.next;
        if(this.head==null)
            this.tail=null;
        size--;
    }
    public void delLast()
    {
        Node temp;
        temp=this.head;
        for(int i=1;i<size-1;i++)
        {
            temp=temp.next;
        }
        this.tail=temp;
        tail.next=null;
        size--;
    }
    public void delete(int idx)
    {
        if(idx==0)
        {
            delFirst();
            return;
        }
        if(idx==size-1)
        {
            delLast();
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
    public int getFirst()
    {
        return head.value;
    }
    public int getLast()
    {
        return tail.value;
    }
    public int get(int idx)
    {
        if(idx==0)
        {
          return getFirst();
        }
        else if(idx==size-1)
            return getLast();

        Node temp;
        temp=head;
        for(int i=0;i<idx;i++)
        {
            temp=temp.next;
        }
        return temp.value;
    }

    private class Node
    {
        private int value;
        private Node next;
        public Node(int value)
        {
            this.value= value;
        }
        public Node(int value,Node next)
        {
            this.value=value;
            this.next=next;
        }
    }
}
