package com.lab.test;

import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.lab.conf.RELoadConfig;
import com.lab.main.REBotLogin;

public class test {
	
	public test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ScheduledExecutorService scheduler;
		
		RELoadConfig config = RELoadConfig.getInstance();   	    
    	REBotLogin task = new REBotLogin();
    	task.MainThread();
    	//Calendar date = Calendar.getInstance();
    	//date.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY);
    	//date.set(Calendar.HOUR, 0);
    	//date.set(Calendar.MINUTE, 0);
    	//date.set(Calendar.SECOND, 0);
    	//date.set(Calendar.MILLISECOND, 0);
    	//timer.schedule(new SampleTask(new Thread(myClass)), new Date(), 60000);
//    	scheduler = Executors.newSingleThreadScheduledExecutor();
//    	scheduler.scheduleAtFixedRate(task, 0, Integer.parseInt(config.getParameterValue("checkdelayseconds")), TimeUnit.SECONDS);
    	
    	
	}

}
