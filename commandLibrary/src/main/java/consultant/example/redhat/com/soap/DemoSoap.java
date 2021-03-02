package consultant.example.redhat.com.soap;
import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Use;

import consultant.example.redhat.com.bean.Address;
import consultant.example.redhat.com.bean.Case;
import consultant.example.redhat.com.bean.Patient;
import consultant.example.redhat.com.bean.PatientNokCaseListResult;
//import consultant.example.redhat.com.bean.Address;
//import consultant.example.redhat.com.bean.Case;
//import consultant.example.redhat.com.bean.Patient;
//import consultant.example.redhat.com.bean.PatientNokCaseListResult;
import consultant.example.redhat.com.bean.SearchHospitalPatientWithCaseByHKIDPatientKeyCase;

@WebService (endpointInterface="consultant.example.redhat.com.soap.DemoSoapInterface")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT,use=Use.LITERAL)
public class DemoSoap implements DemoSoapInterface {

	@WebMethod
	public SearchHospitalPatientWithCaseByHKIDPatientKeyCase searchHospitalPatientWithCaseByHKIDPatientKeyCaseNo(String patientKey, String hospitalCode,
	String projectCode) {
		SearchHospitalPatientWithCaseByHKIDPatientKeyCase  searchHospitalPatientWithCaseByHKIDPatientKeyCase = new SearchHospitalPatientWithCaseByHKIDPatientKeyCase();
			Address address = new Address();
			address.setBuilding("UNKNOWN");
			address.setDistrictCode("UNK");
			address.setFullEnglishAddress("UNKNOWN,  UNKNOWN");
			address.setRecord_id("0");
			Patient patient = new Patient();
			patient.setAddress(address);
			patient.setCCCode1("61531");
			patient.setCCCode2("05431");
			patient.setCCCode3("39381");
			patient.setCCCode4("29741");
			patient.setCCCode5("40161");
			patient.setCCCode6("00861");
			patient.setChineseName("請勿用此病人");
			patient.setConfidentialFlag("N");
			patient.setDOB("DOB");
			patient.setDeathIndicator("N");
			patient.setExactDOBFlag("N");
			patient.setHKID("C5551119");
			patient.setHkicSymbol("A");
			patient.setKey("92611424");
			patient.setMaritalStatus("U");
			patient.setName("RIS AUTOTEST, NEVER USE THIS PATIENT 003");
			patient.setRace("CH");
			patient.setReligion("CHR");
			patient.setSex("F");
			Case case1 = new Case();
			case1.setAdmissionDatetime("20160524 15:42");
			case1.setHospitalCode("VH");
			case1.setNumber("HN16000232S");
			case1.setPatientType("EP1");
			case1.setSourceCode("VH");
			case1.setSourceIndicator("3");
			case1.setSpecialty("MED");
			case1.setType("I");
			case1.setWardClass("3");
			case1.setWardCode("5C");
			ArrayList<Case> caseList = new ArrayList<Case>();
			caseList.add(case1);
			PatientNokCaseListResult patientNokCaseListResult = new PatientNokCaseListResult();
			patientNokCaseListResult.setCaseList(caseList);
			patientNokCaseListResult.setPatient(patient);
			searchHospitalPatientWithCaseByHKIDPatientKeyCase.setPatientNokCaseListResult(patientNokCaseListResult);
			
		return searchHospitalPatientWithCaseByHKIDPatientKeyCase;
	}

}
