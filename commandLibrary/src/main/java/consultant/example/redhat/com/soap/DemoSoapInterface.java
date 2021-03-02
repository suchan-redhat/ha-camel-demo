package consultant.example.redhat.com.soap;


import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Use;

import consultant.example.redhat.com.bean.SearchHospitalPatientWithCaseByHKIDPatientKeyCase;
@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT,use=Use.LITERAL)
public interface DemoSoapInterface {
	@WebMethod
	public SearchHospitalPatientWithCaseByHKIDPatientKeyCase searchHospitalPatientWithCaseByHKIDPatientKeyCaseNo(String patientKey, String hospitalCode, String projectCode);

}
