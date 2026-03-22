public class Quiz {
    public static void main(String[] args) {

        int pontuacao = 0;

        // ================= QUESTÃO 1 =================
        Questao q1 = new Questao();
        q1.pergunta = "Qual é a capital do Brasil?";
        q1.opcaoA = "A) Rio de Janeiro";
        q1.opcaoB = "B) São Paulo";
        q1.opcaoC = "C) Brasília";
        q1.opcaoD = "D) Salvador";
        q1.opcaoE = "E) Belo Horizonte";
        q1.correta = "C";
        q1.escrevaQuestao();
        if(q1.isCorreta(q1.leiaResposta())) pontuacao++;

        // ================= QUESTÃO 2 =================
        Questao q2 = new Questao();
        q2.pergunta = "Qual é o maior estado do Brasil em território?";
        q2.opcaoA = "A) São Paulo";
        q2.opcaoB = "B) Amazonas";
        q2.opcaoC = "C) Minas Gerais";
        q2.opcaoD = "D) Bahia";
        q2.opcaoE = "E) Pará";
        q2.correta = "B";
        q2.escrevaQuestao();
        if(q2.isCorreta(q2.leiaResposta())) pontuacao++;

        // ================= QUESTÃO 3 =================
        Questao q3 = new Questao();
        q3.pergunta = "Qual é o idioma oficial do Brasil?";
        q3.opcaoA = "A) Espanhol";
        q3.opcaoB = "B) Inglês";
        q3.opcaoC = "C) Francês";
        q3.opcaoD = "D) Português";
        q3.opcaoE = "E) Italiano";
        q3.correta = "D";
        q3.escrevaQuestao();
        if(q3.isCorreta(q3.leiaResposta())) pontuacao++;

        // ================= QUESTÃO 4 =================
        Questao q4 = new Questao();
        q4.pergunta = "Qual é o maior rio do Brasil?";
        q4.opcaoA = "A) Rio São Francisco";
        q4.opcaoB = "B) Rio Paraná";
        q4.opcaoC = "C) Rio Amazonas";
        q4.opcaoD = "D) Rio Tocantins";
        q4.opcaoE = "E) Rio Negro";
        q4.correta = "C";
        q4.escrevaQuestao();
        if(q4.isCorreta(q4.leiaResposta())) pontuacao++;

        // ================= QUESTÃO 5 =================
        Questao q5 = new Questao();
        q5.pergunta = "Qual é a moeda do Brasil?";
        q5.opcaoA = "A) Peso";
        q5.opcaoB = "B) Dólar";
        q5.opcaoC = "C) Euro";
        q5.opcaoD = "D) Real";
        q5.opcaoE = "E) Cruzeiro";
        q5.correta = "D";
        q5.escrevaQuestao();
        if(q5.isCorreta(q5.leiaResposta())) pontuacao++;

        // ================= QUESTÃO 6 =================
        Questao q6 = new Questao();
        q6.pergunta = "Quem descobriu o Brasil?";
        q6.opcaoA = "A) Cristóvão Colombo";
        q6.opcaoB = "B) Dom Pedro I";
        q6.opcaoC = "C) Pedro Álvares Cabral";
        q6.opcaoD = "D) Vasco da Gama";
        q6.opcaoE = "E) Tiradentes";
        q6.correta = "C";
        q6.escrevaQuestao();
        if(q6.isCorreta(q6.leiaResposta())) pontuacao++;

        // ================= QUESTÃO 7 =================
        Questao q7 = new Questao();
        q7.pergunta = "Em que ano o Brasil foi descoberto?";
        q7.opcaoA = "A) 1492";
        q7.opcaoB = "B) 1500";
        q7.opcaoC = "C) 1822";
        q7.opcaoD = "D) 1889";
        q7.opcaoE = "E) 1530";
        q7.correta = "B";
        q7.escrevaQuestao();
        if(q7.isCorreta(q7.leiaResposta())) pontuacao++;

        // ================= QUESTÃO 8 =================
        Questao q8 = new Questao();
        q8.pergunta = "Qual é o maior bioma do Brasil?";
        q8.opcaoA = "A) Cerrado";
        q8.opcaoB = "B) Caatinga";
        q8.opcaoC = "C) Amazônia";
        q8.opcaoD = "D) Mata Atlântica";
        q8.opcaoE = "E) Pantanal";
        q8.correta = "C";
        q8.escrevaQuestao();
        if(q8.isCorreta(q8.leiaResposta())) pontuacao++;

        // ================= QUESTÃO 9 =================
        Questao q9 = new Questao();
        q9.pergunta = "Qual é a maior cidade do Brasil?";
        q9.opcaoA = "A) Rio de Janeiro";
        q9.opcaoB = "B) Brasília";
        q9.opcaoC = "C) Salvador";
        q9.opcaoD = "D) São Paulo";
        q9.opcaoE = "E) Fortaleza";
        q9.correta = "D";
        q9.escrevaQuestao();
        if(q9.isCorreta(q9.leiaResposta())) pontuacao++;

        // ================= QUESTÃO 10 =================
        Questao q10 = new Questao();
        q10.pergunta = "Qual é a cor predominante da bandeira do Brasil?";
        q10.opcaoA = "A) Azul";
        q10.opcaoB = "B) Vermelho";
        q10.opcaoC = "C) Verde";
        q10.opcaoD = "D) Branco";
        q10.opcaoE = "E) Preto";
        q10.correta = "C";
        q10.escrevaQuestao();
        if(q10.isCorreta(q10.leiaResposta())) pontuacao++;

        // ================= QUESTÃO 11 =================
        Questao q11 = new Questao();
        q11.pergunta = "Qual é o prato típico mais conhecido do Brasil?";
        q11.opcaoA = "A) Pizza";
        q11.opcaoB = "B) Sushi";
        q11.opcaoC = "C) Feijoada";
        q11.opcaoD = "D) Hambúrguer";
        q11.opcaoE = "E) Lasanha";
        q11.correta = "C";
        q11.escrevaQuestao();
        if(q11.isCorreta(q11.leiaResposta())) pontuacao++;

        // ================= QUESTÃO 12 =================
        Questao q12 = new Questao();
        q12.pergunta = "Qual festa é famosa no Brasil?";
        q12.opcaoA = "A) Halloween";
        q12.opcaoB = "B) Carnaval";
        q12.opcaoC = "C) Natal";
        q12.opcaoD = "D) Páscoa";
        q12.opcaoE = "E) Ano Novo";
        q12.correta = "B";
        q12.escrevaQuestao();
        if(q12.isCorreta(q12.leiaResposta())) pontuacao++;

        // ================= QUESTÃO 13 =================
        Questao q13 = new Questao();
        q13.pergunta = "Qual é o animal símbolo do Brasil?";
        q13.opcaoA = "A) Leão";
        q13.opcaoB = "B) Águia";
        q13.opcaoC = "C) Lobo";
        q13.opcaoD = "D) Onça-pintada";
        q13.opcaoE = "E) Tigre";
        q13.correta = "D";
        q13.escrevaQuestao();
        if(q13.isCorreta(q13.leiaResposta())) pontuacao++;

        // ================= QUESTÃO 14 =================
        Questao q14 = new Questao();
        q14.pergunta = "Qual é o esporte mais popular no Brasil?";
        q14.opcaoA = "A) Basquete";
        q14.opcaoB = "B) Vôlei";
        q14.opcaoC = "C) Futebol";
        q14.opcaoD = "D) Tênis";
        q14.opcaoE = "E) Natação";
        q14.correta = "C";
        q14.escrevaQuestao();
        if(q14.isCorreta(q14.leiaResposta())) pontuacao++;

        // ================= QUESTÃO 15 =================
        Questao q15 = new Questao();
        q15.pergunta = "Qual é o país que faz fronteira com o Brasil?";
        q15.opcaoA = "A) México";
        q15.opcaoB = "B) Chile";
        q15.opcaoC = "C) Canadá";
        q15.opcaoD = "D) Alemanha";
        q15.opcaoE = "E) Japão";
        q15.correta = "B";
        q15.escrevaQuestao();
        if(q15.isCorreta(q15.leiaResposta())) pontuacao++;

        // ================= RESULTADO FINAL =================
        System.out.println("=================================");
        System.out.println("Pontuação final: " + pontuacao + "/15");

        if(pontuacao == 15){
            System.out.println("PERFEITO! Você sabe tudo sobre o Brasil!");
        } else if(pontuacao >= 10){
            System.out.println("Muito bom!");
        } else if(pontuacao >= 5){
            System.out.println("Razoável!");
        } else {
            System.out.println("Precisa estudar mais sobre o Brasil!");
        }
    }
}
