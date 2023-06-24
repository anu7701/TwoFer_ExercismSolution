public class Twofer {
    public String twofer(String name) {
        String speak;
        if (name != null)
            speak = "One for " + name + ", one for me.";
        else
            speak = "One for you, one for me.";
        return speak;
    }
}
