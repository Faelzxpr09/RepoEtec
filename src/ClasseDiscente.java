
public class ClasseDiscente extends ClassePessoas{
	
	private int nota1At;
	private int nota2At;
	private int nota3At;
	private int nota4At;
		
	
	public ClasseDiscente(int nota1Par, int nota2Par, int nota3Par, int nota4Par,
	String NomePar, int idadePar, ClasseEndereco enderecoPar) {
		super(NomePar, idadePar, enderecoPar);
		
		this.nota1At = nota1Par;
		this.nota2At = nota2Par;
		this.nota3At = nota3Par;
		this.nota4At = nota4Par;
	}
	
	public int alterar_nota1() {
		return nota1At;}
	
	public int alterar_nota2() {
		return nota2At;}
	
	public int alterar_nota3() {
		return nota3At;}
	
	public int alterar_nota4() {
		return nota4At;}
	
	
	public void pegarNota1(int nota) {
		this.nota1At = nota;}
	
	public void pegarNota2(int nota) {
		this.nota2At = nota;}
	
	public void pegarNota3(int nota) {
		this.nota3At = nota;}
	
	public void pegarNota4(int nota) {
		this.nota4At = nota;}
}

