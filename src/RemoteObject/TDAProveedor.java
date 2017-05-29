package RemoteObject;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import DTO.InsumoDTO;
import DTO.InsumoProveedorDTO;
import DTO.ProveedorDTO;

public interface TDAProveedor extends Remote {

	public boolean verificarProveedor(int parseInt) throws RemoteException;

	public void altaProveedor(ProveedorDTO prov) throws RemoteException;

	public void bajaProveedor(int parseInt) throws RemoteException;

	public ProveedorDTO solicitarProveedorView(int parseInt) throws RemoteException;

	public void modificarProveedor(ProveedorDTO pv) throws RemoteException;

	public List<ProveedorDTO> getAllProveedores() throws RemoteException;

	public InsumoProveedorDTO asociarInsumo(ProveedorDTO proveedor, InsumoDTO insumo, Float precio) throws RemoteException;
}
