package me.elmajni.examdpelmajni.test;


import me.elmajni.examdpelmajni.design_patterns.ExportDiagrammeBinaire;
import me.elmajni.examdpelmajni.design_patterns.GenerateCodeJava;
import me.elmajni.examdpelmajni.entities.*;

import java.util.ArrayList;
import java.util.List;

public class AppTest {

    public static void main(String[] args) {

        System.out.println("****************************Début de test du programme****************************");

        List<Entite> entites = new ArrayList<>();
        entites.add(new Classe("ClasseDefaut"));
        entites.add(new GroupeClasse("GroupeClasse"));
        entites.add(new Interface("Interface"));
        entites.add(new Enumerateur("Enumerateur"));
        entites.add(new Classe("EntiteDestination"));


        DiagrammeDeClasse diagrammeDeClasse = new DiagrammeDeClasse();
        diagrammeDeClasse.setEntites(entites);
        diagrammeDeClasse.setGenerateCode(new GenerateCodeJava());
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
        diagrammeDeClasse.setGenerateCode(new GenerateCodeJava());
        diagrammeDeClasse.genererCode();

        System.out.println("*****************Exporter le code*****************");
        diagrammeDeClasse.setExport(new ExportDiagrammeBinaire());
        diagrammeDeClasse.exporterDiagramme();


        GroupeClasse groupeClasse1 = new GroupeClasse("GroupeClasse");
        groupeClasse1.add(new Classe("Classe1"));
        groupeClasse1.add(new Annotation("annotation1"));

    }
}
