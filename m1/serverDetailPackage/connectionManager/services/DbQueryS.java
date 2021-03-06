package serverDetailPackage.connectionManager.services;

import message.Message;
import serverDetailPackage.connectionManager.ports.DbQuery;
import elements.physicalInterface.ports.Port;
import elements.physicalInterface.services.Service;
import enumerations.InterfaceType;
import enumerations.VisibilityType;

/**
 * 
 * @author FAGNIEZ Florian and RULLIER Noemie
 * 
 */
public class DbQueryS extends Service {

	/**
	 * Constructor
	 * 
	 * @param name
	 */
	public DbQueryS(String name) {
		super(name, InterfaceType.Required, VisibilityType.Public);
	}

	/**
	 * Allow the service to send a request
	 * 
	 * @param msg
	 *            The message to receive
	 */
	public void sendRequest(Object msg) {
		System.out.println("[ CALLING SERVICE ]");
		DbQuery usedPort = null;
		for (Port port : this.getUsedPorts()) {
			if (port instanceof DbQuery) {
				usedPort = (DbQuery) port;
			}
		}
		usedPort.receiveRequest((Message) msg);
	}

}