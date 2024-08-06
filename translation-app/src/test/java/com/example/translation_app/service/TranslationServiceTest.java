//package com.example.translation_app.service;
//
//import com.example.translation_app.dto.TranslationRequest;
//import com.example.translation_app.dto.TranslationResponse;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class TranslationServiceTest {
//
//    private TranslationService translationService = new TranslationService();
//
//    @Test
//    public void testTranslate() {
//        TranslationRequest request = new TranslationRequest();
//        request.setTextToTranslate("Hello");
//        request.setOriginalLang("en");
//        request.setTranslatedLang("ru");
//
//        TranslationResponse response = translationService.translate(request);
//        assertEquals("Переведенный текст", response.getTranslatedText());
//    }
//}
