package me.work.aware;

import me.work.aware.handlers.Console;
import me.work.aware.managers.DataManager;

/**
 * @author Anders B. Hansen
 * @version 1.0
 * @since 11/17/2022
 */
public final class WorkAware {

    public final static String NAME = "WorkAware";
    public final static double VERSION = 1.0D;

    //<editor-fold desc="Singleton & Constructor">
    /**
     * WorkAware Singleton instance.
     */
    private final static WorkAware singleton;

    // Static constructor for declaring instances & variables.
    static {
        singleton = new WorkAware(); // Declare WorkAware Singleton instance.
    }

    /**
     * Return WorkAware Singleton instance.
     *
     * @return singleton
     */
    public static WorkAware instance() {
        return WorkAware.singleton;
    }

    /**
     * Program startup method
     *
     * @param args
     */
    public static void main(String[] args) {
        Console.print("Starting up " + displayName());
        Console.print("Initializing " + displayName());
        instance().initialize();
        Console.print("Terminating " + displayName());
        instance().terminate();
        Console.print("Shutting down " + displayName());
    }

    /**
     * Returns programs display name which contain name and version formatted.
     *
     * @return programs display name.
     */
    public static String displayName() {
        return NAME + " | V" + VERSION;
    }
    //</editor-fold>

    /**
     * When program gets initialized.
     */
    public void initialize() {
        DataManager.registerData();
    }

    /**
     * When program gets terminated.
     */
    public void terminate() {

    }
}