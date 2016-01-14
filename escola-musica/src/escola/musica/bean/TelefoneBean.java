package escola.musica.bean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import escola.musica.interfaces.INavegable;
import escola.musica.modelo.Telefone;

@ManagedBean
public class TelefoneBean implements INavegable<Telefone>{

	private Telefone telefone = new Telefone();
	
	/**
	 * @return the telefone
	 */
	public Telefone getTelefone() {
		return telefone;
	}

	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	@Override
	public void save() {
		FacesContext.getCurrentInstance().addMessage(null, 
		new FacesMessage("Telefone"+ telefone.getNumero() +"salvo com sucesso!"));
	}

	@Override
	public void edit(Telefone telefone) {
		// TODO Implementar o edit
	}

	@Override
	public void remove() {
		// TODO Implementar o remove
	}

	@Override
	public void holdInstance(Telefone telefone) {
		// TODO Implementar o holdInstance
		
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
