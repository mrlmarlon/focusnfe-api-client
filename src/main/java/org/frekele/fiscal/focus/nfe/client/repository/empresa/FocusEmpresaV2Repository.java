package org.frekele.fiscal.focus.nfe.client.repository.empresa;

import org.frekele.fiscal.focus.nfe.client.model.request.empresa.body.EmpresaBodyRequest;
import org.frekele.fiscal.focus.nfe.client.model.request.nfe.body.*;
import org.frekele.fiscal.focus.nfe.client.model.response.empresa.EmpresaResponse;
import org.frekele.fiscal.focus.nfe.client.model.response.nfe.*;

import java.io.Serializable;

/**
 * Interface com chamadas para API V2 NF-e.
 *
 * @author frekele - Leandro Kersting de Freitas
 */
public interface FocusEmpresaV2Repository extends Serializable {

    /**
     * POST - Emitir NFe utilizando dados simplificados.
     * Este processo é assíncrono. Ou seja, após a emissão a nota será enfileirada para processamento.
     * Cria uma nota fiscal e a envia para processamento.
     * Exemplo de requisição: POST https://api.focusnfe.com.br/v2/nfe?ref=REFERENCIA
     */
    EmpresaResponse cadastrar(EmpresaBodyRequest bodyRequest);

    /**
     * GET - Consultar o status de NFe emitidas.
     * Este processo é assíncrono. Ou seja, após a emissão a nota será enfileirada para processamento.
     * Consulta a nota fiscal com a referência informada.
     * Exemplo de requisição: GET https://api.focusnfe.com.br/v2/nfe/REFERENCIA
     */
    EmpresaResponse consultar(String id);

    /**
     * GET - Consultar o status de NFe emitidas.
     * Este processo é assíncrono. Ou seja, após a emissão a nota será enfileirada para processamento.
     * Consulta a nota fiscal com a referência informada e o seu status de processamento.
     * Exemplo de requisição: GET https://api.focusnfe.com.br/v2/nfe/REFERENCIA?completa=(0|1)
     */
    EmpresaResponse alterar(String id, EmpresaBodyRequest bodyRequest);

    EmpresaResponse excluir(String id);

}
