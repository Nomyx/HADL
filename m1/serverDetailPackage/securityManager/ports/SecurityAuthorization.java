package serverDetailPackage.securityManager.ports;

import elements.physicalInterface.ports.SynchronPort;
import enumerations.InterfaceType;
import enumerations.VisibilityType;

/**
 * 
 * @author FAGNIEZ Florian and RULLIER Noemie
 * 
 */
public class SecurityAuthorization extends SynchronPort {

	/**
	 * Constructor
	 * 
	 * @param name
	 */
	public SecurityAuthorization(String name) {
		super(name, InterfaceType.Provided, VisibilityType.Public);
	}

	/**
	 * Receive a request
	 * 
	 * @param msg
	 */
	public void receiveRequest(Object msg) {
		System.out.println("[ENTRY] in port " + this.name);
		setChanged();
		notifyObservers(msg);
	}

}
