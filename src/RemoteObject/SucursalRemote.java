package RemoteObject;

import java.rmi.Remote;
import java.rmi.RemoteException;

import DTO.SucursalDTO;

public interface SucursalRemote extends Remote {

	
	public boolean verificarSucursal(int parseInt)  throws RemoteException;

	public void altaSucursal(int parseInt, String text, int parseInt2, int parseInt3) throws RemoteException;

	public void bajaSucursal(int parseInt)  throws RemoteException;


	public SucursalDTO solicitarSucursalView(int parseInt) throws RemoteException;


	public void modificarSucursal(SucursalDTO sv, int parseInt) throws RemoteException;
}
