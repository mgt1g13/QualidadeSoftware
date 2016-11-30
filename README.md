Trabalho de Qualidade de Software
===================


Este repositório contém uma solução para o segundo trabalho da disciplina de Qualidade de Software. O trabalho consiste no desenvolvimento de uma bateria de testes unitários para um jogo de código-aberto a escolha do grupo. Para este trabalho,  optou-se por usar uma implementação Java do jogo Paciência, originalmente disponível [Aqui](https://sourceforge.net/projects/javasol/).

----------


Instalação
-------------

Pre-requisitos:



 - Eclipse com EGit (para o trabalho foi usado Eclipse LUNA SR2, mas deve funcionar em versões mais recentes). 
 - Java na versão 1.6, apesar de dever funcionar em versões mais recentes. 
 - JUnit 4. Normalmente a instalação básica do Eclipse já contém essa versão
 

Para executar, o processo é o seguinte:

 1. No Eclipse, vá em `Window->Open Perspective->Other...`.
 2. Selecione GIT.
 3. Na nova perpectiva, clique em `Clone a new Repository`.
 4. No campo URI, entre:   `https://github.com/mgt1g13/QualidadeSoftware.git` e clique em `Next->Next->Finish`.
 5. Clique com o botão direito no mouse no novo repositório da aba `Git Repositories`.
 6. Clique em `Import Projects...`.
 7. Selecione `Import Existing Projects into Worskpace` e clique em `Next->Finish` .
 8.  O projeto então já está no workspace. Para rodar os testes, selecione um dos arquivos fontes dentro do pacote testes e clique em `Run->Run as...->JUnit Teste` na barra de ferramentas.
 9. Para rodar o jogo, clique em qualquer .java e em `Run->Run as...->JUnit Teste` na barra de ferramentas.


