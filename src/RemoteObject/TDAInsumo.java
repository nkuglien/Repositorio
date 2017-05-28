package RemoteObject;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import DTO.InsumoDTO;

public interface TDAInsumo extends Remote {

	public InsumoDTO buscarInsumo(Long codigo) throws RemoteException;

	public InsumoDTO altaInsumo(InsumoDTO dto) throws RemoteException;

	public InsumoDTO bajaInsumo(Long codigo) throws RemoteException;

	public InsumoDTO solicitarInsumoView(int parseInt) throws RemoteException;

	public InsumoDTO modificarInsumo(InsumoDTO insumo) throws RemoteException;

	public List<InsumoDTO> getAllInsumos() throws RemoteException;
}
