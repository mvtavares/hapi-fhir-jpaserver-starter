package br.com.mbamobi.fhir.resourceprovider;

import javax.servlet.http.HttpServletRequest;

import org.hl7.fhir.r4.model.IdType;

import ca.uhn.fhir.jpa.rp.r4.DocumentReferenceResourceProvider;
import ca.uhn.fhir.rest.api.MethodOutcome;
import ca.uhn.fhir.rest.api.server.RequestDetails;

public class RNDSDocumentReferenceResourceProvider extends DocumentReferenceResourceProvider {

	@Override
	public MethodOutcome delete(HttpServletRequest theRequest, IdType theResource, String theConditional,
			RequestDetails theRequestDetails) {
		// TODO Auto-generated method stub
		return super.delete(theRequest, theResource, theConditional, theRequestDetails);
	}
	
}