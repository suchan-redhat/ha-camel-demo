import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.v231.segment.PID;

public class PatientLookupService {
    public Message lookupPatient(Message input) throws HL7Exception {
//    	PID pid = (PID)input.get("PID");
//        String patientName = pid.getPid5_PatientName()[0].getMessage().toString();

        System.out.println("MSG:"+input);
        
        return input;
    }
}