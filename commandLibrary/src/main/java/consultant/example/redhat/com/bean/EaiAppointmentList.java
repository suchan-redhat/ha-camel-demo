package consultant.example.redhat.com.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "eaiAppointment" })
public class EaiAppointmentList  implements Serializable{

	@JsonProperty("eaiAppointment")
	private List<EaiAppointment> eaiAppointment = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("eaiAppointment")
	public List<EaiAppointment> getEaiAppointment() {
		return eaiAppointment;
	}

	@JsonProperty("eaiAppointment")
	public void setEaiAppointment(List<EaiAppointment> eaiAppointment) {
		this.eaiAppointment = eaiAppointment;
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