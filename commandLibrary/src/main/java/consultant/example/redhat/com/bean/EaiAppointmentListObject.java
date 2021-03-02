package consultant.example.redhat.com.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"eaiAppointmentList",
"error"
})
public class EaiAppointmentListObject  implements Serializable{

@JsonProperty("eaiAppointmentList")
private EaiAppointmentList eaiAppointmentList;
@JsonProperty("error")
private String error;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("eaiAppointmentList")
public EaiAppointmentList getEaiAppointmentList() {
return eaiAppointmentList;
}

@JsonProperty("eaiAppointmentList")
public void setEaiAppointmentList(EaiAppointmentList eaiAppointmentList) {
this.eaiAppointmentList = eaiAppointmentList;
}

@JsonProperty("error")
public String getError() {
return error;
}

@JsonProperty("error")
public void setError(String error) {
this.error = error;
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