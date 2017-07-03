package businessDelegates;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

import DTO.ClienteDTO;
import DTO.LoteVariedadPrendaDTO;
import DTO.OrdenProduccionDTO;
import RemoteObject.TDACliente;
import RemoteObject.TDAOrdenProduccion;

public class OrdenProduccionDelegate {

	private static OrdenProduccionDelegate instance;
	private TDAOrdenProduccion remote;

	public static OrdenProduccionDelegate getInstance() {
		if (instance == null) {
			instance = new OrdenProduccionDelegate();
		}
		return instance;
	}

	private OrdenProduccionDelegate() {
		try {
			remote = (TDAOrdenProduccion) Naming.lookup("OrdenProduccionRemoto");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}

	public List<OrdenProduccionDTO> getAll() throws RemoteException{
		return remote.getAll();
	};
	
	public OrdenProduccionDTO ponerAProducir(Long idOrdenProduccion)throws RemoteException{
		
		return remote.ponerAProducir(idOrdenProduccion);
		
	};
	
	public OrdenProduccionDTO finProduccion(Long idOrdenProduccion) throws RemoteException{
		return remote.finProduccion(idOrdenProduccion);
	}

	public List<LoteVariedadPrendaDTO> getLotes(Long idOrdenProduccion) throws RemoteException {
		return remote.getLotes(idOrdenProduccion);
		
	};


}
