package RemoteObject;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import DTO.AreaProduccionDTO;
import DTO.PrendaDTO;
import DTO.VariedadPrendaDTO;

public interface TDAPrenda extends Remote {

	public boolean verificarPrenda(int parseInt) throws RemoteException;

	public void altaPrenda(PrendaDTO prenda) throws RemoteException;

	public void bajaprenda(PrendaDTO prenda) throws RemoteException;

	public PrendaDTO solicitarPrendaView(Long codigo) throws RemoteException;

	public void modificarPrenda(PrendaDTO prenda) throws RemoteException;

	public List<PrendaDTO> getAllPrendas() throws RemoteException;

	public void altaVariedadPrenda(VariedadPrendaDTO varPrenda) throws RemoteException;
	
	public List<AreaProduccionDTO> getAllAreasProduccion() throws RemoteException;

	public void bajaVariedadPrenda(VariedadPrendaDTO variedadPrendaDTO) throws RemoteException;

}
