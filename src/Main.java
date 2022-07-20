import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descriçao Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBeatriz = new Dev();
        devBeatriz.setNome("Beatriz");
        devBeatriz.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Beatriz:" + devBeatriz.getConteudosInscritos());

        devBeatriz.progredir();
        devBeatriz.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Beatriz:" + devBeatriz.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Beatriz:" + devBeatriz.getConteudosConcluidos());
        System.out.println("XP:" + devBeatriz.calcularTotalxp());

        System.out.println("-------");

        Dev devRafael = new Dev();
        devRafael.setNome("Rafael");
        devRafael.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Rafael:" + devRafael.getConteudosInscritos());
        devRafael.progredir();
        devRafael.progredir();
        devRafael.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Rafael:" + devRafael.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Rafael:" + devRafael.getConteudosConcluidos());
        System.out.println("XP:" + devRafael.calcularTotalxp());



    }
}
