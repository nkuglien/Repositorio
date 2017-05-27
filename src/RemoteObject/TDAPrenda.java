package RemoteObject;

import java.rmi.Remote;
import java.rmi.RemoteException;

import DTO.PrendaDTO;

public interface TDAPrenda extends Remote {

	
	public boolean verificarPrenda(int parseInt) throws RemoteException;

	public void altaPrenda(int parseInt, String text)throws RemoteException;

	public void bajaprenda(int parseInt)throws RemoteException;


	public PrendaDTO solicitarPrendaView(int parseInt) throws RemoteException;


	public void modificarPrenda(PrendaDTO pv, int parseInt) throws RemoteException;

}
