import java.util.Scanner;

class Question {
    String enunciado;
    String[] alternativas;
    char respostaCorreta;

    public Question(String enunciado, String[] alternativas, char respostaCorreta) {
        this.enunciado = enunciado;
        this.alternativas = alternativas;
        this.respostaCorreta = respostaCorreta;
    }

    public boolean verificarResposta(char respostaUsuario) {
        return Character.toLowerCase(respostaUsuario) == Character.toLowerCase(respostaCorreta);
    }

    public void exibirPergunta() {
        System.out.println(enunciado);
        char letra = 'a';
        for (String alternativa : alternativas) {
            System.out.println(letra + ") " + alternativa);
            letra++;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Question[] perguntas = new Question[15];

        
     Questao q1 = new Questao(
    "Qual é o maior planeta do Sistema Solar?",
    "A) Marte", "B) Terra", "C) Júpiter", "D) Saturno", "E) Urano",
    "C"
);

     Questao q2 = new Questao(
    "Quem pintou a Mona Lisa?",
    "A) Van Gogh", "B) Pablo Picasso", "C) Leonardo da Vinci",
    "D) Michelangelo", "E) Rembrandt",
    "C"
);

     Questao q3 = new Questao(
    "Qual é o elemento químico representado por 'O'?",
    "A) Ouro", "B) Osmio", "C) Oxigênio", "D) Ósmio", "E) Ouro Branco",
    "C"
);

     Questao q4 = new Questao(
    "Em que continente fica o Egito?",
    "A) Europa", "B) Ásia", "C) África", "D) Oceania", "E) América do Sul",
    "C"
);

     Questao q5 = new Questao(
    "Quem foi o primeiro homem a pisar na Lua?",
    "A) Neil Armstrong", "B) Yuri Gagarin", "C) Buzz Aldrin",
    "D) Alan Shepard", "E) John Glenn",
    "A"
);

     Questao q6 = new Questao(
    "Qual é o rio mais longo do mundo?",
    "A) Nilo", "B) Amazonas", "C) Yangtzé", "D) Tâmisa", "E) Mississipi",
    "B"
);

     Questao q7 = new Questao(
    "Qual país é conhecido como 'Terra do Sol Nascente'?",
    "A) China", "B) Austrália", "C) Japão", "D) Índia", "E) Rússia",
    "C"
);

     Questao q8 = new Questao(
    "Qual é o maior oceano da Terra?",
    "A) Atlântico", "B) Índico", "C) Pacífico", "D) Ártico", "E) Antártico",
    "C"
);

     Questao q9 = new Questao(
    "Quem escreveu 'Dom Quixote'?",
    "A) Machado de Assis", "B) Shakespeare", "C) Cervantes",
    "D) Camões", "E) Goethe",
    "C"
);

     Questao q10 = new Questao(
    "Qual é o animal terrestre mais rápido?",
    "A) Cavalo", "B) Guepardo", "C) Leopardo", "D) Onça", "E) Canguru",
    "B"
);

     Questao q11 = new Questao(
    "Qual país tem a maior população do mundo?",
    "A) Brasil", "B) Estados Unidos", "C) Índia",
    "D) Rússia", "E) China",
    "C"
);

     Questao q12 = new Questao(
    "Em que país fica a Torre Eiffel?",
    "A) Itália", "B) Espanha", "C) Alemanha", "D) França", "E) Suíça",
    "D"
);

     Questao q13 = new Questao(
    "Qual é o estado físico da água a 0°C (em condições normais)?",
    "A) Gasoso", "B) Líquido", "C) Sólido", "D) Plasma", "E) Vapor",
    "C"
);

     Questao q14 = new Questao(
    "Quem descobriu o Brasil?",
    "A) Cristóvão Colombo", "B) Dom Pedro I", "C) Américo Vespúcio",
    "D) Pedro Álvares Cabral", "E) Vasco da Gama",
    "D"
);

     Questao q15 = new Questao(
    "Qual é a capital do Canadá?",
    "A) Montreal", "B) Toronto", "C) Vancouver", "D) Ottawa", "E) Quebec",
    "D"
);

        int pontuacao = 0;

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println("\nPergunta " + (i + 1) + ":");
            perguntas[i].exibirPergunta();

            System.out.print("Sua resposta (a/b/c/d/e): ");
            char resposta = scanner.next().charAt(0);

            if (perguntas[i].verificarResposta(resposta)) {
                System.out.println("✅ Correto!");
                pontuacao++;
            } else {
                System.out.println("❌ Errado! A resposta correta era: " + perguntas[i].respostaCorreta);
            }
        }

        System.out.println("\n--- FIM DO QUIZ ---");
        System.out.println("Você acertou " + pontuacao + " de " + perguntas.length + " perguntas!");
    }
}
