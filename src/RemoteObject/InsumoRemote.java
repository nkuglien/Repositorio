package RemoteObject;

import java.rmi.Remote;
import java.rmi.RemoteException;

import DTO.InsumoDTO;

public interface InsumoRemote extends Remote {

	
	public boolean verificarInsumo(int parseInt) throws RemoteException;

	public void altaInsumo(int parseInt, String text, String text2, int parseInt2, int parseInt3) throws RemoteException;

	public void bajaInsumo(int parseInt) throws RemoteException;

	public InsumoDTO solicitarInsumoView(int parseInt)  throws RemoteException;


	public void modificarInsumo(InsumoDTO iv, int parseInt) throws RemoteException;
}
