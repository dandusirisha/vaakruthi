class Utility {
	int i;
	boolean bool = false;

	public synchronized void set(int i) throws InterruptedException {
		while (bool) {
			wait();
		}
		this.i = i;
		bool = true;
		System.out.println("producer" + i);
		notify();
	}

	public synchronized void get() throws InterruptedException {
		this.i = i;
		bool = false;
		System.out.println("consumer" + i);
		notify();
	}
}

// consumer class
	class Producer implements Runnable {

		private Utility utility;

		public Producer(Utility utility) {
			this.utility = utility;
			Thread producer = new Thread(this, "producer");
			producer.start();
		}

		@Override
		public void run() {
			int i = 0;
			while (true) {
				try {

					utility.set(i++);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}

	}

class Consumer implements Runnable{
	
	private Utility utility;
	public Consumer( Utility utility)
	{
		
		this.utility=utility;
		Thread Consumer=new Thread(this,"consumer");
		Consumer.start();
	}	

	public void run() {
		while (true) {
			try {
				utility.get();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	}

 class ProducerConsumer {
	 public static void main(String[] args) {
		Utility u = new Utility();
		new Producer(u);
		new Consumer(u);
	}
	}
