package homeworks.homework2.src;

public abstract class AnimateCreature extends Creator{

    private double maxHeightJump;
    private double maxDistance;
    private int status;
    static int counter;
    public AnimateCreature(String name, double maxHeightJump, double maxDistance) {
        super(name, maxHeightJump, maxDistance);
    }
}
