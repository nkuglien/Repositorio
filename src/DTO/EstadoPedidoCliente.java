package DTO;

import java.io.Serializable;

public enum EstadoPedidoCliente implements Serializable {
	
	CREADO, 	// por el cliente
	VALIDADO,	// por sucursal
	RECHAZADO,  // por sucursal
	ACEPTADO, 	// por el cliente
	CANCELADO,  // por el cliente
	COMPLETO 	// listo para despacho

}
