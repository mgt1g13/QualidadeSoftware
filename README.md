Trabalho de Qualidade de Software
===================


Este reposit—rio contm uma solu‹o para o segundo trabalho da disciplina de Qualidade de Software. O trabalho consiste no desenvolvimento de uma bateria de testes unit‡rios para um jogo de c—digo-aberto a escolha do grupo. Para este trabalho,  optou-se por usar uma implementa‹o Java do jogo Pacincia, originalmente dispon’vel [Aqui](https://sourceforge.net/projects/javasol/).

----------


Instala‹o
-------------

Pre-requisitos:



 - Eclipse com EGit (para o trabalho foi usado Eclipse LUNA SR2, mas deve funcionar em vers›es mais recentes). 
 - Java na vers‹o 1.6, apesar de dever funcionar em vers›es mais recentes. 
 - JUnit 4. Normalmente a instala‹o b‡sica do Eclipse j‡ contm essa vers‹o
 

Para executar, o processo  o seguinte:

 1. No Eclipse, v‡ em `Window->Open Perspective->Other...`.
 2. Selecione GIT.
 3. Na nova perpectiva, clique em `Clone a new Repository`.
 4. No campo URI, entre:   `https://github.com/mgt1g13/QualidadeSoftware.git` e clique em `Next->Next->Finish`.
 5. Clique com o bot‹o direito no mouse no novo reposit—rio da aba `Git Repositories`.
 6. Clique em `Import Projects...`.
 7. Selecione `Import Existing Projects into Worskpace` e clique em `Next->Finish` .
 8.  O projeto ent‹o j‡ est‡ no workspace. Para rodar os testes, selecione um dos arquivos fontes dentro do pacote testes e clique em `Run->Run as...->JUnit Teste` na barra de ferramentas.
 9. Para rodar o jogo, clique em qualquer .java e em `Run->Run as...->JUnit Teste` na barra de ferramentas.


