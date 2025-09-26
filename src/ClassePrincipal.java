
public class ClassePrincipal {

	
	public static void main(String[] args) {
		ClasseEndereco endereco1 = new ClasseEndereco("Laurindo Scavassa", "Assis", "SP");
		ClasseEndereco endereco2 = new ClasseEndereco();
		
		System.out.println(endereco1.pegarRua());
		System.out.println(endereco1.pegarCidade());
		System.out.println(endereco1.pegarEstado());
		
		endereco2.alterar_cidade("Guarulhos");
		endereco2.alterar_rua("rua luiz");
		
		System.out.println(endereco2.pegarRua());
		System.out.println(endereco2.pegarCidade());
	}

}
