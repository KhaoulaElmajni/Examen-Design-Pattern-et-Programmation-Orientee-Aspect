package me.elmajni.examdpelmajni.design_patterns;

import me.elmajni.examdpelmajni.aspects.Log;
import me.elmajni.examdpelmajni.design_patterns.IAncienGenerateCode;

public class AncienImpGenerateCode implements IAncienGenerateCode {
    @Log
    public void genererCode() {
        System.out.println("Ancienne Implmentation Génération du code");
    }
}
