package co.edu.eam.ingesoft.pa2.clientedatacredito;

import javax.xml.ws.BindingProvider;

public class Main {

	public static void main(String[] args) {
		DatacreditoService cliente = new DatacreditoService();
		
		Centralriego servicio = cliente.getCentralriesgo();
		
		BindingProvider bp = (BindingProvider)servicio;
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, 
				"http://174.142.65.144:28080/orderprocesor/centralriego");
		
		RespuestaScoreDataCreditoDTO dto=  servicio.consultarCiudadano("EAM", TipoDocEnum.PASAPORTE, "1234");
  if(dto.getCodigoResp().equals("00")){
	  System.out.println(dto.getConsulta().getCiudadano().getNombre());
	  System.out.println(dto.getConsulta().getScore());
	  

  }else{
	  System.err.println("NO ESTAS!!!");
  }
	}

}
