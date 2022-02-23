# devsuperior-desafio-cap05

Casos de uso

Efetuar login
1 - [IN] O usuário anônimo informa seu email e senha
2 - [OUT] O sistema informa um token válido

Listar filmes
1 - [OUT] O sistema apresenta uma listagem dos nomes de todos gêneros, bem como uma listagem paginada com título, subtítulo, ano e imagem dos filmes, ordenada alfabeticamente por título.
2 - [IN] O usuário visitante ou membro seleciona, opcionalmente, um gênero.
3 - [OUT] O sistema apresenta a listagem atualizada, restringindo somente ao gênero selecionado.

Visualizar detalhes do filme
1 - [IN] O usuário visitante ou membro seleciona um filme
2 - [OUT] O sistema informa título, subtítulo, ano, imagem e sinopse do filme, e também uma listagem dos textos das avaliações daquele filme juntamente com nome do usuário que fez cada avaliação.
3 - [IN] O usuário membro informa, opcionalmente, um texto para avaliação do filme.
4 - [OUT] O sistema apresenta os dados atualizados, já aparecendo também a avaliação feita pelo usuário.

    Exceção 3.1 - Texto vazio
    3.1.1. O sistema apresenta uma mensagem de que não é permitido texto vazio na avaliação 
