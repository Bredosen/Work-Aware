package me.work.aware.managers;

import me.work.aware.handlers.Console;

import java.io.File;
import java.io.IOException;

public final class DataManager {

    /**
     * Register dataManager, creating files, loading files.
     */
    public static void registerData() {
        Console.print("Registering Data");
        registerWorkAwareRoot();
        registerSettings();
    }

    public static void unRegisterData() {
        Console.print("UnRegistering Data");
    }

    private static void registerSettings() {
        final File settings = getSettings();
        if (settings.isFile()) return;

        try {
            settings.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void registerWorkAwareRoot() {
        final File rootFolder = getRootFolder();
        if (!rootFolder.isDirectory()) rootFolder.mkdirs();
    }


    public static File getRootFolder() {
        return new File(System.getenv("APPDATA") + "\\WorkAware");
    }

    public static File getSettings() {
        return new File(getRootFolder().getPath() + "/settings.wa");
    }

}
