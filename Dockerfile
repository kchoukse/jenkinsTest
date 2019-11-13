FROM tomcat:8.0

LABEL maintainer="KunalChoukse"

ADD ./target/restdemo.war /usr/local/tomcat/webapps/

EXPOSE 8081



CMD ["startup.sh", "run"]


