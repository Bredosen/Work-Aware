package me.work.aware.managers;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import me.work.aware.handlers.Console;

public final class GlobalHookManager {

    public static void register() {
        try {
            Console.print("Registering GlobalScreen");
            GlobalScreen.registerNativeHook();
        } catch (NativeHookException e) {
            throw new RuntimeException(e);
        }
    }

    public static void unRegister() {
        try {
            Console.print("UnRegistering GlobalScreen");
            GlobalScreen.unregisterNativeHook();
        } catch (NativeHookException e) {
            throw new RuntimeException(e);
        }
    }
}
