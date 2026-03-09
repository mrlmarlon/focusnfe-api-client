package org.frekele.fiscal.focus.nfe.client.repository.empresa;

import org.frekele.fiscal.focus.nfe.client.core.FocusMediaType;
import org.frekele.fiscal.focus.nfe.client.model.request.empresa.body.EmpresaBodyRequest;
import org.frekele.fiscal.focus.nfe.client.model.request.nfe.body.*;
import org.frekele.fiscal.focus.nfe.client.model.response.empresa.EmpresaResponse;
import org.frekele.fiscal.focus.nfe.client.model.response.nfe.*;

import javax.ws.rs.*;
import java.io.Serializable;

/**
 * Proxy RestEasy para chamadas da API V2 NF-e.
 *
 * @author frekele - Leandro Kersting de Freitas
 */
@Path("/v2")
@Produces({FocusMediaType.APPLICATION_JSON_CHARSET_UTF8})
@Consumes({FocusMediaType.APPLICATION_JSON_CHARSET_UTF8})
interface FocusEmpresaV2ProxyClient extends Serializable {

    /**
     * POST - Emitir NFe utilizando dados simplificados.
     * Este processo é assíncrono. Ou seja, após a emissão a nota será enfileirada para processamento.
     * Cria uma nota fiscal e a envia para processamento.
     * Exemplo de requisição: POST https://api.focusnfe.com.br/v2/nfe?ref=REFERENCIA
     */
    @POST
    @Path("empresas")
    EmpresaResponse cadastrar(@HeaderParam("Authorization") String authorization,
                              EmpresaBodyRequest bodyRequest);

    /**
     * GET - Consultar o status de NFe emitidas.
     * Este processo é assíncrono. Ou seja, após a emissão a nota será enfileirada para processamento.
     * Consulta a nota fiscal com a referência informada.
     * Exemplo de requisição: GET https://api.focusnfe.com.br/v2/nfe/REFERENCIA
     */
    @GET
    @Path("empresas/{id}")
    EmpresaResponse consultar(@HeaderParam("Authorization") String authorization,
                              @PathParam("id") String id);

    @PUT
    @Path("empresas/{id}")
    EmpresaResponse alterar(@HeaderParam("Authorization") String authorization,
                            @PathParam("id") String id,
                            EmpresaBodyRequest bodyRequest);

    @DELETE
    @Path("empresas/{id}")
    EmpresaResponse excluir(@HeaderParam("Authorization") String authorization,
                            @PathParam("id") String id);

  
}
