import java.lang.reflect.*;
import java.lang.reflect.Method;

import java.util.Scanner;

public class TM {

    public TM(){
    }

    public static void main(String[] args){
        TM tm = new TM();
        Scanner reader = new Scanner(System.in);
        while (true){
            System.out.println("Ready to process commands...");
            String in = reader.nextLine();
            if(in.equals("exit")){
                break;
            } else {
                tm.runTheMethod(in);
            }
        }
        reader.close();
    }

    public void runTheMethod(String methodName){
        try {
            Method method = TM.class.getMethod(methodName);
            method.invoke(this);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static void navigate(String in){
        switch (in) {
            case "start":
                start();
                break;
            case "pause":
                pause();
                break;
            case "resume":
                resume();
                break;
            case "stop":
                stop();
                break;
            case "save":
                save();
                break;
            case "reset":
                resetSession();
                break;
            case "resetall":
                resetAll();
                break;
            case "aot":
                aot();
                break;
            case "setcat":
                setCat();
                break;
            case "description":
                description();
                break;
            case "history":
                history();
                break;
            case "categories":
                categories();
                break;
            case "about":
                about();
                break;
            case "git":
                git();
                break;
            case "bug":
                bug();
                break;
            case "help":
                help();
                break;
            case "user":
                user();
                break;
            default:
                System.out.println("Unknown command");
                break;
        }
    }

    //Basic commands
    public static void start() {
        System.out.println("start method invoked!");
    }

    public static void pause() {
            System.out.println("Pause method invoked!");
    }

    public static void resume() {
    }

    public static void stop() {
    }

    public static void save() {
    }

    //Advanced commands
    public static void setCat() {
    }

    public static void description() {
    }

    //Reset commands
    public static void resetSession() {
    }

    public static void resetAll() {
    }

    //More
    public static void help() {
    }

    public static void aot() {
    }

    public static void bug() {
    }

    public static void git() {
    }

    public static void about() {
    }

    //Editors
    public static void history() {
    }

    public static void categories() {
    }

    //Advanced features
    public static void user() {
    }

    public static void alarm() {
    }
}
