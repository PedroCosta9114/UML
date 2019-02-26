package porta;

public class CodigodaPorta {
		int codigo;
		private int tentativas = 0;
		private boolean estadodaporta = false;

	public CodigodaPorta (){
	}

	public CodigodaPorta (int codigo,boolean estadodaporta) {
		this.codigo = 4765;
		this.estadodaporta = false;
		}

	public void abriraporta () {
		if (this.getCodigo()== codigo ){
		estadodaporta = true;
	}{
		estadodaporta = false;
	}
	}

	public void  fecharaporta() {
		if (estadodaporta == true) {
			estadodaporta = false;
		} 
	}
	public void verificarcodigo() throws InterruptedException {
		int maximodeerros = 3;
		boolean fechaduradaporta = false;
		if (tentativas != maximodeerros && tentativas <= maximodeerros) {
			tentativas--;
			estadodaporta = true;
			fechaduradaporta = false;
		} else if (tentativas == maximodeerros) {
			tentativas--;
			estadodaporta = false;
			Thread.sleep(5000);
			fechaduradaporta = true;

		}
	}


	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public boolean isEstadodaporta() {
		return estadodaporta;
	}

	public void setEstadodaporta(boolean estadodaporta) {
		this.estadodaporta = estadodaporta;
	}
	}

