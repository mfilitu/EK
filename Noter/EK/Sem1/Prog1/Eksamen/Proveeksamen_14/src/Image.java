import com.sun.jdi.InvalidTypeException;

import java.util.Locale;

public class Image {
    private String fileName;
    private int width;
    private int height;

    public Image(String fileName, int width, int height) throws Exception {
        if (width < 1 || height < 1) {
            throw new InvalidTypeException("invalid height or width");
        }
        this.fileName = fileName;
        this.width = width;
        this.height = height;

    }

    public boolean isKnownFileType() {
        if (fileName.isEmpty()){
            return false;
        }
        return fileName.toLowerCase().contains(".gif") || fileName.toLowerCase().contains(".jpg") || fileName.toLowerCase().contains(".jpeg") || fileName.toLowerCase().contains(".png") || fileName.toLowerCase().contains(".webp") || fileName.toLowerCase().contains(".bmp");

    }

    public boolean isPortrait(){
        return height > width;
    }

    public boolean isLandscape(){
        return width > height;
    }



}
