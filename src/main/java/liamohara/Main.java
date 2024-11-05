package liamohara;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public String makeDiamond(int diamondSize) {

        String diamond = "";

        if (diamondSize <= 0 || diamondSize % 2 == 0) {
            return "You must provide diamond size as a positive odd integer.";

        } else if (diamondSize == 1) {
            return "Too small. The smallest diamond possible is 3.";

        } else {
            StringBuilder rowString = new StringBuilder();
            int diamondCentre = diamondSize / 2 + 1;
            String[] diamondArray = new String[diamondSize];
            String[] diamondFormattingArray = new String[diamondSize];

            for (int i = 0; i < diamondCentre; i++) {
                if (i == 0) {
                    rowString.append("*");

                } else {
                    int loops = i * 2 + 1;
                    while (loops > 0) {
                        rowString.append("*");
                        loops --;

                    }
                }
                diamondArray[i] = rowString.toString();
                rowString.setLength(0);

            }
            for (int i = diamondCentre, j = diamondCentre -2; i < diamondArray.length; i++, j--) {

                    rowString.append(diamondArray[j]);
                    diamondArray[i] = rowString.toString();
                    rowString.setLength(0);

                }
                StringBuilder formattedDiamond = new StringBuilder();

        for (int i = 0; i < diamondCentre ; i++) {
            int diamondRow = i + 1;
            while (diamondRow < diamondCentre) {
                formattedDiamond.append(" ");
                diamondRow ++;

            }
            diamondFormattingArray[i] = formattedDiamond.toString();
            formattedDiamond.setLength(0);

        }
        for (int i = diamondCentre; i < diamondSize; i++) {
            int diamondRow = i + 1;
            while (diamondRow > diamondCentre) {
                formattedDiamond.append(" ");
                diamondRow --;

            }
            diamondFormattingArray[i] = formattedDiamond.toString();
            formattedDiamond.setLength(0);

        }
        StringBuilder assembleDiamond = new StringBuilder();

        for (int i = 0; i < diamondFormattingArray.length; i++) {
            assembleDiamond.append(diamondFormattingArray[i]);

                if (i < diamondArray.length -1 ) {
                    assembleDiamond.append(diamondArray[i]).append("\n");

                } else {
                    assembleDiamond.append(diamondArray[i]);

                }
            }
        diamond = assembleDiamond.toString();

        }
        return diamond;

    }
}