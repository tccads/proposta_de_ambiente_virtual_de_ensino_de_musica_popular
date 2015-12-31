package escola.musica.bean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import escola.musica.interfaces.INavegable;
import escola.musica.modelo.Endereco;

@ManagedBean
public class EnderecoBean implements INavegable<Endereco, Long>{

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
	public String save() {
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage("Endereço salvo com sucesso!"));
		return "lista_endereco";
	}

	@Override
	public String edit(Endereco endereco) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String remove(Long idEndereco) {
		// TODO Auto-generated method stub
		return null;
	}

}
