package pgv;

public class Barrera {
	
	int count = 0;
	
	 mutex.wait();
	 count += 1;
	 if count == n:turnstile.signal(n); 
	 mutex.signal();
	
	 turnstile.wait();
	
	
	
	 mutex.wait();
	 count -= 1;
	 if count == 0:turnstile2.signal(n); 
	 mutex.signal();
	
	 turnstile2.wait(); 

}
