package Structures;

public class NotCompatible {
    private final String xIdentifier;
    private final String yIdentifier;

    public NotCompatible(String[] input) {
        this(input[0], input[1]);
    }

    public NotCompatible(String xIdentifier, String yIdentifier) {
        this.xIdentifier = xIdentifier;
        this.yIdentifier = yIdentifier;
    }

    @Override
    public String toString() {
        return String.format("%s, %s\n", xIdentifier, yIdentifier);
    }

    public String getxIdentifier() { return xIdentifier; }
    public String getyIdentifier() { return yIdentifier; }
}