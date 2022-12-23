package me.elmajni.examdpelmajni.entities;


import me.elmajni.examdpelmajni.aspects.Log;
import me.elmajni.examdpelmajni.design_patterns.IStrategyExport;
import me.elmajni.examdpelmajni.design_patterns.IStratgyGenerateCode;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DiagrammeDeClasse  {


    private IStratgyGenerateCode generateCode;
    private IStrategyExport Export;
    private  List<Entite> entites = new ArrayList<>();
    private List<Methode> methodes= new ArrayList<>();

    public DiagrammeDeClasse() {
    }

    @Log
    public IStratgyGenerateCode getGenerateCode() {
        return generateCode;
    }

    @Log
    public IStrategyExport getExport() {
        return Export;
    }

    @Log
    public List<Entite> getEntites() {
        return entites;
    }

    @Log
    public void setEntites(List<Entite> entites) {
        this.entites = entites;
    }

    @Log
    public List<Methode> getMethodes() {
        return methodes;
    }

    @Log
    public void setMethodes(List<Methode> methodes) {
        this.methodes = methodes;
    }

    @Log
    public void setGenerateCode(IStratgyGenerateCode generateCode) {
        this.generateCode = generateCode;
    }

    @Log
    public void setExport(IStrategyExport export) {
        this.Export = export;
    }
    @Log
    public void genererCode(){
        generateCode.genererCode();
    }
    @Log
    public void exporterDiagramme(){
        Export.exporter();
    }
}
