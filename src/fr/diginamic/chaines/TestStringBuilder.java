package fr.diginamic.chaines;

public class TestStringBuilder {

    public static void main(String[] args) {
        // Chronométrage en utilisant StringBuilder
        long startTime = System.currentTimeMillis();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= 100000; i++) {
            stringBuilder.append(i);
        }

        long endTime = System.currentTimeMillis();
        long durationStringBuilder = endTime - startTime;
        System.out.println("Temps utilisé avec StringBuilder : " + durationStringBuilder + " ms");

        // Chronométrage en utilisant String et l'opérateur de concaténation +
        startTime = System.currentTimeMillis();

        String result = "";
        for (int i = 1; i <= 100000; i++) {
            result += i;
        }

        endTime = System.currentTimeMillis();
        long durationStringConcatenation = endTime - startTime;
        System.out.println("Temps utilisé avec String et concaténation + : " + durationStringConcatenation + " ms");

        // Comparaison des résultats
        System.out.println("Différence de temps entre StringBuilder et String : " + (durationStringConcatenation - durationStringBuilder) + " ms");
    }
}
