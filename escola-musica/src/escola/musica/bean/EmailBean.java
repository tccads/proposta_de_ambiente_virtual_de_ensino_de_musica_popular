package escola.musica.bean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import escola.musica.modelo.Email;

@ManagedBean
public class EmailBean implements ICrud<Email, String>{

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
	public void save(Email email) {
		FacesContext.getCurrentInstance().addMessage(null, 
		new FacesMessage("Email "+ email.getEndereco() +" salvo com sucesso!"));
		
	}

	@Override
	public boolean remove(String idEmail) {
		FacesContext.getCurrentInstance().addMessage(null, 
		new FacesMessage(idEmail + "removido com sucesso!"));
		return false;
	}

	@Override
	public Email select(String idEmail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Email> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
