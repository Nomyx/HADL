package serverDetailPackage.securityManager.services;

import message.Message;
import serverDetailPackage.securityManager.ports.SecurityAuthorization;
import elements.physicalInterface.ports.Port;
import elements.physicalInterface.services.Service;
import enumerations.InterfaceType;
import enumerations.VisibilityType;

/**
 * 
 * @author FAGNIEZ Florian and RULLIER Noemie
 * 
 */
public class SecurityAuthorizationS extends Service {

	/**
	 * Constructor
	 * 
	 * @param name
	 */
	public SecurityAuthorizationS(String name) {
		super(name, InterfaceType.Provided, VisibilityType.Public);
	}

	/**
	 * Send a request
	 * 
	 * @param msg
	 */
	public void sendRequest(Object msg) {
		System.out
				.println("[ Calling service from SecurityAuthorization to send the request ]");
		SecurityAuthorization usedPort = null;
		for (Port port : this.getUsedPorts()) {
			if (port instanceof SecurityAuthorization) {
				usedPort = (SecurityAuthorization) port;
			}
		}
		usedPort.receiveRequest((Message) msg);
	}

}
