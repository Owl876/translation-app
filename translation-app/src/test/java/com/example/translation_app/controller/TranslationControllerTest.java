import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest (classes = TranslationAppApplicationTests.class)
@AutoConfigureMockMvc
public class TranslationControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testTranslateSuccess() throws Exception {
        String jsonRequest = "{ \"textToTranslate\": \"Hello\", \"originalLang\": \"en\", \"translatedLang\": \"ru\" }";

        mockMvc.perform(post("/api/v1/translate")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(jsonRequest))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.translatedText").value("Здравствуйте"));
    }
}
