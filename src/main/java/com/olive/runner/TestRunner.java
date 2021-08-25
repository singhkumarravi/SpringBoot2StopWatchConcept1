package com.olive.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
@Component
public class TestRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("runner started.....");
          StopWatch st = new	StopWatch("my local Stopwatch");
          st.start("#1 time");
          Thread.sleep(2000);
          st.stop();
          
          st.start("#2 time");
          Thread.sleep(5000);
          st.stop();
          
          st.start("#3 time");
          Thread.sleep(3000);
          st.stop();
          System.out.println(st.prettyPrint());
         System.out.println("Total milisecond "+st.getTotalTimeMillis());
         System.out.println("Total nanosecond "+st.getTotalTimeNanos());

	}

}
