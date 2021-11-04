pipeline{
    agent any
    tools{
    /*Hier Build Tool mit entsprechender Version einfügen*/
    maven 'apache-maven-3.8.3'
    }    
    stages{
		stage("checkout"){
            steps{
        	echo'checking out'
        	/*checkout scm, Code im Snippet Generator Generiert */
        	checkout([$class: 'GitSCM', branches: [[name: '*/*']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/SoSp17/Test.git']]])
            }
        }
        stage("build"){
            steps{
        echo'building'
        /*mit dem Präfix sh kommt hier der Shell befehl der benötigt wird um den Build auszuführen*/
        sh 'mvn clean compile'
       /*build quietPeriod: 5, job: 'Test1'*/
            }
        }
        stage("test"){
            steps{
        	echo'testing'
        	sh 'mvn test'
        	junit '**/target/surefire-reports/TEST-*.xml'
        	/*Sonarqube*/
            }
            post{
                always {
                    
                }

            }

        }
        stage("deploy"){
            steps{
        echo'deploying'
            }
        }
    }
    
}