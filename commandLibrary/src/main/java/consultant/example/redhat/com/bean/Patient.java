package consultant.example.redhat.com.bean;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "patient")
@XmlAccessorType (XmlAccessType.FIELD)
public class Patient {
	
	private Address address;
	@XmlElement(name="CCCode1")
	private String cCCode1;
	@XmlElement(name="CCCode2")
	private String cCCode2;
	@XmlElement(name="CCCode3")
	private String cCCode3;
	@XmlElement(name="CCCode4")
	private String cCCode4;
	@XmlElement(name="CCCode5")
	private String cCCode5;
	@XmlElement(name="CCCode6")
	private String cCCode6;
	private String chineseName;
	private String confidentialFlag;
	@XmlElement(name="DOB")
	private String dOB;
	private String deathIndicator;
	private String exactDOBFlag;
	@XmlElement(name="HKID")
	private String hKID;
	private String hkicSymbol;
	private String key;
	private String maritalStatus;
	private String name;
	private String race;
	private String religion;
	private String sex;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getcCCode1() {
		return cCCode1;
	}
	public void setCCCode1(String cCCode1) {
		this.cCCode1 = cCCode1;
	}
	public String getcCCode2() {
		return cCCode2;
	}
	public void setCCCode2(String cCCode2) {
		this.cCCode2 = cCCode2;
	}
	public String getcCCode3() {
		return cCCode3;
	}
	public void setCCCode3(String cCCode3) {
		this.cCCode3 = cCCode3;
	}
	public String getcCCode4() {
		return cCCode4;
	}
	public void setCCCode4(String cCCode4) {
		this.cCCode4 = cCCode4;
	}
	public String getcCCode5() {
		return cCCode5;
	}
	public void setCCCode5(String cCCode5) {
		this.cCCode5 = cCCode5;
	}
	public String getcCCode6() {
		return cCCode6;
	}
	public void setCCCode6(String cCCode6) {
		this.cCCode6 = cCCode6;
	}
	public String getChineseName() {
		return chineseName;
	}
	public void setChineseName(String chineseName) {
		this.chineseName = chineseName;
	}
	public String getConfidentialFlag() {
		return confidentialFlag;
	}
	public void setConfidentialFlag(String confidentialFlag) {
		this.confidentialFlag = confidentialFlag;
	}
	public String getDOB() {
		return dOB;
	}
	public void setDOB(String dOB) {
		this.dOB = dOB;
	}
	public String getDeathIndicator() {
		return deathIndicator;
	}
	public void setDeathIndicator(String deathIndicator) {
		this.deathIndicator = deathIndicator;
	}
	public String getExactDOBFlag() {
		return exactDOBFlag;
	}
	public void setExactDOBFlag(String exactDOBFlag) {
		this.exactDOBFlag = exactDOBFlag;
	}
	public String getHKID() {
		return hKID;
	}
	public void setHKID(String hKID) {
		this.hKID = hKID;
	}
	public String getHkicSymbol() {
		return hkicSymbol;
	}
	public void setHkicSymbol(String hkicSymbol) {
		this.hkicSymbol = hkicSymbol;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getFirstName() {
		return name.substring(0,name.indexOf(',')).trim();
	}
	public String getLastName() {
		return name.substring(name.indexOf(',')+1,name.length()).trim();
	}
}
