package RemoteObject;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import DTO.ProveedorDTO;

public interface ProveedorRemote extends Remote {

	public boolean verificarProveedor(int parseInt) throws RemoteException;

	public void altaProveedor(int parseInt, String text) throws RemoteException;

	public void bajaProveedor(int parseInt) throws RemoteException;

	public ProveedorDTO solicitarProveedorView(int parseInt) throws RemoteException;

	public void modificarProveedor(ProveedorDTO pv, int parseInt) throws RemoteException;

	public List<ProveedorDTO> getAllProveedores() throws RemoteException;
}
