package me.elmajni.examdpelmajni.design_patterns;

import me.elmajni.examdpelmajni.aspects.Log;

public class GenerateCodeJava implements IStratgyGenerateCode {
    @Log
    @Override
    public void genererCode() {
        System.out.println("Générer le code JAVA");
    }
}
