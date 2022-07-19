package pl.edu.pjatk.exercise3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            exception();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void exception() throws IOException {
        throw new IOException("file error!");
    }
}
