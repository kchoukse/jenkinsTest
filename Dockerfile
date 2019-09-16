FROM tomcat:8.0

LABEL maintainer="KunalChoukse"

ADD ./target/restdemo.war /usr/local/tomcat/webapps/

EXPOSE 8080



CMD ["startup.sh", "run"]


