package com.milena.literalura.service;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface IConverteDados {
    public <T> T obterDados(String json,Class<T> classe) throws JsonProcessingException;
}
