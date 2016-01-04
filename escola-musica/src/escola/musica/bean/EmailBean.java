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
	public String save() {
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage("Email "+ email.getEndereco() +" salvo com sucesso!"));
		return "lista_emails";
	}

	@Override
	public String edit(Email email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void holdInstance(Email email) {
		// TODO Auto-generated method stub
		
	}

}
