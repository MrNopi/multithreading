package com.company;

public class Main {
    private int x = 0;
    private StringBuffer sb = new StringBuffer();
    public static void main(String[] args) {
        Main main = new Main();
        main.asd();
    }

    public void asd() {
        Thread thread = new ExtendsThread();
        Runnable runnable = new ImplementsRunnable();
        while(x != 100) {
            thread.run();
            runnable.run();
        }
        System.out.println(sb.toString());
    }

    private class ExtendsThread extends Thread {
        @Override
        public void run() {
            sb.append(this.getName()).append(" incrementing value: ").append(++x).append('\n');
        }
    }

    private class ImplementsRunnable implements Runnable {
        @Override
        public void run() {
            sb.append("Runnable thread incrementing value: ").append(++x).append('\n');
        }
    }
}
