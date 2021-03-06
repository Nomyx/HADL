package serverDetailPackage.sqlquery.glues;

import serverDetailPackage.sqlquery.roles.Callee;
import elements.physicalInterface.glues.Glue;
import elements.physicalInterface.roles.Role;

/**
 * 
 * @author FAGNIEZ Florian and RULLIER Noemie
 * 
 */
public class Glue2 extends Glue {

	/**
	 * Constructor
	 * 
	 * @param name
	 */
	public Glue2(String name) {
		super(name);
	}

	/**
	 * Receive a request
	 * 
	 * @param msg
	 */
	public void receiveRequest(Object msg) {
		System.out.println("[ENTRY] in glue " + this.name);
		for (Role role : this.getRoles()) {
			if (role instanceof Callee) {
				((Callee) role).receiveRequest(msg);
			}
		}
	}

}
