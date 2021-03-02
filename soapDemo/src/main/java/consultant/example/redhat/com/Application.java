/**
 *  Copyright 2005-2016 Red Hat, Inc.
 *
 *  Red Hat licenses this file to you under the Apache License, version
 *  2.0 (the "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied.  See the License for the specific language governing
 *  permissions and limitations under the License.
 */
package consultant.example.redhat.com;

import java.util.ArrayList;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import consultant.example.redhat.com.bean.Address;
import consultant.example.redhat.com.bean.Case;
import consultant.example.redhat.com.bean.Patient;
import consultant.example.redhat.com.bean.PatientNokCaseListResult;
import consultant.example.redhat.com.bean.SearchHospitalPatientWithCaseByHKIDPatientKeyCase;
import consultant.example.redhat.com.soap.DemoSoap;

import org.apache.camel.component.cxf.CxfEndpoint;
import org.apache.camel.component.cxf.DataFormat;
import org.apache.camel.model.dataformat.JaxbDataFormat;


/**
 * A spring-boot application that includes a Camel route builder to setup the Camel routes
 */
@SpringBootApplication
@ImportResource({"classpath:spring/camel-context.xml"})
public class Application extends RouteBuilder {

    // must have a main method spring-boot can run
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void configure() throws Exception {
    	 CxfEndpoint cxfEndpoint = new CxfEndpoint();
         cxfEndpoint.setAddress("http://0.0.0.0:18081/soap");
         cxfEndpoint.setServiceClass(DemoSoap.class);
         cxfEndpoint.setCamelContext(getContext());
         cxfEndpoint.setDataFormat(DataFormat.POJO);
         JaxbDataFormat dataFormat = new JaxbDataFormat();
         dataFormat.setContextPath("consultant.example.redhat.com.bean");
         
         from(cxfEndpoint)
         	.log("request:  ${body}")
         	.process(new Processor() {
         		@Override
    			public void process(Exchange exchange) throws Exception {
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
         			exchange.getOut().setBody(searchHospitalPatientWithCaseByHKIDPatientKeyCase);
         		}
         	})
         	.log("response:  ${body}")
         	;
    }
}
