package br.com.mbamobi.fhir.model;

import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.StringType;

import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Extension;
import ca.uhn.fhir.model.api.annotation.ResourceDef;

/**
 * Definition class for adding extensions to the built-in Patient resource type.
 * Note the "profile" attribute below, which indicates the URL/ID of the profile
 * implemented by this resource. You are not required to supply this, but if you
 * do it will be automatically populated in the resource meta tag if the
 * resource is returned by a server.  
 */
@ResourceDef(name = "Patient", profile = "http://rnds.saude.gov.br/fhir/r4/StructureDefinition/rnds-patient-1.0")
public class RNDSPatient extends Patient {

	@Child(name = "petName")
	@Extension(url = "http://example.com/dontuse#petname", definedLocally = false, isModifier = true)
	@Description(shortDefinition = "The name of the patient's favourite pet")
	private StringType myPetName;

	public StringType getMyPetName() {
		return myPetName;
	}

	public void setMyPetName(StringType myPetName) {
		this.myPetName = myPetName;
	}

}
