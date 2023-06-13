public class Main {
    public static void main(String[] args) {
          // Aula de Orientação à Objetos
          // Declarar objetos
        Pessoa adao;
        // Instanciar objetos
        adao = new Pessoa();
        Pessoa eva = new Pessoa();
        // Definiçaõ do formato
        adao.nome = "Adão";
        adao.sobrenome = "Silva";
        eva.nome = "Eva";
        eva.sobrenome = "Silva";
        // Acionar comportamento
        adao.falar();
        eva.falar();

        // Criar mais objetos
        Pessoa qualquer = new Pessoa();
        // Declarar Objeto
        Pessoa rainha;
        // Instanciação de objetos
        rainha = new Pessoa();
        // Defenindo forma de pessoa
        rainha.nome = "Tina";
        rainha.sobrenome = "Tunner";
        // Definição de comportamento
        rainha.comer();


    }
}