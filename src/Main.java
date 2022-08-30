import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Forum;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());


        //Aqui é a alteração de Robson
        Curso curso3 = new Curso();
        curso3.setTitulo("curso de React");
        curso3.setDescricao("React é um Framework do Javascript");
        curso3.setCargaHoraria(20);

        Curso curso4 = new Curso();
        curso4.setTitulo("curso de Spring Boot");
        curso4.setDescricao("Spring é um framework do Java");
        curso4.setCargaHoraria(36);

        Curso curso5 = new Curso();
        curso5.setTitulo("curso de Cloud");
        curso5.setDescricao("Aprenderá a fazer Deploy no Cloud da Amazon");
        curso5.setCargaHoraria(12);

        Bootcamp transformaTec = new Bootcamp();
        transformaTec.setNome("Transforma Tec");
        transformaTec.setDescricao("Programa voltado a aprendizagem de desenvolvimento WEB com React, Spring Boot e Cloud");
        transformaTec.getConteudos().add(curso1);
        transformaTec.getConteudos().add(curso2);
        transformaTec.getConteudos().add(curso3);
        transformaTec.getConteudos().add(curso4);
        transformaTec.getConteudos().add(mentoria);

        Dev devRobson = new Dev();
        devRobson.setNome("Robson");
        devRobson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Robson:" + devRobson.getConteudosInscritos());
        List<Forum> duvidas = new ArrayList<Forum>();
        duvidas.add(new Forum("Dúvida em Java", "Qualquer dúvida em Java"));
        duvidas.add(new Forum("Dúvida em React", "Qualquer dúvida em React"));
        devRobson.setDuvidas(duvidas);
        devRobson.progredir();
        devRobson.progredir();
        devRobson.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Robson:" + devRobson.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Robson:" + devRobson.getConteudosConcluidos());
        System.out.println("XP:" + devRobson.calcularTotalXp());
        System.out.println("Dúvidas do aluno: " + devRobson.getDuvidas());

    }

}
