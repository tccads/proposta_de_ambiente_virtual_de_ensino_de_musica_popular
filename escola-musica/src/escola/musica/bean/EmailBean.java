package escola.musica.bean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import escola.musica.interfaces.INavegable;
import escola.musica.modelo.Email;

@ManagedBean
public class EmailBean implements INavegable<Email>{

	private Email email = new Email();
	
	/**
	 * @return the email
	 */
	public Email getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(Email email) {
		this.email = email;
	}

	@Override
	public void save() {
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage("Email "+ email.getEndereco() +" salvo com sucesso!"));
	}

	@Override
	public void edit(Email email) {
		// TODO Implementar o edit
	}

	@Override
	public void remove() {
		// TODO Implementar o remove
	}

	@Override
	public void holdInstance(Email email) {
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
