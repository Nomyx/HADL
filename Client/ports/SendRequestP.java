package ports;

import elements.SynchronPort;
import enumerations.InterfaceType;

public class SendRequestP extends SynchronPort{
	public InterfaceType m_interface;
	
	public SendRequestP(){
		this.m_interface = InterfaceType.Provided;
	}
}
