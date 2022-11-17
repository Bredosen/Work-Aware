package me.work.aware.managers;

import me.work.aware.handlers.Console;
import me.work.aware.handlers.DynamicDisplay;
import me.work.aware.handlers.StaticDisplay;
import me.work.aware.types.DisplayType;

public final class DisplayManager {

    private static DisplayType currentDisplayType;

    private static DynamicDisplay dynamicDisplay;
    private static StaticDisplay staticDisplay;

    public static void register() {
        Console.print("Registering DisplayManager");
        dynamicDisplay = new DynamicDisplay();
        staticDisplay = new StaticDisplay();
    }

    public static void unRegister() {
        Console.print("UnRegistering DisplayManager");
    }

    public static void setView(final DisplayType displayType) {
        Console.print("Setting display view to " + displayType.name());
    }

    public static DisplayType currentDisplayType() {
        return currentDisplayType;
    }

}
