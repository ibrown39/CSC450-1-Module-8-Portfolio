
//I tested this on https://www.onlinegdb.com/online_java_compiler
public class Main {
    public static class exampleThreadClass extends Thread {
        public void run(){
            System.out.println("I am a thread via extends Thread");
        }
        
    }
    
    public static class exampleThreadClass2 implements Runnable{
        public void run(){
            System.out.println("I am a thread via implementing Runnable");
        }
    }
    
    public static class exampleThreadClass3 implements Runnable{
        public void run(){
            System.out.println("I am a thread via implementing Runnable and using an object");
        }
    }

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		(new exampleThreadClass()).start(); //t1
		Thread t2 = new Thread(new exampleThreadClass2());
		exampleThreadClass3 eTC3 = new exampleThreadClass3();
		Thread t3 = new Thread(eTC3);
		
		
}
}
