package RemoteObject;

import java.rmi.Remote;
import java.rmi.RemoteException;

import DTO.InsumoDTO;

public interface InsumoRemote extends Remote {

	public InsumoDTO altaInsumo(InsumoDTO insumo) throws RemoteException;

	public void bajaInsumo(int parseInt) throws RemoteException;

	public InsumoDTO solicitarInsumoView(int parseInt) throws RemoteException;

	public void modificarInsumo(InsumoDTO iv, int parseInt) throws RemoteException;

	public InsumoDTO buscarInsumo(Long codigo) throws RemoteException;
}
