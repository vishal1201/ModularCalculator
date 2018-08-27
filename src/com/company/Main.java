package com.company;

import com.company.Module.EModule;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int moduleIndex;
        System.out.println("Selcet a module:");

        for (EModule eModule : EModule.values()) {
            System.out.println((eModule.ordinal() + 1) + ". " + eModule.name());
        }

        Scanner sc = new Scanner(System.in);
        moduleIndex = sc.nextInt();
        EModule selectedModule = getSelectedModule(moduleIndex);
        if (selectedModule != null) {
            executeChoice(selectedModule);
        } else {
            System.out.println("Couldn't find corresponding module...");
        }
    }

    private static void executeChoice(EModule eModule) {
        System.out.println("Starting module: " + eModule.name());
    }

    private static EModule getSelectedModule(int index) {
        EModule selectedModule = null;
        EModule[] eModules = EModule.values();

        if ((eModules.length < index) || index <= 0) {
            System.out.println("Invalid index.");
            return null;
        } else {
            for (EModule eModule : EModule.values()) {
                if (eModule.ordinal() + 1 == index) {
                    selectedModule = eModule;
                }
            }
        }
        return selectedModule;
    }

}

