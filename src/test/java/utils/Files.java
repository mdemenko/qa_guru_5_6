package utils;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.File;
import java.io.FileInputStream;

public class Files {

    public static File getFile(String path) {
        return new File(path);
    }

    public static String readTextFromDocFile(String path) {
        String result = "";
        try (FileInputStream fis = new FileInputStream(getFile(path));
             HWPFDocument document = new HWPFDocument(fis);
             WordExtractor extractor = new WordExtractor(document)) {
                result = extractor.getText();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static String readTextFromDocxFile(String path) {
        String result = "";
        try (FileInputStream fis = new FileInputStream(getFile(path));
             XWPFDocument document = new XWPFDocument(fis);
             XWPFWordExtractor extractor = new XWPFWordExtractor(document)) {
                result = extractor.getText();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
