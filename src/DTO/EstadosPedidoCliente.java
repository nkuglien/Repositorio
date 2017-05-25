package DTO;

public enum EstadosPedidoCliente {
	CREADO, 	// por el cliente
	VALIDADO,	// por sucursal
	RECHAZADO,  // por sucursal
	ACEPTADO, 	// por el cliente
	CANCELADO,  // por el cliente
	COMPLETO 	// listo para despacho
}
