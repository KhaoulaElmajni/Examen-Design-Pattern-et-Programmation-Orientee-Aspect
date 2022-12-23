package me.elmajni.examdpelmajni.design_patterns;

import me.elmajni.examdpelmajni.aspects.Log;

public class ExportDiagrammeJson implements IStrategyExport {
    @Log
    @Override
    public void exporter() {
        System.out.println("Export diagramme json");
    }
}
