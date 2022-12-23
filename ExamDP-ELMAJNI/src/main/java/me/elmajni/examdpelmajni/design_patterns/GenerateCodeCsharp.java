package me.elmajni.examdpelmajni.design_patterns;

import me.elmajni.examdpelmajni.aspects.Log;

public class GenerateCodeCsharp implements IStratgyGenerateCode {
    @Log
    @Override
    public void genererCode() {
        System.out.println("Generate code Csharp");
    }
}
