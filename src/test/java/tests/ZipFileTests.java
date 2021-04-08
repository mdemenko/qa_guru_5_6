package tests;

import net.lingala.zip4j.exception.ZipException;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.readTextFromDocFile;
import static utils.Files.unzip;

public class ZipFileTests {
    @Test
    void zipFileTest() throws ZipException {
        String zipFilePath = "./src/test/resources/1.zip";
        String unzipFolderPath = "./src/test/resources/unzip";
        String zipPassword = "qaguru";
        String unzipDocFilePath = "./src/test/resources/unzip/1.doc";
        String expectedData = "text from .doc file";

        unzip(zipFilePath, unzipFolderPath, zipPassword);

        String actualData = readTextFromDocFile(unzipDocFilePath);

        assertThat(actualData, containsString(expectedData));
    }
}
