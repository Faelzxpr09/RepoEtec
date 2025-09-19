
public class ClassePessoas {

	private String NomeAt;
	private int idadeAt;
	private ClasseEndereco enderecoAt;
	
	public ClassePessoas() {
		
	}
	
	public ClassePessoas(String nomePar, int idadePar, ClasseEndereco enderecoPar) {
		this.NomeAt=nomePar;
		this.idadeAt=idadePar;
		this.enderecoAt=enderecoPar;
	}
	
	public String getNome() {
		return NomeAt;}
	
	public int getIdade() {
		return idadeAt;}
	
	public ClasseEndereco getEndereco() {
		return enderecoAt;}

	public void alterar_nome(String nomePar) {
		this.NomeAt = nomePar.toUpperCase();}
	
	public void alterar_idade(int idadePar) {
		this.idadeAt = idadePar;}
	
	public void alterar_endereco(ClasseEndereco enderecoPar) {
		this.enderecoAt = enderecoPar;}
}
