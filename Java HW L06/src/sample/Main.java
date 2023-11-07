package sample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	    Thread mainThread = Thread.currentThread();

	    System.out.println(mainThread.getName());

	    try {
	      Thread.sleep(3000);
	    } catch (InterruptedException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }

	    System.out.println(mainThread.getId());

	  }

	
	}

