pipeline{
    agent any
    tools{
    maven 'maven-3.8.3'
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
        sh 'mvn clean compile'
       /*build quietPeriod: 5, job: 'Test1'*/
            }
        }
        stage("test"){
            steps{
        echo'testing'
        /*Sonarqube*/
            }
        }
        stage("deploy"){
            steps{
        echo'deploying'
            }
        }
    }
    
}