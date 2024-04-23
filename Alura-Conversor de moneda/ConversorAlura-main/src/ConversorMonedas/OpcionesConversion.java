package ConversorMonedas;

import javax.swing.JOptionPane;

public class OpcionesConversion {
	
	ConvertirMonedas monedas = new ConvertirMonedas();
	
	public void ConvertirMonedas(double valor) {
	
	String opcion = (JOptionPane.showInputDialog(null,
			"Elije la moneda que deseas convertir tu dinero ",  "Monedas",
			JOptionPane.PLAIN_MESSAGE, null, new Object[]
					{"De Soles a Dólar", "De Soles a Euro", "De Soles a Libras Esterlinas", "De Soles a Yen Japonés", "De Soles a Won sub-coreano", "De Dólar a Soles", "De Euro a Soles", "De Libras Esterlinas a Soles", "De Yen Japonés a Soles", "De Won sub-coreano a Soles"}, 
					"Seleccion")).toString();
	
	switch (opcion) {
	case "De Soles a Dólar": 
		monedas.ConvertirSolesPeruanoDolares(valor);
		break;
	
	case "De Soles a Euro": 
		monedas.ConvertirSolesPeruanoEuros(valor);
		break;
		
	case "De Soles a Libras Esterlinas":
		monedas.ConvertirSolesPeruanoLibra(valor);
		break;
		
	case "De Soles a Yen Japonés":
		monedas.ConvertirSolesPeruanoYen(valor);
		break;
		
	case "De Soles a Won sub-coreano":
		monedas.ConvertirSolesPeruanoWon(valor);
		break;
	
	case "De Dólar a Soles":
		monedas.ConvertirDolaresSolesPeruano(valor);
		break;
		
	case "De Euro a Soles":
		monedas.ConvertirEurosSolesPeruano(valor);
		break;
		
	case "De Libras Esterlinas a Soles":
		monedas.ConvertirLibraSolesPeruano(valor);
		break;
	 
	case "De Yen Japonés a Soles":
		monedas.ConvertirYenSolesPeruano(valor);
		break;
		
	case "De Won sub-coreano a Soles":
		monedas.ConvertirWonSolesPeruano(valor);
		break;
	}
	}

}
