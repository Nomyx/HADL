package serverDetailPackage.database.ports;

import elements.physicalInterface.ports.SynchronPort;
import enumerations.InterfaceType;
import enumerations.VisibilityType;

/**
 * 
 * @author FAGNIEZ Florian and RULLIER Noemie
 * 
 */
public class Query extends SynchronPort {

	/**
	 * Constructor
	 * @param name
	 */
	public Query(String name) {
		super(name, InterfaceType.Provided, VisibilityType.Public);
	}

	/**
	 * Receive data from a service
	 * 
	 * @param msg
	 */
	public void receiveData(Object msg) {
		System.out.println("[ENTRY] in port " + this.name);
		setChanged();
		notifyObservers(msg);
	}
}
