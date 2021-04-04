package tests;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.*;

public class DocFileTests {
    @Test
    void docTest() {
        String txtFilePath = "./src/test/resources/1.doc";
        String expectedData = "text from .doc file";

        String actualData = readTextFromDocFile(txtFilePath);

        assertThat(actualData, containsString(expectedData));
    }

    @Test
    void docxTest() {
        String txtFilePath = "./src/test/resources/1.docx";
        String expectedData = "text from .docx file";

        String actualData = readTextFromDocxFile(txtFilePath);

        assertThat(actualData, containsString(expectedData));
    }
}

