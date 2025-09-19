
public class ClasseEndereco {

	String ruaAt;
	String cidadeAt;
	String estadoAt;

	
	public ClasseEndereco(String ruaPar, String cidadePar, String estadoPar) {
		this.ruaAt = ruaPar;
		this.cidadeAt = cidadePar;
		this.estadoAt = estadoPar;
	}
	
	public String pegarRua() {
		return ruaAt;}
	
	public String pegarCidade() {
		return cidadeAt;}
	
	public String pegarEstado() {
		return estadoAt;}
	
	public void alterar_rua(String ruaPar) {
		this.ruaAt = ruaPar;}
	
	public void alterar_cidade(String cidadePar) {
		this.cidadeAt = cidadePar;}
	
	public void alterar_estado(String estadoPar) {
		this.estadoAt = estadoPar;}
}
