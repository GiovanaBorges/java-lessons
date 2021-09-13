import br.com.dio.Bootcamp;
import br.com.dio.Curso;
import br.com.dio.Dev;
import br.com.dio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[]args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria");
        mentoria.setData(LocalDate.now());
        System.out.println(curso2);
        System.out.println(curso1);


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGiovana = new Dev();
        devGiovana.setNome("Giovana");
        devGiovana.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos giovana:"+ devGiovana.getConteudosInscritos());
        devGiovana.progredir();
        System.out.println("Conteudos inscritos"+ devGiovana.getConteudosInscritos());
        System.out.println("Conteudos Concluídos"+ devGiovana.getConteudosConcluidos());

        Dev devJonas = new Dev();
        devJonas.setNome("Jonas");
        devJonas.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Jonas:"+ devJonas.getConteudosInscritos());
        devJonas.progredir();
        System.out.println("Conteudos Concluídos"+ devJonas.getConteudosConcluidos());
    }
}
