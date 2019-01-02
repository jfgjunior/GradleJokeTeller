package com.example.joketeller;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class JokeCreator {
    //Jokes from: https://www.rd.com/funny-stuff/short-jokes/
    private static final List<String> JOKES = Arrays.asList(
            "What's the best thing about Switzerland? I don't know, but the flag is a big plus",
            "did you hear about the mathematician who's afraid of negative numbers? He'll stop at nothing to avoid them.",
            "Did you hear about the claustrophobic astronaut? He just needed a little space.",
            "Why don't Calculus majors throw house parties? Because you should never drink and derive.");

    public static String getJoke() {
        int index = new Random().nextInt(JOKES.size()) % JOKES.size();
        return JOKES.get(index);
    }
}
