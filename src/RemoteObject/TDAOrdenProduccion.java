package RemoteObject;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import DTO.OrdenProduccionDTO;


public interface TDAOrdenProduccion extends Remote{

	public List<OrdenProduccionDTO> getAll() throws RemoteException;
	
	public OrdenProduccionDTO ponerAProducir(Long idOrdenProduccion)throws RemoteException;
	
	public OrdenProduccionDTO finProduccion(Long idOrdenProduccion) throws RemoteException;

	
}
