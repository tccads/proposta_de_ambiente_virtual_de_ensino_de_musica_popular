package escola.musica.bean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import escola.musica.modelo.Telefone;

@ManagedBean
public class TelefoneBean implements ICrud<Telefone, String>{

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
	public void save(Telefone telefone) {
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage("Telefone"+ telefone.getNumero() +"salvo com sucesso!"));
	}

	@Override
	public boolean remove(String numeroTelefone) {
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage("Telefone removido com sucesso!"));
		return false;
	}

	@Override
	public Telefone select(String idEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Telefone> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
