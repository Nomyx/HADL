package roles;

import message.Message;
import elements.physicalInterface.glues.Glue;
import elements.physicalInterface.roles.Role;
import enumerations.InterfaceType;
import enumerations.VisibilityType;
import glues.Glue1;

/**
 * 
 * @author FAGNIEZ Florian and RULLIER Noemie
 * 
 */
public class Caller extends Role {

	public Caller(String name) {
		super(name, InterfaceType.Required, VisibilityType.Public);
	}

	public void receiveData(Object msg) {
		System.out.println("[ENTRY] in role " + this.name);
		for (Glue glue : this.getGlues()) {
			if (glue instanceof Glue1) {
				((Glue1) glue).receiveRequest(msg);
			}
		}
	}
}
