package escola.musica.bean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import escola.musica.interfaces.INavegable;
import escola.musica.modelo.Endereco;

@ManagedBean
public class EnderecoBean implements INavegable<Endereco>{

	private Endereco endereco = new Endereco();
	
	/**
	 * @return the endereco
	 */
	public Endereco getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public void save() {
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage("Endere�o salvo com sucesso!"));
	}

	@Override
	public void edit(Endereco endereco) {
		// TODO Implementar o edit
	}

	@Override
	public void remove() {
		// TODO Implementar o remove
	}

	@Override
	public void holdInstance(Endereco endereco) {
		// TODO Implementar o holdInstace
	}

	@Override
	public void iniciarBean() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void voltar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void novaEntity() {
		// TODO Auto-generated method stub
		
	}

}
