pipeline{
    agent any
    tools{
    /*maven*/
    }
    
    stages{
		stage("checkout"){
            steps{
        echo'checking out'
        /*checkout scm*/
        /*git 'https://github.com/SoSp17/Test.git'*/
            }
        }
        stage("build"){
            steps{
        echo'building'
        /*sh 'mvn clean compile'*/
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