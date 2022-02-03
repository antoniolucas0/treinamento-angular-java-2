package com.indracompany.treinamento.model.service;

import org.springframework.stereotype.Service;

import com.indracompany.treinamento.model.entity.Operacoes;
import com.indracompany.treinamento.model.repository.OperacoesRepository;

@Service
public class OperacoesService extends GenericCrudService<Operacoes, Long, OperacoesRepository>{

}