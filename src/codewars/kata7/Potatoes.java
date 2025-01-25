package codewars.kata7;

class Potatoes {

    public static void main(String[] args) {

        System.out.println(potatoes(99, 100, 98));

    }

    public static int potatoes(int p0, int w0, int p1) {

        double dryMass = w0 * ((100 - p0) / 100.0);
        double finalWeight = dryMass * (100.0 / (100 - p1));

        return (int) Math.floor(finalWeight);

    }
}
