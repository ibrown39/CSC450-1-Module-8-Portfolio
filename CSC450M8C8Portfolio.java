
public class CSC450M8C8Portfolio {
	public static class upCount implements Runnable {
	    public void run() {
	        for (int i=0; i<=20; i++){
	            System.out.printf("%s\n", i);
	        }
	    }
	}
	    public static class downCount implements Runnable {
	        public void run() {
	            for (int i=20; i>=0; i--){
	            	System.out.printf("%s\n", i);
	            }
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread upThread = new Thread(new upCount());
		Thread downThread = new Thread(new downCount());
		
		upThread.start();//start upThread now.
		
		try {
			upThread.join(); //start downThread once upThread is dead.
		} catch(InterruptedException ie) {
			System.out.println("Interrupted Exception"+ie);
			ie.printStackTrace();
		}
		
		downThread.start();//start upThread now.
		
		try {
			downThread.join(); //start a next thread once downThread is dead.
		} catch(InterruptedException ie) {
			System.out.println("Interrupted Exception"+ie);
			ie.printStackTrace();
		}
	}

}
