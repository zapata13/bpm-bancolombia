package com.myspace.demo_bancolombia;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Transaccion implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Fecha")
	private java.lang.String fecha;
	@org.kie.api.definition.type.Label("Numero Cuenta")
	private java.lang.String numCuenta;
	@org.kie.api.definition.type.Label("Tipo de Transaccion")
	private java.lang.String tipotx;
	@org.kie.api.definition.type.Label("Valor")
	private java.lang.Double valor;

	@org.kie.api.definition.type.Label(value = "Existe en Cuenta")
	private java.lang.Boolean existeCuenta;

	@org.kie.api.definition.type.Label(value = "Valor en cuenta")
	private java.lang.Double valorCuenta;

	@org.kie.api.definition.type.Label(value = "Existe en Log")
	private java.lang.Boolean existeLog;

	@org.kie.api.definition.type.Label(value = "Valor en Log")
	private java.lang.Double valorLog;

	public Transaccion() {
	}

	public java.lang.String getFecha() {
		return this.fecha;
	}

	public void setFecha(java.lang.String fecha) {
		this.fecha = fecha;
	}

	public java.lang.String getNumCuenta() {
		return this.numCuenta;
	}

	public void setNumCuenta(java.lang.String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public java.lang.String getTipotx() {
		return this.tipotx;
	}

	public void setTipotx(java.lang.String tipotx) {
		this.tipotx = tipotx;
	}

	public java.lang.Double getValor() {
		return this.valor;
	}

	public void setValor(java.lang.Double valor) {
		this.valor = valor;
	}

	public java.lang.Boolean getExisteCuenta() {
		return this.existeCuenta;
	}

	public void setExisteCuenta(java.lang.Boolean existeCuenta) {
		this.existeCuenta = existeCuenta;
	}

	public java.lang.Double getValorCuenta() {
		return this.valorCuenta;
	}

	public void setValorCuenta(java.lang.Double valorCuenta) {
		this.valorCuenta = valorCuenta;
	}

	public java.lang.Boolean getExisteLog() {
		return this.existeLog;
	}

	public void setExisteLog(java.lang.Boolean existeLog) {
		this.existeLog = existeLog;
	}

	public java.lang.Double getValorLog() {
		return this.valorLog;
	}

	public void setValorLog(java.lang.Double valorLog) {
		this.valorLog = valorLog;
	}

	public Transaccion(java.lang.String fecha, java.lang.String numCuenta,
			java.lang.String tipotx, java.lang.Double valor,
			java.lang.Boolean existeCuenta, java.lang.Double valorCuenta,
			java.lang.Boolean existeLog, java.lang.Double valorLog) {
		this.fecha = fecha;
		this.numCuenta = numCuenta;
		this.tipotx = tipotx;
		this.valor = valor;
		this.existeCuenta = existeCuenta;
		this.valorCuenta = valorCuenta;
		this.existeLog = existeLog;
		this.valorLog = valorLog;
	}

}