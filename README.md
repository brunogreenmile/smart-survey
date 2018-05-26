# smart-survey
Desafio proposto
A especificação dos casos testes estão na raiz do projeto, na planilha "test_cases.xlsx"

1) É preciso importar o repositório git do projeto (https://github.com/brunogreenmile/smart-survey/), fazendo checkout em uma instalação Eclipse local.
2) Alt + f5 no arquivo maven para atualização das dependências.
3) Instalar o plugin do Cucumber a partir de https://marketplace.eclipse.org/content/cucumber-jvm-eclipse-plugin
4) Os testes podem ser executados clicando com botão direito no arquivo src/test/java/SmartSurveyTest.java e "Run as JUnit Test".


Observações:

a) Dependências do cadastro, tais como Equipment, Route, Driver - não estavam cadastradas (não eram exibidas na lista de seleção) ou então não tinham permissão de visualização para meu usuário, acredito que não seja bug - apenas faltou massa de dados.

b) Ao adicionar ApplicationRules com Stop Events de Stop Type, é exibida a mensagem "No Permission". O mesmo acontece com Location > AccountType.

c) Questions do tipo Entity exibe a mensagem "No Permission".

d) Questions com resposta do tipo LongText exibem o texto "undefined" do componente de texto.

e) Ao selecionar a opção "Reports" na listagem de SmartSurvey, nada aconteceu. Assumi que deveria ocorrer uma exportação para excel ou impressão.





