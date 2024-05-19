package com.vaakruthi.threads;

public class Reservebirts implements Runnable {
	int available = 1;
	int wanted;

	public Reservebirts(int wanted) {
this.wanted=wanted;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(this)
		{
			System.out.println("available BIRRHS ="+available);
			if(available >=wanted)
			{
				String name=Thread.currentThread().getName();
				System.out.println(wanted +"breths reserved for"+name);
				try {
					Thread.sleep(1500);
					available=available-wanted;
				}
				catch(Exception e) {
					e.printStackTrace();
				}
					
				}
			
				else
				{
					System.out.println("Sorry no berths available");
				}
				}
				
			}

	public void start() {
		// TODO Auto-generated method stub
		
	}
}
