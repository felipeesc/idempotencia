/**
 * HTTP: controllers REST que recebem requisições externas e delegam para a aplicação.
 * Responsável por deserializar entrada, validar formato e serializar a resposta.
 *
 * Exemplo: {@link com.example.pixapi.infrastructure.http.TransferenciaController}
 * expõe POST /transferencias, extrai o header de idempotência e chama o service.
 */
package com.example.pixapi.infrastructure.http;
