/**
 * Workers: processadores assíncronos que consomem filas ou executam tarefas em background.
 *
 * Exemplo: um worker pode reprocessar transferências que falharam na integração com o
 * banco externo, consultando registros com status PENDENTE e tentando novamente.
 */
package com.example.pixapi.infrastructure.worker;
