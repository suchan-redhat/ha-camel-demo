package consultant.example.redhat.com.processors;

import java.util.List;

import consultant.example.redhat.com.bean.EaiAppointment;
import consultant.example.redhat.com.bean.EaiAppointmentListObject;

public class SpiltEaiAppointmentBean {

	public List<EaiAppointment> spiltEaiAppointment(EaiAppointmentListObject body){
		return body.getEaiAppointmentList().getEaiAppointment();
	}
}
