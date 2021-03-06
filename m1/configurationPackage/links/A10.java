package configurationPackage.links;

import connectorPackage.roles.CalledResponse;
import clientPackage.ports.ReceiveResponseP2;
import elements.links.AttachmentLink;
import exceptions.NewAttachmentNotAllowed;

/**
 * 
 * @author FAGNIEZ Florian and RULLIER Noemie
 * 
 */
public class A10 extends AttachmentLink {

	/**
	 * Constructor
	 * 
	 * @param name
	 * @param fromPortComp
	 * @param calledResponse
	 * @throws NewAttachmentNotAllowed
	 */
	public A10(String name, ReceiveResponseP2 fromPortComp,
			CalledResponse calledResponse) throws NewAttachmentNotAllowed {
		super(name, fromPortComp, calledResponse);
	}
}