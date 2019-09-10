pipeline {
    agent {
	docker {
            image 'mysql' 
            args '--name mysql -e MYSQL_ROOT_PASSWORD=abc123'
	    image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2' 
        }
    }
    stages {
        stage('Build') { 
            steps {
		sh 'create database spring'
                sh 'mvn clean install -DskipTests'
		sh 'mvn tomcat:run-war' 

            }
        }
    }
}
