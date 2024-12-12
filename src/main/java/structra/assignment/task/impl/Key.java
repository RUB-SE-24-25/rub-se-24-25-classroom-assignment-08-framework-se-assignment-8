package structra.assignment.task.impl;

import structra.assignment.framework.llm.KeyProvider;

public class Key implements KeyProvider {

    private static final String API_KEY_ENV_VAR = "GPT_API_KEY";
    @Override
    public String getApiKey() {
        String apiKey = System.getenv(API_KEY_ENV_VAR);
        if (apiKey == null) {
            throw new RuntimeException("API key not found in environment variable: " + API_KEY_ENV_VAR);
        }
        return apiKey;
    }
}
