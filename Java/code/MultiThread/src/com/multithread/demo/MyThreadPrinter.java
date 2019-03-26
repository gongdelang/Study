package com.multithread.demo;

public class MyThreadPrinter implements Runnable {   
	  
    private String name;   
    private Object next;   
    private Object self;   
  
    private MyThreadPrinter(String name, Object self, Object next) {   
        this.name = name;   
        this.next = next;   
        this.self = self;   
    }   
  
    @Override  
    public void run(){   
        int count = 10;   
        while (count > 0) {   
            synchronized (self) {   
                synchronized (next) {   
                    System.out.println(Thread.currentThread().getName() + name);   
                    count--;
                    next.notify();
                }
                try {   
                    self.wait();   
                } catch (InterruptedException e) {   
                    e.printStackTrace();   
                }   
            }   
  
        }   
    }   
  
    public static void main(String[] args) throws Exception {   
        Object a = new Object();   
        Object b = new Object();   
        Object c = new Object();   
        Object d = new Object(); 
        MyThreadPrinter pa = new MyThreadPrinter("A", a, b);   
        MyThreadPrinter pb = new MyThreadPrinter("B", b, c);   
        MyThreadPrinter pc = new MyThreadPrinter("C", c, d);   
        MyThreadPrinter pd = new MyThreadPrinter("D", d, a);
           
           
        new Thread(pa).start();
        new Thread(pb).start();
        
        try {
        	Thread.sleep(1000);
        }catch(Exception e) {
        	e.printStackTrace();
        }
        new Thread(pc).start();  
        new Thread(pd).start();
        
    }   
}  