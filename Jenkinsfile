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
        sh 'mvn clean package'
       /*build quietPeriod: 5, job: 'Test1'*/
            }
        }
        stage("test"){
            steps{
        	echo'testing'
        	sh 'mvn test'
        	/*Sonarqube*/
            }
            post{
                always {
                    junit "**/target/surfire-reports/TEST-*.xml"
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