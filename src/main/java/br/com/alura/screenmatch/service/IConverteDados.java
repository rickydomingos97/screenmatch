package br.com.alura.screenmatch.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe );
}

// O IConverteDados recebe um json que eh uma String,
// vai receber uma classe e la no conversor de dados
// vou tentar transformar esse json numa classe
// que for indicada