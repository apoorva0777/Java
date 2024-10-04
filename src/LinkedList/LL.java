package LinkedList;

import java.util.Scanner;

public class LL {
    class node
    {
        int data;
        node next;
        node(int d)
        {
            this.data=d;
            this.next=null;
        }
    }
    node head=null;
    node temp=null;
    public void ins(int d)
    {
        node nn=new node(d);
        if(this.head==null)
        {
            this.head=nn;
            this.temp=nn;
        }
        else
        {
            this.temp.next=nn;
            this.temp=nn;
        }
    }
    public void dis()
    {
        node t=this.head;
        while(t!=null)
        {
            System.out.println(t.data);
            t=t.next;
        }
    }
    public static void main(String[] args) {
        Scanner z= new Scanner(System.in);
        LL o=new LL();
        while(z.hasNext())
        {
            int n=z.nextInt();
            o.ins(n);
        }
        o.dis();
    }
}
