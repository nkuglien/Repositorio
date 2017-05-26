package RemoteObject;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import DTO.ClienteDTO;

public interface ClienteRemote extends Remote {

	
	public boolean verificarCliente(int parseInt) throws RemoteException;

	public void altaCliente(int parseInt, String text, String text2, int parseInt2, String text3)throws RemoteException;
	
	public void bajaCliente(int parseInt) throws RemoteException;

	public ClienteDTO solicitarClienteView(int parseInt) throws RemoteException;

	public void modificarCliente(ClienteDTO cv, int parseInt)throws RemoteException;
}
