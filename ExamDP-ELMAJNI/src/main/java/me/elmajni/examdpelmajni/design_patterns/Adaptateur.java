package me.elmajni.examdpelmajni.design_patterns;


import me.elmajni.examdpelmajni.aspects.Log;

public class Adaptateur extends AncienImpGenerateCode implements IStratgyGenerateCode {

    @Log
    @Override
    public void genererCode() {
        genererCode();
    }
}
