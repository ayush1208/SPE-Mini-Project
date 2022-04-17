pipeline {
    agent any
    environment{
        image=''
    }
    stages 
    {
        stage ('Build')
        {

            steps
            {
                sh ' . /etc/environment'
            }
            
            dir("Scientific-Calculator/")
            {
                    sh 'mvn clean install'
            }
        }
        stage('Docker Image')
        {
            steps{
                script{
                    image = docker.build "ayushmishra1208/scientific-calculator"
                }
            }
        }
        stage('Push Docker Image')
        {
            steps{
                script{
                    withDockerRegistry(credentialsId: 'c0adbedd-2953-4e4c-99b5-ba2d7e44eb9e', url: 'docker.io/ayushmishra1208/scientific-calculator') {
                        image.push()
                    }
                }
            }
        }
        stage('Ansible') {
            steps {
                ansiblePlaybook limit: 'ayushvm', inventory: 'inventory', playbook: 'playbook.yaml'
            }    
        }
    }
}