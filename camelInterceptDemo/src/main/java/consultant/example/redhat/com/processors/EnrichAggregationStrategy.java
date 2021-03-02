package consultant.example.redhat.com.processors;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

import consultant.example.redhat.com.bean.EaiAppointment;

public class EnrichAggregationStrategy implements AggregationStrategy {

	@Override
	public Exchange aggregate(Exchange oldEx, Exchange newEx) {
		// TODO Auto-generated method stub
		String body = newEx.getIn().getBody(String.class);
		oldEx.getIn().setBody(body);
		return oldEx;
	}

}
