/**
 * Camada de aplicação: orquestra os casos de uso coordenando domínio e infraestrutura.
 * Não contém regras de negócio nem detalhes técnicos — apenas o fluxo da operação.
 *
 * Exemplo: {@link com.example.pixapi.application.TransferenciaService#transferir}
 * valida idempotência, persiste a transferência e aciona o banco externo.
 */
package com.example.pixapi.application;
