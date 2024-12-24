package org.systemClass;

public class SystemDemo {
	public static void main(String[] args){
		String userHome=System.getProperty("User.home");
		System.out.println(userHome);//or
		
		//checking specific property
		System.out.println("System user dir: "+System.getProperty("User.home"));
		System.out.println("Current Working dir: "+System.getProperty("User.dir"));
		
		//Clearing this property
		System.clearProperty("user.home");
		System.out.println(System.getProperty("User.home"));//null
		
		//Setting specific property
		System.setProperty("user.home","F:\\GitAutomation\\MorningBatch1");
		System.out.println("Updated System User Dir:"+System.getProperty("User.home"));
		
		//Setting Specific property
		System.setProperty("user,country","IND");
		
		//Checking Property Other than System Property
		//illustrating getProperty(String key,String def)
		System.out.println("Other than System Property:"+System.getProperty("user.password")+"None of your buisness");
		System.out.println("difference between the current time and midnight,January 1,1970 UTC is: "+System.currentTimeMillis());
		System.out.println("Current time in nano sec: "+System.nanoTime());
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("os.version"));
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.getProperty("user.home"));
		System.err.println("This is an error msg");
	}
}
