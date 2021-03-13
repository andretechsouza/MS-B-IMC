FROM openjdk:11

ARG PROFILE
ARG ADDITIONAL_OPTS

ENV PROFILE=${PROFILE}
ENV ADDITIONAL_OPTS=${ADDITIONAL_OPTS}

WORKDIR /opt/microservicos/imc-rest-v1

COPY /target/backend-imc-rest-v1*.jar ms-b-imc-rest-v1.jar

SHELL ["/bin/bash", "-c"]

EXPOSE 5009
EXPOSE 8080

CMD java ${ADDITIONAL_OPTS} -jar ms-b-imc-rest-v1.jar --spring.profiles.active=${PROFILE}