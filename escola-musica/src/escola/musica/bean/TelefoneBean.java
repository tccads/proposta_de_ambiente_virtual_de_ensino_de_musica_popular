package escola.musica.bean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import escola.musica.interfaces.INavegable;
import escola.musica.modelo.Telefone;

@ManagedBean
public class TelefoneBean implements INavegable<Telefone, String>{

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
	public String save() {
		FacesContext.getCurrentInstance().addMessage(null, 
		new FacesMessage("Telefone"+ telefone.getNumero() +"salvo com sucesso!"));
		return "lista_telefones";
	}

	@Override
	public String edit(Telefone telefone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String remove(String idTelefone) {
		// TODO Auto-generated method stub
		return null;
	}

}
