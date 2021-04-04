package tests;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.getPdf;

public class PdfFileTests {
    @Test
    void pdfFileTest() throws IOException {
        String txtFilePath = "./src/test/resources/1.pdf";
        String expectedData = "Apache POI - Component Overview";

        PDF pdf = getPdf(txtFilePath);

        assertThat(pdf, PDF.containsText(expectedData));
    }
}
