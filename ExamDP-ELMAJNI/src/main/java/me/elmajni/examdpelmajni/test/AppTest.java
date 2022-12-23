package me.elmajni.examdpelmajni.test;


import me.elmajni.examdpelmajni.design_patterns.StrategyExportImpl;
import me.elmajni.examdpelmajni.design_patterns.GenerateCodeImpl1;
import me.elmajni.examdpelmajni.entities.*;

public class AppTest {

    public static void main(String[] args) {

        System.out.println("****************************Début de test du programme****************************");

        DiagrammeDeClasse diagrammeDeClasse = new DiagrammeDeClasse();
        diagrammeDeClasse.setGenerateCode(new GenerateCodeImpl1());
        diagrammeDeClasse.genererCode();

        GroupeClasse groupeClasse = new GroupeClasse("GroupeClasse");

        /*List<Attribut> attributs =  new ArrayList<>(new Attribut("attribut1", "int"), new Attribut("attribut2", "String"));
                List.of(new Attribut("attribut1", "int"), new Attribut("attribut2", "String"));
        , List<Methode> methodes, List<Constructeur> constructeurs, List< Observer > observers*/
        groupeClasse.add(new Classe("Classe1"));
        groupeClasse.add(new Classe("Classe3"));
        groupeClasse.add(new Classe("Classe2"));
        groupeClasse.add(new Annotation("annotation1"));

        System.out.println("****************Generer le code******************");
        diagrammeDeClasse.setGenerateCode(new GenerateCodeImpl1());
        diagrammeDeClasse.genererCode();

        System.out.println("*****************Exporter le code*****************");
        diagrammeDeClasse.setExport(new StrategyExportImpl());
        diagrammeDeClasse.exporterDiagramme();


        GroupeClasse groupeClasse1 = new GroupeClasse("GroupeClasse");
        groupeClasse1.add(new Classe("Classe1"));
        groupeClasse1.add(new Annotation("annotation1"));

    }
}
