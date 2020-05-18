package com.example.demo.entities.enums;

public enum StatusVenda {

	PAGAMENTO_PENDENTE(1),
	PAGO(2),
	AGUARDANDO_ENVIO(3),
	ENVIADO(4),
	ENTREGE(5),
	CANCELADO(6);
	
	private int code;
	
	private StatusVenda(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static StatusVenda valueOf(int code) {
		for (StatusVenda value : StatusVenda.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("invalid order status code");
	}
	
}
