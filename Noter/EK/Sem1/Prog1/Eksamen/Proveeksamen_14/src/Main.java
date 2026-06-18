public class Main {
    public static void main(String[] args) throws Exception {
        Image image = new Image("image.png", 700, 500);

        System.out.println(image.isLandscape());
        System.out.println(image.isPortrait());
        System.out.println(image.isKnownFileType());

    }
}
