package mh.osgitest;


/**
 * 
 * @scr.component
 * @scr.service interface="SampleService"
 */
public class SampleServiceImpl implements SampleService {
	public String sayHello() {
		return "Hello 4th World! This is the hotfix";
	}
}
