
public class Main {
    public static class exampleThreadClass1 extends Thread {
        public void run(){
            System.out.println("I am a thread via (new exampleThreadClass1()).start(); and extend thread");
        }
        
    }
    
     public static class exampleThreadClass2 implements Runnable {
        public void run(){
            System.out.println("I am a thread via (new Thread(new exampleThreadClass2())).start(); and implementing runnable");
        }
        
    }
    
    public static class exampleThreadClass3 implements Runnable{
        public void run(){
            System.out.println("I am a thread via Thread t3 = new Thread(new exampleThreadClass3()); and implementing Runnable");
        }
    }
    
    public static class exampleThreadClass4 implements Runnable{
        public void run(){
            System.out.println("I am a thread via implementing Runnable and using an object (eTC4)");
        }
    }
    
    public static class exampleThreadClass5 extends Thread{
        public void run(){
            System.out.println("I am a thread via extend Thread and using an object (eTC5)");
        }
    }
    public static class exampleThreadClass6 extends Thread{
        public void run(){
            System.out.println("I am a thread via extend Thread, using an object (t6), and t6.start()");
        }
    }

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		(new exampleThreadClass1()).start(); //t1
		(new Thread(new exampleThreadClass2())).start(); //t2
		Thread t3 = new Thread(new exampleThreadClass3()); //t3
		exampleThreadClass4 eTC4 = new exampleThreadClass4(); //obj that is instance of exampleThreadClass3
		Thread t4 = new Thread(eTC4); //t4
		exampleThreadClass5 eTC5 = new exampleThreadClass5();//obj that is instance of exampleThreadClass5
		Thread t5 = new Thread(eTC5);//t5, creating an instance of Thread using the eTC5 obj
		exampleThreadClass6 t6 = new exampleThreadClass6();
		t6.start(); //exampleThreadClass6 is already an instance of Thread, and t6 an isntance of exampleThreadClass6
		new Thread(() -> {System.out.println("I am a thread via instance of thread and lamba");}).start(); //t7
		Thread t8 = new Thread(() -> {System.out.println("I am a thread via instance of thread, t8, and lamba");}); //creating t8, an instance of thread, using lambda with the () being the action the thread executes.
		t8.start(); //t8
		
}
}
