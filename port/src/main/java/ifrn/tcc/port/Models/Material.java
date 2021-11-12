package ifrn.tcc.port.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Material {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String tituloMat;
	@Lob
	private String conteudo;
	private String video;
	private String questionario;
	@ManyToOne
	private Modulo modulo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTituloMat() {
		return tituloMat;
	}

	public void setTituloMat(String tituloMat) {
		this.tituloMat = tituloMat;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public String getQuestionario() {
		return questionario;
	}

	public void setQuestionario(String questionario) {
		this.questionario = questionario;
	}

	public Modulo getModulo() {
		return modulo;
	}

	public void setModulo(Modulo modulo) {
		this.modulo = modulo;
	}

	@Override
	public String toString() {
		return "Material [id=" + id + ", tituloMat=" + tituloMat + ", conteudo=" + conteudo + ", video=" + video
				+ ", questionario=" + questionario + ", modulo=" + modulo + "]";
	}

}