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
            }
        }
        
        stage("test"){
            steps{
        	echo'testing'
        	sh 'mvn test'
 			junit '**/target/surefire-reports/TEST-*.xml'
 			/*der Dateipfad kann hier angepasst werden ,jenachdem wo die Testergebnisse liegen*/     
 			}

        }
        
        /*Code um die SoanrQube anlyse anzustossen*/
        stage("SonarQube Analysis") {
        	steps{
        	withSonarQubeEnv('SonarQube') {
        	/*SonarQube ist der Name der in Jenkins für die SonarQube Instanz vergeben wurde*/ 
        	sh "mvn clean verify sonar:sonar"
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