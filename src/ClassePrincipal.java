
public class ClassePrincipal {

	public static void main(String[] args) {
		
		ClassePessoas victor_obj = new ClassePessoas();
		
		ClassePessoas luiz_obj = new ClassePessoas("Luis", 15);
		
		ClassePessoas Rafael_rei = new ClassePessoas("Rafael", 17);
		
		luiz_obj.alterar_nome("Luiz");
		victor_obj.alterar_nome("ViCtOr");
		Rafael_rei.alterar_idade(16);
		
		System.out.println(victor_obj.getNome());
		System.out.println(luiz_obj.getNome());
		System.out.println(Rafael_rei.getIdade());
		
	}

}
