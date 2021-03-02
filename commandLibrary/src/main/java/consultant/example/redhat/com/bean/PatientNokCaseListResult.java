package consultant.example.redhat.com.bean;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PatientNokCaseListResult")
@XmlAccessorType (XmlAccessType.FIELD)
public class PatientNokCaseListResult {
	public List<Case> getCaseList() {
		return caseList;
	}
	public void setCaseList(List<Case> caseList) {
		this.caseList = caseList;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	@XmlElement(name="caseList")
	private List<Case> caseList;
	
	@XmlElement(name="patient")
	private Patient patient;
}
