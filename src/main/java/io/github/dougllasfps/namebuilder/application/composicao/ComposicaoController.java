package io.github.dougllasfps.namebuilder.application.composicao;

import io.github.dougllasfps.namebuilder.model.entity.Composicao;
import io.github.dougllasfps.namebuilder.model.entity.TipoComposicao;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("composicoes")
@RequiredArgsConstructor
public class ComposicaoController {

    private final ComposicaoService service;

    @PostMapping
    ResponseEntity criar(@RequestBody CreateComposicaoResource resource){
        Composicao composicao = resource.toModel();
        service.criar(composicao);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    ResponseEntity<Page<PesquisaComposicaoResource>> buscar(
            @RequestParam(value = "tipo", required = false) TipoComposicao tipo,
            @RequestParam(value = "descricao", required = false) String descricao,
            Pageable pageRequest
    ){
        Page<PesquisaComposicaoResource> result = service
                .buscar(tipo, descricao, pageRequest)
                .map(p -> PesquisaComposicaoResource.fromModel(p));
        return  ResponseEntity.ok(result);
    }
}
