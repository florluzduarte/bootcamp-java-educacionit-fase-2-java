package ar.com.educacionit.mensajero;

public class MensajeriaBuilder {
	
	public static Mensaje buildMensaje(String tipo, String origen, String contenido, String path, String destino) {
		Mensaje mensaje = null;
		switch (tipo) {
			case "sms":
			case "email":
				mensaje = new Network(contenido, destino, origen);
				break;
			case "filesystem":
				mensaje = new Fs(contenido, path);
				break;
			default:
				mensaje = new DefaultMensaje();
		}
		return mensaje;
	}
	
	public static IMensaje buildMensajeria() {
		IMensaje mensajeria = null;
		String tipo = Db.getTipo();
		
		switch (tipo) {
		case "sms": {
			mensajeria = new Sms();
			break;
		}
		case "email": {
			mensajeria = new Email();
			break;
		}
		case "fs": {
			mensajeria = new FileSystem();
			break;
		}
		default:
			System.err.println("El tipo de mensaje: " + tipo + " es inválido");
		}
		
		return mensajeria;
	}

}
