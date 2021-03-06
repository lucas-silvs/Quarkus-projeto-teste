package com.crudquarkus.controller;

import com.crudquarkus.models.request.UsuarioContractRequest;
import com.crudquarkus.models.request.UsuarioCredencialRequest;
import com.crudquarkus.models.response.ContractResponse;
import com.crudquarkus.models.response.UsuarioContractResponse;
import org.jboss.resteasy.reactive.RestResponse;

public interface UsuarioController {

    RestResponse<ContractResponse> cadastrarUsuario(UsuarioContractRequest userDataRequest);

    RestResponse<UsuarioContractResponse> buscarUsuario(String identificador);


    RestResponse<Object> validarCredenciais (UsuarioCredencialRequest credencialRequest);

    RestResponse<Object> excluirUsuario (String identificador);

    RestResponse<Object> atualizarDadosUsuario(UsuarioContractRequest updateContractRequest);


}
