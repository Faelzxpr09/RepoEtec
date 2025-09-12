
public class ClassePessoas {

	String NomeAt;
	int idadeAt;
	ClasseEndereco ClasseEnderecoAt;
	
	public ClassePessoas() {
		
	}
	
	public ClassePessoas(String nomePar, int idadePar) {
		this.NomeAt=nomePar;
		this.idadeAt=idadePar;
	}
	
	public String getNome() {
		return NomeAt;}
	
	public int getIdade() {
		return idadeAt;}

	public void alterar_nome(String nomePar) {
		this.NomeAt = nomePar.toUpperCase();}
	
	public void alterar_idade(int idadePar) {
		this.idadeAt = idadePar;}
}
