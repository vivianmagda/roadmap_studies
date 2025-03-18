package passByValue;

public class Main {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Ana"); // Cria um objeto na memória heap
        Pessoa p2 = p1;               // 'p2' agora aponta para o mesmo objeto que 'p1'

        p2.nome = "João";             // Altera o atributo através da referência 'p2'

        System.out.println(p1.nome);  // Exibe "João", pois 'p1' e 'p2' apontam para o mesmo objeto
    }

    /*Quando você passa um objeto como parâmetro para um método, 
    você está, na verdade, copiando a referência (não o objeto em si). 
    Essa cópia da referência permite que o método acesse e modifique o objeto original. */

}
