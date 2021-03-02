package consultant.example.redhat.com.bean;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SearchHospitalPatientWithCaseByHKIDPatientKeyCase")
@XmlAccessorType (XmlAccessType.FIELD)
public class SearchHospitalPatientWithCaseByHKIDPatientKeyCase  {
	
	 	@XmlElement(name="PatientNokCaseListResult")
		private PatientNokCaseListResult patientNokCaseListResult;

		public PatientNokCaseListResult getPatientNokCaseListResult() {
			return patientNokCaseListResult;
		}

		public void setPatientNokCaseListResult(PatientNokCaseListResult patientNokCaseListResult) {
			this.patientNokCaseListResult = patientNokCaseListResult;
		}
	
}
