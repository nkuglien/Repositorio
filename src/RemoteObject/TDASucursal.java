package RemoteObject;

import java.rmi.Remote;
import java.rmi.RemoteException;

import DTO.SucursalDTO;

public interface TDASucursal extends Remote {

	
	public boolean verificarSucursal(int parseInt)  throws RemoteException;

	public void altaSucursal(SucursalDTO sv) throws RemoteException;

	public void bajaSucursal(int parseInt)  throws RemoteException;


	public SucursalDTO solicitarSucursalView(int parseInt) throws RemoteException;


	public void modificarSucursal(SucursalDTO sv) throws RemoteException;
}
