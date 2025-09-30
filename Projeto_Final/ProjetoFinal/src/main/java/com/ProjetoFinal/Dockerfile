# ----------------------------------------------------------------------
# ESTÁGIO 1: BUILD - Compilação do Projeto
# Usa uma imagem robusta com Maven e JDK 17
# ----------------------------------------------------------------------
FROM maven:3.9.6-eclipse-temurin-17 AS build

# Define o diretório de trabalho onde o código será copiado
WORKDIR /app

# Copia o arquivo de configuração do Maven (pom.xml) primeiro. 
# Isso permite que o Docker utilize o cache se o pom.xml não mudar.
COPY pom.xml .

# Baixa as dependências.
RUN mvn dependency:go-offline

# Copia todo o código-fonte restante
COPY src src

# Comando para compilar o projeto (o arquivo pom.xml está na raiz do WORKDIR)
RUN mvn clean package -DskipTests


# ----------------------------------------------------------------------
# ESTÁGIO 2: RUNTIME - Execução da Aplicação
# Usa uma imagem leve (somente o JRE) para rodar o JAR
# ----------------------------------------------------------------------
FROM eclipse-temurin:17-jre-alpine

# Define o nome do arquivo JAR.
# O nome do JAR é gerado a partir da tag <artifactId> no seu pom.xml
# Assumindo que seu artifactId seja "ProjetoFinal" e a versão seja "0.0.1-SNAPSHOT"
ARG JAR_FILE_NAME=ProjetoFinal-0.0.1-SNAPSHOT.jar

# Copia o JAR do estágio de build (que está em /app/target)
COPY --from=build /app/target/${JAR_FILE_NAME} app.jar

# A porta padrão do Spring Boot é 8080. Render espera que a aplicação se ligue à porta definida pela variável PORT.
# Como você configurou o server.port no application.properties para usar ${PORT:8080},
# essa porta de exposição serve apenas como documentação.
EXPOSE 8080

# Comando de inicialização do Spring Boot
ENTRYPOINT ["java", "-jar", "/app.jar"]