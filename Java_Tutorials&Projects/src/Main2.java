import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import Tools.Toolbox;

public class Main2 {

	public static void main(String[] args) throws InterruptedException {
		
		//		82------------------------
		// In prj Serializer & Deserializer
		
		//		83------------------------
		//Timer timer = new Timer();
		
		/*TimerTask task = new TimerTask() {
			int counter = 10;
			@Override
			public void run() {
				if (counter > 0) {
					System.out.println(counter + " seconds");
					counter--;
				}
				else {
					System.out.println("HAPPY NEW YEAR!");
					timer.cancel();
				}
			}
		};*/
		
		/*Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, 2022);
		date.set(Calendar.MONTH, Calendar.AUGUST);
		date.set(Calendar.DAY_OF_MONTH, 30);
		date.set(Calendar.HOUR_OF_DAY,17);
		date.set(Calendar.MINUTE, 40);
		date.set(Calendar.SECOND, 20);
		date.set(Calendar.MILLISECOND, 0);*/
		
		//timer.schedule(task, 1000); // 2nd parameter - delay time (millisecond)
		//timer.schedule(task, date.getTime());
		//timer.scheduleAtFixedRate(task, 0, 1000);
		//timer.scheduleAtFixedRate(task, date.getTime(), 1000);
		
		//		84------------------------
		//System.out.println(Thread.activeCount());
		//Thread.currentThread().setName("MAINNNNNN");
		//System.out.println(Thread.currentThread().getName());
		
		//Thread.currentThread().setPriority(1); // 1->10 - The higher the more important
		//System.out.println(Thread.currentThread().getPriority());
		
		//System.out.println(Thread.currentThread().isAlive());
		
		
		/*for (int i = 3; i > 0; i--) {
			System.out.println(i);
			Thread.sleep(1000); // alike~ delay time to execute :)
		}
		System.out.println("You are done!");
		System.out.println("Or not :)");*/
		
		//MyThread thread2 = new MyThread();
		
		//thread2.setDaemon(true);
		//System.out.println(thread2.isDaemon());
		//thread2.start();
		//System.out.println(thread2.isAlive());
		
		//thread2.setName("2nd thread");
		//System.out.println(thread2.getName());
		
		//System.out.println(thread2.getPriority());
		
		//System.out.println(Thread.activeCount());
		
		//		85------------------------
	 	// Create a subclass of Thread
		//MyThread thread1 = new MyThread();
		
		//or
		
		//implement Runnable interface and pass instance as an argument to Thread()
		//MyRunnable runnable1 = new MyRunnable();
		//Thread thread2 = new Thread(runnable1);
		
		//thread1.setDaemon(true);
		//thread2.setDaemon(true);
		
		//thread1.start();
		//thread1.join(3000); //calling thread (ex.main) waits until the specified thread dies or for x milliseconds
		//thread2.start();
		
		//System.out.println(1/0);
		
		//		86------------------------
		//Toolbox toolbox = new Toolbox();
		
		//		87------------------------
		//		88------------------------
		//		89------------------------
		//EncryptionProgram ep = new EncryptionProgram();
		
		//		90------------------------		
		//new TextEditor();
		
		//		91------------------------
		//new MyClock();
		
		//		92------------------------
		//new StopWatch();
		
		//		93------------------------
		//new Calculator();
		
		//		94------------------------
		// IDandPasswords + LoginPage + WelcomePage
		//IDandPasswords idandPasswords = new IDandPasswords();
		
		//LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());
		
		//		95------------------------
		//TicTacToe tictactoe = new TicTacToe();
		
		//		96------------------------
		//Quiz quiz = new Quiz();
		
		//		97------------------------
		//new SnakeGameFrame();
		
		//		98------------------------
		new PongGameFrame();
		
	}

}
