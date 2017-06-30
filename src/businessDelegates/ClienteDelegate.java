package businessDelegates;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import DTO.ClienteDTO;
import DTO.CuentaCorrienteDTO;
import DTO.MovimientoCCDTO;
import RemoteObject.TDACliente;

public class ClienteDelegate {

	private static ClienteDelegate instance;
	private TDACliente remoto;

	public static ClienteDelegate getInstance() {
		if (instance == null) {
			instance = new ClienteDelegate();
		}
		return instance;
	}

	private ClienteDelegate() {
		try {
			remoto = (TDACliente) Naming.lookup("ClienteRemoto");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}

	public List<ClienteDTO> getAll() throws RemoteException {
		return remoto.getAllClientes();
	}
	
	
	
	public ClienteDTO altaCliente(String cuit, String nombre, String direccion, String telefono, Float limiteCredito)
			throws RemoteException {
		
		ClienteDTO clienteDTO = new ClienteDTO(nombre, direccion, telefono, cuit);
		CuentaCorrienteDTO cc = new CuentaCorrienteDTO(new Float(0), limiteCredito, new ArrayList<MovimientoCCDTO>());
		//cc.setId((long) 1); ESTO PARA QUE ESTABA?
		clienteDTO.setCc(cc);
		
		return remoto.altaCliente(clienteDTO);
	}

	public void bajaCliente(ClienteDTO cliente) throws RemoteException {
		remoto.bajaCliente(cliente);

	}

	public ClienteDTO buscarCliente(String cuit) throws RemoteException {
		return remoto.buscarCliente(cuit);
	}

	public void modificarCliente(ClienteDTO cliente) throws RemoteException {
		remoto.modificarCliente(cliente);

	}

}
