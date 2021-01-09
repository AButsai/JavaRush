package JavaCore.level6.lecture13.task11;

import JavaCore.level6.lecture13.task11.common.*;

public class Solution {
    public static void main(String[] args) {
        ImageReader reader = ImageReaderFactory.getImageReader(ImageTypes.JPG);
        System.out.println(reader.toString());

        ImageReader reader2 = ImageReaderFactory.getImageReader(ImageTypes.BMP);
        System.out.println(reader2.toString());

        ImageReader reader3 = ImageReaderFactory.getImageReader(ImageTypes.PNG);
        System.out.println(reader3.toString());

        ImageReader reader1 = ImageReaderFactory.getImageReader(null);
        System.out.println(reader1);
    }
}
