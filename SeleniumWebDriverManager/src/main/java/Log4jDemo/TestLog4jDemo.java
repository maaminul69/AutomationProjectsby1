package Log4jDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestLog4jDemo {
private static final Logger log = LogManager.getLogger(TestLog4jDemo.class);

public static void main(String[] args) {
//	processData();
	System.out.println("\n ....Hellow World.....\n");
	log.trace("From trace method");
//	log.debug("From debug method");
	log.info("From info method");
	log.warn("From warn method");
	log.error("From error method");
	log.fatal("From fatal method");
	
	System.out.println("completed");
}
//	public static void processData() {
//		
//		System.out.println("\n ....Hellow World.....\n");
//		log.trace("From trace method");
//		log.debug("From debug method");
//		log.info("From info method");
//		log.warn("From warn method");
//		log.error("From error method");
//		log.fatal("From fatal method");
//		
//		//.. read inputs
//		//.. validate them
//		//..store in db
//		//.. return results
//	}
}
