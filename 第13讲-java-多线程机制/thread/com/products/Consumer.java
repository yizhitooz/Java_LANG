package com.products;

public class Consumer extends Thread {
	  private Share shared;
	  private int number;
	  public Consumer(Share s, int number) {
	    shared=s;
	    this.number=number;
	  }
	  public void run() {
		    int value = 0;
		    for (int i=0; i<10; i++) {
		      value=shared.get();
		      //System.out.println("������"+this.number+"  �õ�������Ϊ��"+value);
		    }
		  }
		}

