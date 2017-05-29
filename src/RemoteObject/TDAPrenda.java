package RemoteObject;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import DTO.PrendaDTO;

public interface TDAPrenda extends Remote {

	public boolean verificarPrenda(int parseInt) throws RemoteException;

	public void altaPrenda(PrendaDTO prenda) throws RemoteException;

	public void bajaprenda(PrendaDTO prenda) throws RemoteException;

	public PrendaDTO solicitarPrendaView(Long codigo) throws RemoteException;

	public void modificarPrenda(PrendaDTO prenda) throws RemoteException;

	public List<PrendaDTO> getAllPrendas() throws RemoteException;

}
