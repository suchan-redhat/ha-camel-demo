package consultant.example.redhat.com.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@Table(name = "EaiAppointment")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "apptSeq", "bookType", "caseNo", "hospital", "patientKey", "slotDateTime", "specialty" })
public class EaiAppointment  implements Serializable {

	@Id
	@JsonIgnore
	private String id;
	public String getId() {
		this.id = patientKey+'-'+apptSeq;
		return patientKey+'-'+apptSeq;
	}

	public void setId(String id) {
		this.id = patientKey+'-'+apptSeq;
	}

	@JsonProperty("apptSeq")
	private String apptSeq;
	@JsonProperty("bookType")
	private String bookType;
	@JsonProperty("caseNo")
	private String caseNo;
	@JsonProperty("hospital")
	private String hospital;
	@JsonProperty("patientKey")
	private String patientKey;
	@JsonProperty("slotDateTime")
	private String slotDateTime;
	@JsonProperty("specialty")
	private String specialty;
	@JsonIgnore
	@Transient
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("apptSeq")
	public String getApptSeq() {
		return apptSeq;
	}

	@JsonProperty("apptSeq")
	public void setApptSeq(String apptSeq) {
		this.apptSeq = apptSeq;
		this.id = patientKey+'-'+apptSeq;
	}

	@JsonProperty("bookType")
	public String getBookType() {
		return bookType;
	}

	@JsonProperty("bookType")
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	@JsonProperty("caseNo")
	public String getCaseNo() {
		return caseNo;
	}

	@JsonProperty("caseNo")
	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

	@JsonProperty("hospital")
	public String getHospital() {
		return hospital;
	}

	@JsonProperty("hospital")
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	@JsonProperty("patientKey")
	public String getPatientKey() {
		return patientKey;
	}

	@JsonProperty("patientKey")
	public void setPatientKey(String patientKey) {
		this.patientKey = patientKey;
		this.id = patientKey+'-'+apptSeq;
	}

	@JsonProperty("slotDateTime")
	public String getSlotDateTime() {
		return slotDateTime;
	}

	@JsonProperty("slotDateTime")
	public void setSlotDateTime(String slotDateTime) {
		this.slotDateTime = slotDateTime;
	}

	@JsonProperty("specialty")
	public String getSpecialty() {
		return specialty;
	}

	@JsonProperty("specialty")
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}