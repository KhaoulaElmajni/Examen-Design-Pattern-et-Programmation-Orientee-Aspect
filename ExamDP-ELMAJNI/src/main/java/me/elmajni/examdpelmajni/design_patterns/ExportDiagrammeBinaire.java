package me.elmajni.examdpelmajni.design_patterns;

import me.elmajni.examdpelmajni.aspects.Log;

public class ExportDiagrammeBinaire implements IStrategyExport {

    @Log
    @Override
    public void exporter() {
        System.out.println("Exporter le Diagramme de Classe");
    }
}
