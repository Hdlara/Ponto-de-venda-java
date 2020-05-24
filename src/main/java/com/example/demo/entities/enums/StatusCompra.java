package com.example.demo.entities.enums;

public enum StatusCompra {

	PAGAMENTO_PENDENTE(1),
	PAGO(2),
	AGUARDANDO_ENVIO(3),
	ENVIADO(4),
	ENTREGE(5),
	CANCELADO(6);
	
	private int code;
	
	private StatusCompra(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static StatusCompra valueOf(int code) {
		for (StatusCompra value : StatusCompra.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("invalid order status code");
	}
	
}
