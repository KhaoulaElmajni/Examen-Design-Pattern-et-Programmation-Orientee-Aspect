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
