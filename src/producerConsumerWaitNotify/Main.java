/**
 * 
 */
package producerConsumerWaitNotify;

/**
 * @author yangs
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Storage storage = new Storage();

		Thread p1 = new Thread(new Producer(storage));
		Thread p2 = new Thread(new Producer(storage));
		Thread p3 = new Thread(new Producer(storage));

		Thread c1 = new Thread(new Consumer(storage));
		Thread c2 = new Thread(new Consumer(storage));
		Thread c3 = new Thread(new Consumer(storage));

		p1.start();
		p2.start();
		p3.start();
		c1.start();
		c2.start();
		c3.start();
	}

}
