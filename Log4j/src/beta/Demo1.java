package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Demo1 {


	   private static Logger log = LogManager.getLogger(Demo1.class.getName());
		public static void main(String[] args) {
			// TODO Auto-generated method stub

		log.info("info log demo1");
		log.debug("debug log demo1");
		log.error("error log demo1");
		log.fatal("fatal log demo1");
		
		}

}
