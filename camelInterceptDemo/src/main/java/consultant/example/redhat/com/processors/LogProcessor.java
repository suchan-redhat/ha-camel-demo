package consultant.example.redhat.com.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogProcessor implements Processor {
	private static final Logger logger 
    = LoggerFactory.getLogger("LOG-INTERCEPT");
	@Override
	public void process(Exchange inExchange) throws Exception {
		java.util.LinkedList histories = (java.util.LinkedList) inExchange.getProperty("CamelMessageHistory");
		org.apache.camel.impl.DefaultMessageHistory historyItem = (org.apache.camel.impl.DefaultMessageHistory) histories.get(histories.size() - 2);
		logger.info("ROUTE: "+inExchange.getFromRouteId()
		         +", STEP: " + historyItem.getNode()
		         + ", HEADERS: "+ inExchange.getIn().getHeaders()
		         + ", BODY: "+(inExchange.getIn().getBody() == null?"EMPTYBODY":inExchange.getIn().getBody().getClass().getName())  );
	}

}
