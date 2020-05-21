package Facturas;

public class Factura implements Ifactura{

	public int num;
	public float base;
	public float tipoIva;
	public Estados estado;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void cambiarEstado(Estados estado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float getTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getCantidadIva() {
		// TODO Auto-generated method stub
		return 0;
	}
	


}
