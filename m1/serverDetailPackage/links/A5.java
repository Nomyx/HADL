package serverDetailPackage.links;

import serverDetailPackage.database.ports.SecurityManagement;
import serverDetailPackage.securityquery.roles.Requestor;
import elements.links.AttachmentLink;
import exceptions.NewAttachmentNotAllowed;

/**
 * This class provides an implementation for an attachment link A5 It
 * establishes a link between the Database Component and SecurityQuery
 * PrimitivConnector
 * 
 * @author FAGNIEZ Florian and RULLIER Noemie
 */
public class A5 extends AttachmentLink {

	/**
	 * Constructor
	 * 
	 * @param name
	 *            The name of the Attachment link
	 * @param fromPortComp
	 *            The port component
	 * @param toRoleConn
	 *            The role connector
	 * @throws NewAttachmentNotAllowed
	 */
	public A5(String name, SecurityManagement fromPortComp, Requestor toRoleConn)
			throws NewAttachmentNotAllowed {
		super(name, fromPortComp, toRoleConn);
	}

}
