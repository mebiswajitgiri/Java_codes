package com.company.Javagenerics;

public class MyArrayList<T>
{
    private  Object[] array;
    private int size=0;
    private static int default_length = 10;

   public MyArrayList()
    {
        this.array=new Object[default_length];
    }
    public MyArrayList(int length)
    {
        this.array=new Object[length];
    }
    private void resize(Object[] array)
    {
        Object[] newArray=new Object[this.array.length*2];
        for(int i=0;i<this.array.length;i++)
        {
            newArray[i]=this.array[i];
        }
        this.array=newArray;
    }
    public void add(T num)
    {
        if(size==this.array.length)
        {
            resize(this.array);
        }
        this.array[size++]=num; // Upcasting
    }
    public void add(int idx,T num)
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
    public T get(int index)
    {
        if(index>=size)
        {
            return null;
        }
        else
            return (T)(array[index]);
    }
    public int size()
    {
        return this.size;
    }
    public void  set(int idx,T num)
    {
        if(idx>=this.size)
            System.out.println("Error");
        else
        {
            this.array[idx]=num;
        }
    }


}
