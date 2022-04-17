pipeline {
    agent any

    stages 
    {
        stage ('Build') {
            steps {
                sh ''' . /etc/environment
                cd Scientific-Calculator/
                mvn clean install'''
            }
        }
        stage('Docker Image')
        {
            steps{
                script{
                    imageName = docker.build "ayushmishra1208/scientific-calculator"
                }
            }
        }
        stage('Push Docker Image')
        {
            steps{
                script{
                    withDockerRegistry(credentialsId: 'c0adbedd-2953-4e4c-99b5-ba2d7e44eb9e', url: 'docker.io/ayushmishra1208/scientific-calculator') {
                        imageName.push()
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