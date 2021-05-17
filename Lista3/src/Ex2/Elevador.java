package Ex2;

public class Elevador {
	 private Integer andarAtual;
	 private Integer maCap;
	 private Integer qntdPessoas;
	 private Integer qntdAndares;
	
	


	 public Elevador(Integer maCap, Integer qntdAndares) {
			this.andarAtual = 0;
			this.maCap = maCap;
			this.qntdPessoas = 0;
			this.qntdAndares = qntdAndares;
		}

	public Integer getAndarAtual() {
		return andarAtual;
	}


	public void setAndarAtual(Integer andarAtual) {
		this.andarAtual = andarAtual;
	}


	public Integer getMaCap() {
		return maCap;
	}


	public void setMaCap(Integer maCap) {
		this.maCap = maCap;
	}



	public Integer getQntdPessoas() {
		return qntdPessoas;
	}


	public void setQntdPessoas(Integer qntdPessoas) {
		this.qntdPessoas = qntdPessoas;
	}


	public Integer getQntdAndares() {
		return qntdAndares;
	}


	public void setQntdAndares(Integer qntdAndares) {
		this.qntdAndares = qntdAndares;
	}
	
 	public void subir() {
 		if(andarAtual<qntdAndares) {
 			andarAtual+=1;
 		}
 		
 	}
 	public void descer() {
 		if(andarAtual>0) {
 			andarAtual-=1;
 		}
 		
 	}
 	
  public void entrar() {
	  if (qntdPessoas < maCap) {
		  qntdPessoas+=1;
	  }else {
		  System.out.println("Acima da capacidade");
	  }  
	  }
  
 public void sair () {
	if(qntdPessoas==0) {
		System.out.println("Não tem usuario no elevador");
	}else {
	 qntdPessoas-=1;
	}
 } 

}

