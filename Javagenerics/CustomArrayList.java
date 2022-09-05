package com.company.Javagenerics;

import java.util.Arrays;

public class CustomArrayList
{
    private  int[] array;
    private int size=0;
    private static int default_length = 10;

    CustomArrayList()
    {
        this.array=new int[default_length];
    }
    CustomArrayList(int length)
    {
        this.array=new int[length];
    }
    private void resize(int[] array)
    {
        int[] newArray=new int[this.array.length*2];
        for(int i=0;i<this.array.length;i++)
        {
            newArray[i]=this.array[i];
        }
    }
    public void add(int num)
    {
        if(size==this.array.length)
        {
            resize(this.array);
        }
        this.array[size++]=num;
    }
    public void add(int idx,int num)
    {
        if(idx<size && size<this.array.length)
        {
            for(int i=size-1;i>=idx;i--)
            {
                this.array[i+1]=this.array[i];
            }
            this.array[idx]=num;
            size++;
        }
       else if(idx<size && size>=this.array.length)
        {
            resize(this.array);
            for(int i=size-1;i>=idx;i--)
            {
                this.array[i+1]=this.array[i];
            }
            this.array[idx]=num;
            size++;
        }
       else if(idx>=size)
        {
            System.out.println("Error");
        }
    }
    public int get(int index)
    {
        if(index>=size)
        {
           return -1;
        }
        else
            return array[index];
    }
    public int size()
    {
        return this.size;
    }
    public void  set(int idx,int num)
    {
        if(idx>=this.size)
            System.out.println("Error");
        else
        {
            this.array[idx]=num;
        }
    }

    @Override
    public String toString() {
        StringBuilder s =new StringBuilder();
        s.append('{');
        for(int i=0;i<this.size;i++)
        {
            s.append(' ');
            s.append(this.array[i]);
            s.append(',');
        }
        s.append('}');
        return s.toString();

    }
}