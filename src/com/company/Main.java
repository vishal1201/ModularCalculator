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
        switch (moduleIndex) {
            case 1:
                executeChoice(moduleIndex);
                break;
            case 2:
                executeChoice(moduleIndex);
                break;
            case 3:
                executeChoice(moduleIndex);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    private static void executeChoice(int index) {
        System.out.println("Selected module index: " + index);
        EModule selectedModule = getSelectedModule(index);
        System.out.println("Starting module: " + selectedModule.name());
    }

    private static EModule getSelectedModule(int index) {
        EModule selectedModule = null;
        for (EModule eModule : EModule.values()) {
            if (eModule.ordinal() + 1 == index) {
                selectedModule = eModule;
            }
        }

        return selectedModule;
    }

}

